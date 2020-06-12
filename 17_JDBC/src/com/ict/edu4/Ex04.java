package com.ict.edu4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		try {

			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@203.236.220.55:1521:xe";
			String user = "c##zzaq1030";
			String password = "5026";

			conn = DriverManager.getConnection(url, user, password);

			String sql = "delete from members where m_name = ? or m_name = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, "박수쳐");
			pstmt.setString(2, "붕삼이");

			result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("삭제 성공");
				sql = "select*from members order by idx";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\t");
					System.out.print(rs.getString(5) + "\t");
					System.out.println(rs.getString(6));

				}
			} else {
				System.out.println("삭제 실패1");
			}
		} catch (Exception e) {
			System.out.println("삭제 실패2");
		} finally {

		}
		try {
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {

		}
	}
}
