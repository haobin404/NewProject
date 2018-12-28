package com.two.bean;

public class PersonalBean {
private int uid;
private String pNname;
private String psign;
private String phobby;
private String purl;
public PersonalBean(int uid, String pNname, String psign, String phobby, String purl) {
	super();
	this.uid = uid;
	this.pNname = pNname;
	this.psign = psign;
	this.phobby = phobby;
	this.purl = purl;
}
public PersonalBean() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "PersonalBean [uid=" + uid + ", pNname=" + pNname + ", psign=" + psign + ", phobby=" + phobby + ", purl="
			+ purl + "]";
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getpNname() {
	return pNname;
}
public void setpNname(String pNname) {
	this.pNname = pNname;
}
public String getPsign() {
	return psign;
}
public void setPsign(String psign) {
	this.psign = psign;
}
public String getPhobby() {
	return phobby;
}
public void setPhobby(String phobby) {
	this.phobby = phobby;
}
public String getPurl() {
	return purl;
}
public void setPurl(String purl) {
	this.purl = purl;
};

}
