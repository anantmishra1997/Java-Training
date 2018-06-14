package mypack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class Loginlogin extends ActionSupport implements ServletRequestAware {
	
	HttpServletRequest request;

	@Override
	public void setServletRequest(HttpServletRequest r) {
		request=r;
	}
	String username,password;

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
	
	public String execute() {
		if(username.trim().equals("")) {
			this.addActionError("username is required");
			return (ERROR);
		}
		HttpSession hs= request.getSession(true);
		User1 u1=new User1();
		u1.setUsername(username);
		u1.setPassword(password);
		
		hs.setAttribute("User", u1);
		return(SUCCESS);
	}
}
