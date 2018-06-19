package net.mypack.model;

public class LoginModel {

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String displayForm() {
		System.out.println("Ok Then!");
		return "input";
	}
}
