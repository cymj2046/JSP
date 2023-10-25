package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Star
 */
@WebServlet("/Star")
public class Star extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Star() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String bgColor = request.getParameter("bgColor");
		int count = Integer.parseInt(request.getParameter("count"));
		
		PrintWriter out = response.getWriter();
		out.print("<body><table border>");
		
		for(int i=1; i<=count; i++) {
			out.print("<tr>");
			for(int j=1; j<=i; j++) {
				if(i%2==1) {
				out.print("<td style=\"background:" + bgColor +"\">*</td>");
			}else {
				out.print("<td>*</td>");
			}
		}
			out.print("</tr>");
	}
	out.print("</table></body>");
}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
