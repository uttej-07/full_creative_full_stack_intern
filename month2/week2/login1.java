package RegisterandLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login1
 */
//@WebServlet("/login1")
public class login1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();

		Cookie ck[] = request.getCookies();
		String name1 = "";
		if (ck != null) {
			// String name1 = ck[0].getValue();
			for (int i = 0; i < ck.length; i++) {
				if (ck[i].getName().equals("username")) {
					name1 = ck[i].getValue();
					//System.out.print(ck[i].getName());
				}
			}
			pw.print("Welcome " + name1);
		}
	}
}
