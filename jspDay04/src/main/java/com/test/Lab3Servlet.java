package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lab3Servlet
 */
@WebServlet("/Lab3")
public class Lab3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lab3Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request 객체 한글 인코딩
		request.setCharacterEncoding("utf-8");
		// 데이터 가져오기
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String pwd2 = request.getParameter("pwd2");
		String gender = request.getParameter("gender");
		String blood = request.getParameter("blood");
		String birth = request.getParameter("birth");
		String [] hobbies = request.getParameterValues("hobby");
		String color = request.getParameter("color");
		String message = request.getParameter("message");
				
		
		// response 객체 한글 인코딩
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("아이디: "+ id +"<br>");
		out.print("비밀번호: "+ pwd +"<br>");
		// 비밀번호 확인 메시지 출력
		if(!pwd.equals(pwd2)) {
			out.print("비밀번호가 일치하지 않습니다.<br>");
		}
		
		out.print("성별: "+ gender +"<br>");
		out.print("혈액형: "+ blood +"<br>");
		out.print("생일: "+ birth +"<br>");
		// 취미 복수개값 처리 -> 출력
		out.print("취미: ");
		for(String hobby:hobbies) {
			out.print(hobby +" ");
		}
		out.print("<br>");
		out.print("좋아하는 색: "+ color +"<br>");
		out.print("남기고 싶은 말: "+ message);
		out.print("</body></html>");
		
	}

}
