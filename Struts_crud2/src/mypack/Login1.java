package mypack;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class Login1 extends ActionSupport implements ServletRequestAware {
	HttpServletRequest request;

	public void setServletRequest(HttpServletRequest r) {
		request = r;
	}

	String username, password;
	String id;

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

	public String execute() {
		try {
			Connection con = MyConnection.getConnection();
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(
					"select * from STRUTSEXAMPLE where username='" + username + "' and password='" + password + "'");
			if (rs.next()) {
				return "success";
			} else {
				return "error";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}

	}

	public String del() {
		try {
			ArrayList l1 = new ArrayList();
			Connection con = MyConnection.getConnection();
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery("select * from login");
			while (rs.next()) {
				User u = new User();
				u.setId(rs.getString("id"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));

				l1.add(u);
				request.setAttribute("mydata", l1);
			}
			request.setAttribute("mydata", l1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";

	}

	public String del1() {
		try {
			Connection con = MyConnection.getConnection();
			Statement stat = con.createStatement();
			stat.executeUpdate("delete from login where id='" + request.getParameter("u") + "'");
			del();
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
}
