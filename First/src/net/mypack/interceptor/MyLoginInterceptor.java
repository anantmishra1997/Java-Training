package net.mypack.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyLoginInterceptor implements Interceptor{

	String result=null;
	String className=null;
	long startingTime=0;
	long endingTime=0;
	
	final HttpServletRequest request=(HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);

	@Override
	public void destroy() {
		System.out.println("Destroying Interceptor");
	}

	@Override
	public void init() {
		System.out.println("Initializing Interceptor");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		className=invocation.getAction().getClass().getName();
		startingTime=System.currentTimeMillis();
		System.out.println("Interceptor Starting Time="+new Date(startingTime));
		result=invocation.invoke();
		System.out.println(result);
		endingTime=System.currentTimeMillis();
		System.out.println("Ending time"+new Date(endingTime));
	    System.out.println("Time Taken"+(endingTime-startingTime));
		return result;
	}
	
	
}
