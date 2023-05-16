package RegisterandLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
/**
 * Servlet implementation class Registerservlet
 */
//@WebServlet("/Registerservlet")
public class Registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		System.out.println("Hello");
		System.out.println(request.getServletContext());
		System.out.println(request.getServletPath());
		System.out.println(response.getStatus());
		System.out.println(request.getContentLength());
//		System.out.println(request.getContentType());
//		System.out.println(request.getContextPath());
		//request.getRequestDispatcher("Registrationform.html").include(request, response);
		ServletContext context = getServletContext();
		String fname = context.getInitParameter("Uttej");
		System.out.println("Uttej "+fname);
		
		context.setAttribute("uttej", "Cheedalla");
		String surname = (String)context.getAttribute("uttej");
		pw.println("Welcome to "+surname);
		
//		context.setAttribute("Narahari", request.getParameter("Uttej"));
//		String fathername = (String) context.getAttribute("Uttej");
//		System.out.println("Narahari "+fathername);
		
		System.out.println(request.getServerName());
		String name = request.getParameter("username");
		String age = request.getParameter("Age");
		String email = request.getParameter("Email");
		String password = request.getParameter("password");
		
		
		
		if(name.isEmpty() || age.isEmpty() || email.isEmpty() || password.isEmpty()) {
			request.getRequestDispatcher("Registrationform.html").include(request, response);
			pw.println("Fill out all the fields");
		}else {
			//request.getRequestDispatcher("login.html").forward(request, response);
			Cookie ck = new Cookie("name", name);
			response.addCookie(ck);
			response.sendRedirect("login.html");
		}
		pw.close();
	}	
}