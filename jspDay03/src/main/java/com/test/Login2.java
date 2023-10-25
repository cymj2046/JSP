package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login2
 */
@WebServlet("/Login2")
public class Login2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//post방식으로 전송 데이터 가져올 때에는 한글 인코딩 방식을 미리 지정한다.
		request.setCharacterEncoding("utf-8");
		//request 객체의 데이터 분리하기
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		
		//response 객체에 포함된 한글 인코딩 방식 지정
		response.setContentType("text/html; charset=utf-8");
		
		//출력 객체 얻기
		PrintWriter out = response.getWriter();
		
		//데이터 출력하기
		out.print("<html><body>");
		out.print("이메일: " + email+ "<br>");
		out.print("비밀번호: " + pwd+ "<br>");
		out.print("이름: " + name + "<br>");
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
