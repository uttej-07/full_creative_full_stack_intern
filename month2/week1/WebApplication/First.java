import java.io.*;
import javax.servlet.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class First implements Servlet {
	ServletConfig config = null;
	
	@Override
	public void init(ServletConfig config) {
		this.config = config;
		System.out.println("Servlet is initialized");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException{
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>hello simple servlet</b>");
		out.print("</body></html>");
	}
	
	@Override
	public void destroy() {
		System.out.println("Servlet is destroyed");
	}
	
	@Override
	public ServletConfig getServletConfig() {
		return config;
	}
	
	@Override
	public String getServletInfo() {
		return "hello";
	}
}
