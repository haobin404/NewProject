package com.two.bean;

import java.util.Date;

public class OrderBean {
private int ordid;
private String ordnumber;
private String ordstate;
private Date orddate;
private String simg;
private double sumprice;
private int uid;
public int getOrdid() {
	return ordid;
}
public void setOrdid(int ordid) {
	this.ordid = ordid;
}
public String getOrdnumber() {
	return ordnumber;
}
public void setOrdnumber(String ordnumber) {
	this.ordnumber = ordnumber;
}
public String getOrdstate() {
	return ordstate;
}
public void setOrdstate(String ordstate) {
	this.ordstate = ordstate;
}
public Date getOrddate() {
	return orddate;
}
public void setOrddate(Date orddate) {
	this.orddate = orddate;
}
public String getSimg() {
	return simg;
}
public void setSimg(String simg) {
	this.simg = simg;
}
public double getSumprice() {
	return sumprice;
}
public void setSumprice(double sumprice) {
	this.sumprice = sumprice;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
@Override
public String toString() {
	return "OrderBean [ordid=" + ordid + ", ordnumber=" + ordnumber + ", ordstate=" + ordstate + ", orddate=" + orddate
			+ ", simg=" + simg + ", sumprice=" + sumprice + ", uid=" + uid + "]";
}
public OrderBean() {
	super();
	// TODO Auto-generated constructor stub
}
public OrderBean(int ordid, String ordnumber, String ordstate, Date orddate, String simg, double sumprice, int uid) {
	super();
	this.ordid = ordid;
	this.ordnumber = ordnumber;
	this.ordstate = ordstate;
	this.orddate = orddate;
	this.simg = simg;
	this.sumprice = sumprice;
	this.uid = uid;
}

}
