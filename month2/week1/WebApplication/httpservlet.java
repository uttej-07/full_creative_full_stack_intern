import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;

public class httpservlet extends HttpServlet{

//   public void service(HttpServletRequest req, HttpServletResponse res) th	
//}

@Override
protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	super.doDelete(req, resp);
}

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	System.out.println("Do get method");
	//super.doGet(req, resp);
}

@Override
protected void doHead(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	// TODO Auto-generated method stub
	super.doHead(arg0, arg1);
}

@Override
protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	// TODO Auto-generated method stub
	super.doOptions(arg0, arg1);
}

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	System.out.println(" Do post method");
	//super.doPost(req, resp);
}

@Override
protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	super.doPut(req, resp);
}

@Override
protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	// TODO Auto-generated method stub
	super.doTrace(arg0, arg1);
}

@Override
protected long getLastModified(HttpServletRequest req) {
	// TODO Auto-generated method stub
	return super.getLastModified(req);
}

@Override
public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
	// TODO Auto-generated method stub
	arg1.setContentType("text/html");
	PrintWriter pw = arg1.getWriter();
	pw.print("<html><body>");
	pw.print("<h1>Hello World</h1>");
	pw.print("</body></html>");
	super.service(arg0, arg1);
}
}
