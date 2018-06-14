package mypack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class Logout extends ActionSupport implements ServletRequestAware {
	
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
		HttpSession hs=request.getSession(true);
		hs.invalidate();
		return(SUCCESS);
	}
}