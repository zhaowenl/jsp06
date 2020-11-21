package com.sc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sc.dao.GoodsDao;

@WebServlet("/GoodsDelete")
public class GoodsDelete extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    //��ȡ��Ʒ��Ų���
		String gids=req.getParameter("gid");
		int gid=Integer.parseInt(gids);
		System.out.println("Ҫɾ������Ʒ����ǣ�"+gid);
		
		//�������ݿ�ɾ��
		GoodsDao dao=new GoodsDao();
		dao.delete(gid);
		
		//�ض��򵽲�ѯ��Ʒ��servlet
		resp.sendRedirect("GoodsSelect");
	}

}
