package com.two.bean;

public class ShopCartBean {
private int scid;
private String sname;
private String simg;
private String svname;
private String svprice;
private String scolor;
private int uid;
public String getScolor() {
	return scolor;
}
public void setScolor(String scolor) {
	this.scolor = scolor;
}

public int getScid() {
	return scid;
}
public void setScid(int scid) {
	this.scid = scid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSimg() {
	return simg;
}
public void setSimg(String simg) {
	this.simg = simg;
}
public String getSvname() {
	return svname;
}
public void setSvname(String svname) {
	this.svname = svname;
}
public String getSvprice() {
	return svprice;
}
public void setSvprice(String svprice) {
	this.svprice = svprice;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
@Override
public String toString() {
	return "ShopCartBean [scid=" + scid + ", sname=" + sname + ", simg=" + simg + ", svname=" + svname + ", svprice="
			+ svprice + ", uid=" + uid + "]";}

public ShopCartBean(String sname, String simg, String svname, String svprice, String scolor, int uid) {
	super();
	this.sname = sname;
	this.simg = simg;
	this.svname = svname;
	this.svprice = svprice;
	this.scolor = scolor;
	this.uid = uid;
}
public ShopCartBean() {
	super();
	// TODO Auto-generated constructor stub
}

}
