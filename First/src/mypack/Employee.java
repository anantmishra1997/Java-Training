package mypack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class Employee extends ActionSupport implements ServletRequestAware {
	
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
		User1 u1=(User1)hs.getAttribute("User");
		if(u1==null) {
			this.addActionError("Login Required");
			return(ERROR);
		}
		else {
			if(u1.username.equals("admin")) {
				this.addActionError("You are authorized");
			}
			else {
				this.addActionError("Sorry not Authorized");
			}
		}
		return(SUCCESS);
	}
	}
