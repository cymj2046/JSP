package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fruit
 */
@WebServlet("/Fruit")
public class Fruit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fruit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트 전송 데이터 가져오기
		String fruit = request.getParameter("fruit"); // 한개의 데이터만 리턴
		
		// 복수 개의 데이터를 가져오기 getParameterValue()
		String[] fruits = request.getParameterValues("fruit");
		
		// response 메시지 만들기
		// 1. 문서형식, 한글인코딩 방식 지정
		response.setContentType("text/html; charset=utf-8");
		// 2. 출력객체(PrintWriter)얻기
		PrintWriter out = response.getWriter();
		// 3. 내용 출력
		out.print("<html><body>");
		// out.print("좋아하는 과일: " + fruit);
		// 복수 개의 과일 데이터(배열 저장됨)를 출력
		for(int i=0; i<fruits.length; i++) {
			out.print("좋아하는 과일: " + fruits[i] +"<br>");
		}
		out.print("</body></html>");
		
	}

}
