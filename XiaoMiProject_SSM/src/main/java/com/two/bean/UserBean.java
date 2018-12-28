package com.two.bean;

public class UserBean {
private int uid;
private String uname;
private String upassword;
private String uphone;
private String uemail;
private int tid;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	
	this.uid = uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpassword() {
	return upassword;
}
public void setUpassword(String upassword) {
	this.upassword = upassword;
}
public String getUphone() {
	return uphone;
}
public void setUphone(String uphone) {
	this.uphone = uphone;
}
public String getUemail() {
	return uemail;
}
public void setUemail(String uemail) {
	this.uemail = uemail;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
@Override
public String toString() {
	return "User [uid=" + uid + ", uname=" + uname + ", upassword=" + upassword + ", uphone=" + uphone + ", uemail="
			+ uemail + ", tid=" + tid + "]";
}
public UserBean(int uid, String uname, String upassword, String uphone, String uemail, int tid) {
	super();
	this.uid = uid;
	this.uname = uname;
	this.upassword = upassword;
	this.uphone = uphone;
	this.uemail = uemail;
	this.tid = tid;
}
public UserBean() {
	super();
	// TODO Auto-generated constructor stub
}

}
