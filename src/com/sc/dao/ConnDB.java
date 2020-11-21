package com.sc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Driver;

public class ConnDB {
	
	//��ʼʵ�ִ�������
	Connection conn1 =null;
	Statement stat1 = null;
	ResultSet rs1 = null;
	
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/db190506";
	String name="root";
	String pass="root";
	
	//��һ��
	public void getConnDB(){
		//1��ע��mysql���ݿ�������
		try {
			Class.forName(driver);
			System.out.println("ע��������ɹ�");
		    conn1=DriverManager.getConnection(url, name, pass);
		    System.out.println("���ݿ����ӳɹ�");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ע��������ʧ��");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
	}
	
	//�ڶ�������ɾ��
	public void execute(String sql){
		try {
			stat1 = conn1.createStatement();
			stat1.executeUpdate(sql);
			System.out.println("ִ�����ݳɹ�");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ִ�����ݿ�ʧ��");
		}
	}
	
	//�ڶ�������ѯ
	public ResultSet select(String sql){
		try {
			stat1 = conn1.createStatement();
			rs1 = stat1.executeQuery(sql);
			System.out.println("��ԃ���ݿ�ɹ�");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("��ԃ���ݿ�ʧ��");
		}
		return rs1;
	}
	
	//������
	public void close(){
		try {
			if(rs1!=null&&!rs1.isClosed()){
				rs1.close();
			}
			if(stat1!=null&&!stat1.isClosed()){
				stat1.close();
			}
			if(conn1!=null&&!conn1.isClosed()){
			  conn1.close();
			}
			System.out.println("�ر�������Դ�ɹ�");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ر�������Դʧ��");
		}
		
	}
	
}
