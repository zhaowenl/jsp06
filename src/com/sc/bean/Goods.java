package com.sc.bean;

public class Goods {
	
	private int gid;      //��Ʒ���
	private String gname; //��Ʒ����
	private float gprice; //��Ʒ�۸�
	private String gimg;  //��ƷͼƬ
	private int gnum;     //��������
	private int gstock;   //�������
	
    //�޲ι��캯��
	public Goods() {
		super();
	}

	//ȫ�ι��캯��
	public Goods(int gid, String gname, float gprice, String gimg, int gnum, int gstock) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gprice = gprice;
		this.gimg = gimg;
		this.gnum = gnum;
		this.gstock = gstock;
	}

	//set��get����
	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public float getGprice() {
		return gprice;
	}

	public void setGprice(float gprice) {
		this.gprice = gprice;
	}

	public String getGimg() {
		return gimg;
	}

	public void setGimg(String gimg) {
		this.gimg = gimg;
	}

	public int getGnum() {
		return gnum;
	}

	public void setGnum(int gnum) {
		this.gnum = gnum;
	}

	public int getGstock() {
		return gstock;
	}

	public void setGstock(int gstock) {
		this.gstock = gstock;
	}
	
	

	
}
