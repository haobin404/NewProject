package com.two.bean;

public class ShopVersionBean {
private int svid;
private String svname;
private double svprice;
public int getSvid() {
	return svid;
}
public void setSvid(int svid) {
	this.svid = svid;
}
public String getSvname() {
	return svname;
}
public void setSvname(String svname) {
	this.svname = svname;
}
public double getSvprice() {
	return svprice;
}
public void setSvprice(double svprice) {
	this.svprice = svprice;
}
@Override
public String toString() {
	return "ShopVersionBean [svid=" + svid + ", svname=" + svname + ", svprice=" + svprice + "]";
}
public ShopVersionBean(int svid, String svname, double svprice) {
	super();
	this.svid = svid;
	this.svname = svname;
	this.svprice = svprice;
}
public ShopVersionBean() {
	super();
	// TODO Auto-generated constructor stub
}

}
