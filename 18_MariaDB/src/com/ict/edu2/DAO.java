package com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

// DAO : Data Access Object
//  - DataBase의 data에 접근하기 위한 객체
//  - CRUD 작업(insert, update, delete, select)
//   을 처리하는 메소드를 만들어서 제공하는 한다.

public class DAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int result = 0;

	// 싱글톤 패턴 : 하나의 인스턴스만을 생성하고, 사용할 수 있다.
	// (하나의 객체만 생성하고 사용해야 할때, 적용할 수 있는 패턴.)

	private static DAO dao = new DAO();

	public static DAO getInstance() {
		return dao;
	}

	// 접속
	public Connection getConnection() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://203.236.220.77:3306/mydb?autoReconnect=true";
			String user = "zzaq1030";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
		}
		return conn;
	}

	// select
	public ArrayList<VO> getSelect() {
		// vo를 담을 컬렉션 만들기
		ArrayList<VO> list = new ArrayList<VO>();
		try {
			conn = getConnection();
			String sql = "select * from member01 order by idx";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// 데이터를 VO에 담는다.
				VO vo = new VO();
				vo.setIdx(rs.getString(1));
				vo.setId(rs.getString(2));
				vo.setPw(rs.getString(3));
				vo.setName(rs.getString(4));
				vo.setAge(rs.getString(5));
				vo.setReg(rs.getString(6).substring(0, 10));
				list.add(vo);
			}
			// 출력은 main메소드에서 하자
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return list;
	}

	// insert
	public ArrayList<VO> getInsert(String idx, String id, String pw, String name, String age) {
		ArrayList<VO> list = null;
		try {
			conn = getConnection();
			String sql = "insert into member01 values(?,?,?,?,?,null)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, idx);
			pstmt.setString(2, id);
			pstmt.setString(3, pw);
			pstmt.setString(4, name);
			pstmt.setString(5, age);
			int result = pstmt.executeUpdate();

			if (result > 0) {
				list = getSelect();
			} else {
				System.out.println(" 삽입 실패 ");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return list;
	}

	// delete
	public ArrayList<VO> getDelete(String idx) {
		ArrayList<VO> list = null;
		try {
			conn = getConnection();
			String sql = "delete from member01 where idx = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, idx);
			int result = pstmt.executeUpdate();

			if (result > 0) {
				list = getSelect();
			} else {
				System.out.println("삭제 실패 ");
			}
		} catch (Exception e) {
			System.out.println("삭제 실패 2");
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}

	// update
	public ArrayList<VO> getUpdate(String idx, String age) {
		ArrayList<VO> list = null;
		try {
			conn = getConnection();
			String sql = "update member01 set age = ? where idx = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, age);
			pstmt.setString(2, idx);
			int result = pstmt.executeUpdate();

			if (result > 0) {
				list = getSelect();
			} else {
				System.out.println("삭제 실패 ");
			}
		} catch (Exception e) {
			System.out.println("삭제 실패 2");
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}

	// 로그인
	public ArrayList<VO> getLogIn(String id, String pw) {
		ArrayList<VO> list = new ArrayList<VO>();
		try {
			conn = getConnection();
			String sql = "select * from member01 where id = ? and pw = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// 데이터를 VO에 담는다.
				VO vo = new VO();
				vo.setIdx(rs.getString(1));
				vo.setId(rs.getString(2));
				vo.setPw(rs.getString(3));
				vo.setName(rs.getString(4));
				vo.setAge(rs.getString(5));
				vo.setReg(rs.getString(6).substring(0, 10));
				list.add(vo);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}

}
