package com.sc.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sc.bean.Goods;
import com.sc.dao.GoodsDao;

@WebServlet("/GoodsSelect")
public class GoodsSelect  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
        //����dao����ѯ���ݿ�
		GoodsDao dao=new GoodsDao();
		ArrayList<Goods> list=new ArrayList<Goods>();
		try {
			list= dao.select();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�Ѽ������õ�request����
		req.setAttribute("list", list);
		//��servlet�У�ת���Ĵ���
		req.getRequestDispatcher("goodsselect.jsp").forward(req, resp);
	}

}
