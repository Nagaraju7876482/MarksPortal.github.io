package nothing;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CustomRepository;
@WebServlet("/siu")
public class C extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int s=Integer.parseInt( req.getParameter("phone"));

		CustomRepository c=new CustomRepository();
		try {
			ResultSet s1=c.StudentMarksById(s);
			if(s1.next()) {
			Cookie cookie = new Cookie("id",s1.getInt(1)+"");
			Cookie cookie1 = new Cookie("name",s1.getString(2));
			Cookie cookie2 = new Cookie("telugu",s1.getString(3));
			Cookie cookie3 = new Cookie("hindhi",s1.getString(4));
			Cookie cookie4 = new Cookie("maths",s1.getString(5));
			Cookie cookie5 = new Cookie("science",s1.getString(6));
			Cookie cookie6 = new Cookie("social",s1.getString(7));
			res.addCookie(cookie);
			res.addCookie(cookie1);
			res.addCookie(cookie2);
			res.addCookie(cookie3);
			res.addCookie(cookie4);
			res.addCookie(cookie5);
			res.addCookie(cookie6);
			
res.sendRedirect("NewFile.jsp");}
			else {
				res.sendRedirect("NewFile1.jsp");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
