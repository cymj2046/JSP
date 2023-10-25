package com.ks.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ks.beans.Member;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글 인코딩 방식 지정
		request.setCharacterEncoding("UTF-8");
		
		//회원 데이터 가져오기
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		
		//Member 객체 생성하고 회원 데이터 저장
		Member member = new Member();
		
		member.setName(name);
		member.setPwd(pwd);
		member.setEmail(email);
		
		//request 객체 member 객체 저장
		request.setAttribute("member", member);
		
		//view Page로 이동하기
		RequestDispatcher disp = request.getRequestDispatcher("memberView.jsp");
		disp.forward(request, response);
		
		
		
		
	}

}
