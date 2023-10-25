package com.ks.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ks.dao.MemberDAO;
import com.ks.dto.MemberVO;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/join.do")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JoinServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("join.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//1. 한글 인코딩 지정
		request.setCharacterEncoding("utf-8");
		//2. 회원 정보 가져오기
		String name = request.getParameter("name");
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String admin = request.getParameter("admin");

		//3. 회원 정보로 회원 객체(MemberVO) 객체 생성
		MemberVO mVo = new MemberVO(name, userid, pwd, email, phone, Integer.parseInt(admin));
		
		//4. MemberDAO 객체 생성 MemberDAO.getInstance() 이용
		MemberDAO instance = MemberDAO.getInstance();
		
		//5. 회원 정보 테이블에 추가하는 insertMember() 호출
		int result = instance.insertMember(mVo);
		
		//6. 세션 객체 생성
		HttpSession session = request.getSession();

		//7. 회원가입 여부 판단
		if (result == 1) {
			session.setAttribute("userid", mVo.getUserid());
			request.setAttribute("message", "회원 가입에 성공했습니다.");
		} else {
			request.setAttribute("message", "회원 가입에 실패했습니다.");
		}

		//8. forward();
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	}

}
