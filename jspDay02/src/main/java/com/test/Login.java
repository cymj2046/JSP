package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//웹브라우저가 전송한 데이터의 값을 가지고 올 때 사용하는 방법
		// getParameter(name) -> name: 입력양식의 name에 지정한 값과 동일해야 함
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		
		//콘솔창에 값 출력하기
		System.out.println("email: " + email + "/pwd: " + pwd);
		//response  객체로부터 PrintWriter 객체 얻어오기
 		PrintWriter out = response.getWriter();
 		//PrintWriter 객체에서 제공하는 출력 메소드(print)이용해서 HTML 문서 생성하기
 		out.print("<html><head><title> 로그인 응답 </title></head><body>");
 		//<body>안에 출력 내용 만들기
 		out.print("email: " + email + "<br>pwd: " + pwd);
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
