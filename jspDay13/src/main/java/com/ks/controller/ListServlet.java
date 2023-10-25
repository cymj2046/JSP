package com.ks.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ks.dao.MemberDAO;
import com.ks.dto.MemberVO;


/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/List.do")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Session 객체 생성하고 memberList를 세션 객체에 저장하기
		HttpSession session = request.getSession();
				
		//현재 서비스는 회원들에게만 제공됨 -> 세션 객체에 세션 정보가 있는지 확인
		if(session.getAttribute("loginUser")!=null) {
			//데이터 엑세스 객체 생성
			MemberDAO dao = MemberDAO.getInstance();
			List<MemberVO> memberList = dao.getMembers();
					
			session.setAttribute("list", memberList);
					
			response.sendRedirect("ListView.jsp");
		}else {
			response.sendRedirect("join.jsp");
		}
	}

}
