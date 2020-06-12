package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {
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
			String sql = "select * from members where idx = 21" ;
			// String sql = "select * from members where m_name like '��%'" ;
			// String sql = "select * from members where m_name ='������'" ;
			
			// ���� ����
			stmt =  conn.createStatement();
			
			// sql ��Ƽ� ������ ��� �ޱ� 
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.print(rs.getString("idx")+"\t");
				System.out.print(rs.getString("m_id")+"\t");
				System.out.print(rs.getString("m_pw")+"\t");
				System.out.print(rs.getString("m_name")+"\t");
				System.out.print(rs.getString("m_age")+"\t");
				System.out.println(rs.getString("m_reg").substring(0,10));
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
