package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.beans.LoginBean;
import com.beans.LoginBean2;

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
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 한글 인코딩 방식
		request.setCharacterEncoding("utf-8");
		
		//2. 로그인 정보를 가져오기(request 객체로부터)
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		//3. 객체 생성
		LoginBean2 lb = new LoginBean2(); //id=smart, pwd=1234
		
		//4. 객체 비교 메소드 호출
		boolean ok = lb.checkUser(id, pwd);
		String url = "";
		
		//session 객체 생성
		 HttpSession session = request.getSession();
		
		if(ok) {
			//승인 성공
			session.setAttribute("id", id);
			url = "./appEx02/main.jsp";
			RequestDispatcher disp = request.getRequestDispatcher(url);
			disp.forward(request, response);
		}else {
			//승인 실패 -> loginForm.jsp로 이동
			url = "./appEx02/loginForm.jsp";
			RequestDispatcher disp = request.getRequestDispatcher(url);
			disp.forward(request, response);
		}
		
	}

}
