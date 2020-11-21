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
	    //获取商品编号参数
		String gids=req.getParameter("gid");
		int gid=Integer.parseInt(gids);
		System.out.println("要删除的商品编号是："+gid);
		
		//调用数据库删除
		GoodsDao dao=new GoodsDao();
		dao.delete(gid);
		
		//重定向到查询商品的servlet
		resp.sendRedirect("GoodsSelect");
	}

}
