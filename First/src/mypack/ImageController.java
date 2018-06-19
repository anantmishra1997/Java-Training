package mypack;

import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.PreparedStatement;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class ImageController extends ActionSupport implements ServletRequestAware{

	HttpServletRequest request;
	int id;
	File myfile;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			conn c1=new conn();
			upload();
			
			if(base64.equals(null)) {
				System.out.println("base64 is null");
			}
			
			else {
				
				String query= "insert into myimage values(null,'"+base64+"')";
				PreparedStatement ps=c1.c.prepareStatement(query);
				ps.executeUpdate();
				System.out.println(query);
		}
		}
		catch(Exception e) {
			this.addActionError("Exception"+e);
			return "error";
		}
		return "success";
	}
	String base64="";
	
	private void upload() {
		BufferedImage image=null;
		try {
			image=ImageIO.read(myfile);
			base64=Convert.encodeToString(image,"jpg");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setServletRequest(HttpServletRequest hsr) {
		request=hsr;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public File getMyfile() {
		return myfile;
	}

	public void setMyfile(File myfile) {
		this.myfile = myfile;
	}

	public String getBase64() {
		return base64;
	}

	public void setBase64(String base64) {
		this.base64 = base64;
	}
	
	
	
}
