package com.ks.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ks.model.DAO;
import com.ks.model.MemberVO;

/**
 * Servlet implementation class JoinService
 */
@WebServlet("/Join.do")
public class JoinService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//회원 정보를 가져와서
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String admin = request.getParameter("admin");
		
		//회원 객체화(MemberVO)한 후
		MemberVO member = new MemberVO(userid, pwd, name, email, phone, Integer.parseInt(admin));
	
		//DAO 객체 생성 member 테이블에 삽입하기 위한 join() 호출
		DAO dao = new DAO();
		int count = dao.join(member);
		
		if(count > 0) {
			//테이블에 데이터 삽입 성공
			request.setAttribute("userid", userid);
		}else {
			//데이터 삽입 실패
			
		}
		RequestDispatcher disp = request.getRequestDispatcher("login.jsp");
		disp.forward(request, response);
	}

}
