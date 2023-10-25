package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WantJob
 */
@WebServlet("/WJ")
public class WantJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WantJob() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트의 데이터 가져오기(한글 포함됨->request의 인코딩 방식 지정)
		request.setCharacterEncoding("utf-8");
		// 데이터 가져오기
		String job = request.getParameter("job");
		// 여러 값을 동시에 가져오기
		String [] jobs = request.getParameterValues("job");
		
		// response 객체 만들기(한글 포함됨)
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("<p>원하는 직업은 "+ job +"</p>");
		
		for(String j:jobs) {
			out.print(j + "  ");
		}
		out.print("</body></html>");
	}

}
