package servletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(
		description = "A Simple Servlet Project", 
		urlPatterns = { 
				"/SimpleServlet", 
				"/SimpleServletPath"
		})
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("In GET method of servlet");
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("userName");
		writer.println("In GET method and displaying HTML message as Hello " + userName);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("In POST method of servlet");
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("userName");
		writer.println("In POST method and displaying HTML message as Hello " + userName);
	}

}
