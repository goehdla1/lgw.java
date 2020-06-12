package com.ict.edu4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class Ex05 {
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

			String sql = "update members set m_age = ? where idx = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, "50");
			pstmt.setString(2, "4");
			result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("업데이트 성공");
				sql = "select * from members order by idx";
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
			}

		} catch (Exception e) {
			System.out.println("업데이트 실패1");
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();

			} catch (Exception e2) {
				System.out.println("업데이트 실패2");

			}
		}
	}
}
