package com.sc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sc.bean.Goods;

public class GoodsDao {
	
	ConnDB db=new ConnDB();
	
	//��ѯ����
	public ArrayList<Goods> select() throws SQLException{
		ArrayList<Goods> list=new ArrayList<Goods>();
		
		//���ݿ������ʼ
		//1����һ��
		db.getConnDB();
		//2���ڶ���
		String sql="select * from goods";
		ResultSet rs = db.select(sql);
		while(rs!=null&&rs.next()){
			//ȡһ����Ʒ��Ϣ����װ����Ʒ����
			Goods g=new Goods(rs.getInt("gid"), 
					rs.getString("gname"), 
					rs.getFloat("gprice"), 
					rs.getString("gimg"), 
                    rs.getInt("gnum"), 
                    rs.getInt("gstock"));
			list.add(g);//װ�뼯��
		}
		//3��������
		db.close();
		//���ݿ��������
		
		return list;
	}
	
	public void delete(int gid){
		//���ݿ������ʼ
		//1����һ��
		db.getConnDB();
		//2���ڶ���
		String sql="delete from goods where gid="+gid;
		db.execute(sql);
		//3��������
		db.close();
		//���ݿ��������
	}

}
