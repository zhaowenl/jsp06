package com.sc.bean;

public class Goods {
	
	private int gid;      //商品编号
	private String gname; //商品名称
	private float gprice; //商品价格
	private String gimg;  //商品图片
	private int gnum;     //购买数量
	private int gstock;   //库存数量
	
    //无参构造函数
	public Goods() {
		super();
	}

	//全参构造函数
	public Goods(int gid, String gname, float gprice, String gimg, int gnum, int gstock) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gprice = gprice;
		this.gimg = gimg;
		this.gnum = gnum;
		this.gstock = gstock;
	}

	//set、get方法
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
