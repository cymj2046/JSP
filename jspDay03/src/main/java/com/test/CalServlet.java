package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalServlet
 */
@WebServlet("/CalServlet")
public class CalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//데이터 가져오기
		//String num1 = request.getParameter("num1");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		//String num2= request.getParameter("num2");
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String op = request.getParameter("op");
				
		//System.out.print("num1: " + num1);
		//System.out.print("op: " + op);
		//System.out.print("num2: " + num2);
		
		//op에 따른 연산 -> if~else 또는 switch case 이용하기
		int result = 0;
		if(op.equals("+")) {
			result = num1 + num2;
		}else if(op.equals("-")) {
			result = num1 - num2;
		}else if(op.equals("*")) {
			result = num1 * num2;
		}else if(op.equals("/")){
			result = num1 / num2;
		}else {
			
		}
		
		//결과 출력 num1 op num2 = result
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print(num1 + op + num2 +"="+ result);
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
