package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			// ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");

			// ��������
			String url = "jdbc:oracle:thin:@203.236.220.55:1521:xe";
			String user = "c##zzaq1030";
			String password = "5026";

			conn = DriverManager.getConnection(url, user, password);

			// SQL ��
			String sql = "insert into members values(members_seq.nextval,'kkkk','1111','����',3 ,sysdate )";
			
			// ���� ����
			stmt = conn.createStatement();
			
			// insert, delete, update
			result = stmt.executeUpdate(sql);
			
			if(result>0) {
				System.out.println("���� ����");
				
				sql = "select * from members order by idx";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getString(5)+"\t");
					System.out.println(rs.getString(6));
				}
			}else {
				System.out.println("���� ����1");
			}
			
		} catch (Exception e) {
			System.out.println("���Խ���2");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();

			} catch (Exception e2) {
			}
		}
	}
}
