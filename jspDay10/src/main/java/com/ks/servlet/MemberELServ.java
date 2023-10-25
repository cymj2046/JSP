package com.ks.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ks.model.Member;

/**
 * Servlet implementation class MemberELServ
 */
@WebServlet("/MemberELServ")
public class MemberELServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberELServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//회원 정보 데이터 가져오기
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String food = request.getParameter("food");
		String[] interest = request.getParameterValues("interest");
		String color = request.getParameter("color");
		String date = request.getParameter("date");
		
		//Member 객체 생성과 동시에 값 저장하기
		Member member = new Member(name, id, pwd, email, gender, food, interest, color, date);
		
		//값을 출력하기 위해서 view Page로 이동
		//1. request 객체에 값을 저장
		request.setAttribute("member", member);
		
		//2. RequestDispatcher 객체 생성, viewPage url 지정, forward
		RequestDispatcher disp = request.getRequestDispatcher("memberELView.jsp");
		disp.forward(request, response);
	}

}
