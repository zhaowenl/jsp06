package com.sc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sc.bean.Goods;

public class GoodsDao {
	
	ConnDB db=new ConnDB();
	
	//查询方法
	public ArrayList<Goods> select() throws SQLException{
		ArrayList<Goods> list=new ArrayList<Goods>();
		
		//数据库操作开始
		//1、第一步
		db.getConnDB();
		//2、第二步
		String sql="select * from goods";
		ResultSet rs = db.select(sql);
		while(rs!=null&&rs.next()){
			//取一条商品信息，封装成商品对象
			Goods g=new Goods(rs.getInt("gid"), 
					rs.getString("gname"), 
					rs.getFloat("gprice"), 
					rs.getString("gimg"), 
                    rs.getInt("gnum"), 
                    rs.getInt("gstock"));
			list.add(g);//装入集合
		}
		//3、第三步
		db.close();
		//数据库操作结束
		
		return list;
	}
	
	public void delete(int gid){
		//数据库操作开始
		//1、第一步
		db.getConnDB();
		//2、第二步
		String sql="delete from goods where gid="+gid;
		db.execute(sql);
		//3、第三步
		db.close();
		//数据库操作结束
	}

}
