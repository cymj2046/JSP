package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.spi.FileSystemProvider;

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
		//request 객체로부터 데이터(email, pwd, name) 분리해서 가져오기(getParameter())
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		
		//콘솔창에 데이터를 출력
		System.out.println("email: " + email +"/ pwd: " + pwd +"/ name: " + name);
		
		//html 문서 생성 전에 한글 인코딩 방식 지정하기
		//1단계: response 객체의 한글 인코딩 방식 지정하기
		response.setContentType("text/html; charset=utf-8");
		
		//2단계: response 객체로부터 출력 객체인 PrintWriter를 얻기
		PrintWriter out = response.getWriter();
		
		//3단계: response 객체에 출력값 저장하기
		response.setCharacterEncoding("utf-8");
		out.print("<html><head><title>로그인 정보</title></head><body>");
		//email : email / pwd: pwd / name : name
		out.print("email: " + email +"/ pwd: " + pwd +"/ name: " + name);
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
