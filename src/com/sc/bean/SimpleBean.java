package com.sc.bean;

public class SimpleBean {
	//������
	private String name;
	private boolean vip;
	
	//����������
	private String[] aihao={"��ɽ","����","����"};

	public SimpleBean() {
		super();
	}

	public SimpleBean(String name, boolean vip, String[] aihao) {
		super();
		this.name = name;
		this.vip = vip;
		this.aihao = aihao;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public String[] getAihao() {
		return aihao;
	}

	public void setAihao(String[] aihao) {
		this.aihao = aihao;
	}
	
	public String getAihao(int index) {
		return aihao[index];
	}

	public void setAihao(int index,String s) {
		this.aihao[index] = s;
	}
	

}
