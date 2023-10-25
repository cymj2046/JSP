package com.ks.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//데이터 가져오기
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		//연산
		int result = num1 + num2;
		
		request.setAttribute("num1", num1); //request.num1 = num1
		request.setAttribute("num2", num2);
		request.setAttribute("result", result);
		
		//결과를 forward하기
		RequestDispatcher disp = request.getRequestDispatcher("resultView.jsp");
		disp.forward(request, response);
		
		//출력 객체(out) 얻어오기
		//PrintWriter out = response.getWriter();
		//out.print("<html><body>");
		//out.print(num1 +"+"+ num2 +"="+ result);
		//out.print("</body></html>");
	}

}
