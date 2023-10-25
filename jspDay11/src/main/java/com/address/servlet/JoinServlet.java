package com.address.servlet;

import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/Join.do")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    Connection conn = null;
    PreparedStatement pstmt = null;
    String url = "jdbc:mysql://localhost:3306/memberdb?useUnicode=true&characterEncoding=utf-8";
    String uid = "root";
    String pass = "mysql";
    String sql = "insert into member values(?, ?, ?, ?, ?, ?)";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinServlet() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String admin = request.getParameter("admin");
		
		int result = 0;
		try {
			//(1 단계) JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			//(2 단계) 데이터베이스 연결 객체인 Connection 생성
			conn = DriverManager.getConnection(url, uid, pass);
			//(3 단계) Statement 객체 생성하기
			pstmt = conn.prepareStatement(sql);
			//(4 단계) 바인딩 변수를 채운다.
			pstmt.setString(1, name);
			pstmt.setString(2, userid);
			pstmt.setString(3, pwd);
			pstmt.setString(4, email);
			pstmt.setString(5, phone);
			pstmt.setInt(6, Integer.parseInt(admin));
			
			//(5단계) SQL문을 실행하여 결과 처리
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//(6단계) 사용한 리소스 해제
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//finally의 끝
		
		if(result!=0) {
			//view page로 forwarding
			request.setAttribute("name", name);
			request.setAttribute("userid", userid);
			request.setAttribute("pwd", pwd);
			request.setAttribute("email", email);
			request.setAttribute("phone", phone);
			request.setAttribute("admin", admin);
			request.setAttribute("result", result);
			
			RequestDispatcher disp = request.getRequestDispatcher("addMember2.jsp");
			disp.forward(request, response);
		}else {
			request.setAttribute("result", result);
			RequestDispatcher disp = request.getRequestDispatcher("addMember2.jsp");
			disp.forward(request, response);
		}
		
	}

}
