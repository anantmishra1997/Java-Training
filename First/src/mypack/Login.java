package mypack;
	import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;
public class Login extends ActionSupport{
	String username,password;
	Connection con;
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
		con=MyConnection.getConnection();
		try {
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery("select * from STRUTSEXAMPLE where username='"+username+"' and password='"+password+"'");
			if(rs.next()) {
				return "success";
			}
			else {
				return "error";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		
		
	}
	
}
