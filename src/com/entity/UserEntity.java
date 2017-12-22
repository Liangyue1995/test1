package com.entity;

public class UserEntity {
private String id;
private String username;
private String password;
private String nickname;
private String ispass;

public String getIspass() {
	return ispass;
}
public void setIspass(String ispass) {
	this.ispass = ispass;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getNickname() {
	return nickname;
}
public void setNickname(String nickname) {
	this.nickname = nickname;
}

public UserEntity(String username, String password, String nickname, String ispass) {
	super();
	this.username = username;
	this.password = password;
	this.nickname = nickname;
	this.ispass = ispass;
}
public UserEntity(String id, String username, String password, String nickname, String ispass) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.nickname = nickname;
	this.ispass = ispass;
}
public UserEntity() {
	super();
	// TODO Auto-generated constructor stub
}

}
