package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath()).append("Hello, Servlet World");
		//System.out.println("Hello, Servlet World!");
		String email = request.getParameter("email");
		
		PrintWriter out = response.getWriter();
		out.write("<html><body>Hello, Servlet<br>");
		out.print("Hello, Servlet2<br><br>");
		out.println("Hello, Servlet3<br>");
		out.print("<p> 클라이언트가 보낸 정보: " + email);
		out.print("<p>ContextPath: " + request.getContextPath() + "</p>");
		out.print("<p>ServletPath: " + request.getServletPath() + "</p>");
		out.print("<p>requestURI: " + request.getRequestURI() + "</p>");
		out.print("<p>requestURL: " + request.getRequestURL() + "</p>");
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
