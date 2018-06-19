package net.mypack.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	ActionContext context=ActionContext.getContext();
	HttpServletRequest request=(HttpServletRequest)context.get(ServletActionContext.HTTP_REQUEST);
	
	HttpSession session;
	
	public String execute() throws Exception{
		return ERROR;	
	}
}
