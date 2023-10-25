package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChangeBGColor
 */
@WebServlet("/MGG")
public class MakeGuguDan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MakeGuguDan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//<body style="background:#00ff00;">Hello</body>
		
		//데이터 가져오기
		String bgColor = request.getParameter("bgColor");
		int dan1 = Integer.parseInt(request.getParameter("dan1"));
		int dan2 = Integer.parseInt(request.getParameter("dan2"));
		
		PrintWriter out = response.getWriter();
		out.print("<body><table style=\"background:" + bgColor +"\">");
		
		for(int i=dan1; i<=dan2; i++) {
			out.print("<tr>");
			for(int j=1; j<=9; j++) {
				out.print("<td>"+ i +"*"+ j +"="+ i*j+"</td>");
			}
			out.print("</tr>");
		}
		out.print("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
