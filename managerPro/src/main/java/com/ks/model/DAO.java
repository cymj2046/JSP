package com.ks.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	// JDBC 코드 가지는 자료형
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	// 1.DB연결을 위한 메소드
	private void getConn() {
		// 1. 드라이브 동적 로딩
		try {
			Class.forName("com.mysql.jdbc.Driver");

			// 2. DB연결
			String url = "jdbc:mysql://localhost:3306/memberdb?"
				      +"useUnicode=true&characterEncoding=utf-8";
			String id = "root";
			String pw = "mysql";
			conn = DriverManager.getConnection(url, id, pw);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 자원 반납 메소드
	private void getClose() {
		try {  //ctrl+shift+f 자동 정렬 완성
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//3. 회원정보를 데이타베이스에 저장하는 메소드 생성
	
	//public int join(MemberVO vo) {   //joinService.jsp에서 join() 호출할 때 멤버 객체 전달
		//코드 구현



	//}
	
	//검색된 데이터를 모두 돌려주고자 할 경우 MemberVO형으로 return
	public MemberVO login(MemberVO vo) {
		MemberVO result = null;
		try {
			getConn();  //conn 객체 생성
			//조건에 맞는 데이터가 member에 있는지 확인
			String sql = "Select * from member where userid=? and pwd=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPwd());
			
			rs = psmt.executeQuery();
			if(rs.next()) {	//member 테이블에 해당 데이터가 있다면
				//rs에서는 데이터를 꺼낼때
				//커서가 가리키는 데이터만 가져올 수 있다.
				String id = rs.getString("userid");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				int admin = rs.getInt("admin");
				
				result = new MemberVO(id, pwd, name, email, phone, admin);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			getClose();
		}
		return result;
	}
}
