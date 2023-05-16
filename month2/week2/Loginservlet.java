package RegisterandLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginservlet
 */
//@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String email = request.getParameter("email");
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		
		ServletConfig config = getServletConfig();
		String driver = config.getInitParameter("uttej");
		System.out.println("Driver is "+ driver);
		
		ServletContext context = getServletContext();
		String fathername = context.getInitParameter("Narahari");
		System.out.println("Narahari "+fathername);
		
		if(password.equals("servlet")) {
			pw.print("Hello "+ name);
			pw.print("<a href = 'login1'>Details");
			
//			pw.print(email);
//			pw.print(password);
		}else {
			pw.print("Wrong credentials");
			request.getRequestDispatcher("/login.html").include(request, response);
		}
		pw.close();
	}
}
