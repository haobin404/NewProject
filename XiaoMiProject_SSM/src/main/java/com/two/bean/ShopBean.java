package com.two.bean;


public class ShopBean{
private int sid;
private String sname;
private String sintro;
private String simg;
private String scolor;
private double sprice;
private int stid;
public ShopBean(int sid, String sname, String sintro, String simg, String scolor, double sprice, int stid) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sintro = sintro;
	this.simg = simg;
	this.scolor = scolor;
	this.sprice = sprice;
	this.stid = stid;
}
public ShopBean() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "ShopBean [sid=" + sid + ", sname=" + sname + ", sintro=" + sintro + ", simg=" + simg + ", scolor=" + scolor
			+ ", sprice=" + sprice + ", stid=" + stid + "]";
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSintro() {
	return sintro;
}
public void setSintro(String sintro) {
	this.sintro = sintro;
}
public String getSimg() {
	return simg;
}
public void setSimg(String simg) {
	this.simg = simg;
}
public String getScolor() {
	return scolor;
}
public void setScolor(String scolor) {
	this.scolor = scolor;
}
public double getSprice() {
	return sprice;
}
public void setSprice(double sprice) {
	this.sprice = sprice;
}
public int getStid() {
	return stid;
}
public void setStid(int stid) {
	this.stid = stid;
}



}
