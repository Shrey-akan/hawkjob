package com.jobsite.oragejobsite.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long uid;
   private String userName;
   private String userFirstName;
   private String userLastName;
   private String userPassword;
   private String companyuser;
   private String websiteuser;
   private String userphone;
   private String usercountry;
   private String userstate;
   private String usercity;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(Long uid, String userName, String userFirstName, String userLastName, String userPassword,
		String companyuser, String websiteuser, String userphone, String usercountry, String userstate,
		String usercity) {
	super();
	this.uid = uid;
	this.userName = userName;
	this.userFirstName = userFirstName;
	this.userLastName = userLastName;
	this.userPassword = userPassword;
	this.companyuser = companyuser;
	this.websiteuser = websiteuser;
	this.userphone = userphone;
	this.usercountry = usercountry;
	this.userstate = userstate;
	this.usercity = usercity;
}
public Long getUid() {
	return uid;
}
public void setUid(Long uid) {
	this.uid = uid;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserFirstName() {
	return userFirstName;
}
public void setUserFirstName(String userFirstName) {
	this.userFirstName = userFirstName;
}
public String getUserLastName() {
	return userLastName;
}
public void setUserLastName(String userLastName) {
	this.userLastName = userLastName;
}
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
public String getCompanyuser() {
	return companyuser;
}
public void setCompanyuser(String companyuser) {
	this.companyuser = companyuser;
}
public String getWebsiteuser() {
	return websiteuser;
}
public void setWebsiteuser(String websiteuser) {
	this.websiteuser = websiteuser;
}
public String getUserphone() {
	return userphone;
}
public void setUserphone(String userphone) {
	this.userphone = userphone;
}
public String getUsercountry() {
	return usercountry;
}
public void setUsercountry(String usercountry) {
	this.usercountry = usercountry;
}
public String getUserstate() {
	return userstate;
}
public void setUserstate(String userstate) {
	this.userstate = userstate;
}
public String getUsercity() {
	return usercity;
}
public void setUsercity(String usercity) {
	this.usercity = usercity;
}
   
   
   

}
