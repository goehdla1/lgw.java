package com.ict.edu4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// 1. �ڹٿ� ����Ŭ�� �����ϱ� ���� ���̺귯�� ������Ʈ

public class Ex01 {
	public static void main(String[] args) {
		// 1. java�� ����Ŭ�� ������ �� �ֵ��� �����ִ� Ŭ����
		Connection conn = null;
		// 2. SQL �ۼ�,���� ����
		// Statement stmt = null;
		PreparedStatement pstmt = null;
		// 3. select���� ����Ҷ� ����� �޴� Ŭ����
		// select���� ����� �׻� ���̺� �����̴�. �������� ���ڷ� �޴´�.
		ResultSet rs = null; // select�� �϶� ���
		int result = 0; // select�� ������ �� ���

		try {
			// 4. jbdc ����̹� �ε� : ����Ŭ,mySQL �� DBMS ���� ������ �ٸ���.
			Class.forName("oracle.jdbc.OracleDriver");

			// �����ϱ� ���� ���� ����
			String url = "jdbc:oracle:thin:@203.236.220.55:1521:xe";
			String user = "c##zzaq1030";
			String password = "5026";

			// 5. ����Ŭ ����
			conn = DriverManager.getConnection(url, user, password);

			// 6. sql �ۼ�
			String sql = "select * from members";

			// 7. sql�� ��Ƽ� ���� ���� ����
			// stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			// 8. ���п� SQL�� ��Ƽ� ������ ����� �޴´�.
			// SQL ���� select �϶�
			// rs = stmt.executeQuery(sql);
			rs = pstmt.executeQuery();
			// SQL ���� select�� �ƴ� ��
			// result = stmt.executeUpdate(sql);
			result = pstmt.executeUpdate();
			while (rs.next()) {

				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getInt(5) + "\t");
				System.out.println(rs.getString(6));
				/*
				 * System.out.print("idx"+"\t"); System.out.print("m_id"+"\t");
				 * System.out.print("m_pw"+"\t"); System.out.print("m_name"+"\t");
				 * System.out.print("m_age"+"\t"); System.out.println("m_reg");
				 */
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();

			} catch (Exception e2) {

			}
		}
	}
}
