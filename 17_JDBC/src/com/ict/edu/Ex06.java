package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex06 {
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static Scanner sc = new Scanner(System.in);

	public static void getSelect() {
		try {
			String sql = "select * from members order by idx";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("IDX\tID\tPW\tNAME\tAGE\tREG");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getString(5) + "\t");
				System.out.println(rs.getString(6).substring(0, 10));
			}
		} catch (Exception e) {
		}
	}

	public static void getInsert() {
		try {
			System.out.println("������ �Է��ϼ���");
			System.out.print("���̵� : ");
			String m_id = sc.next();

			System.out.print("�н����� : ");
			String m_pw = sc.next();

			System.out.print("�̸� : ");
			String m_name = sc.next();

			System.out.print("���� : ");
			String m_age = sc.next();

			String sql = "insert into members " + "values(members_seq.nextval," + m_id + "," + m_pw + "," + m_name + ","
					+ m_age + ", sysdate)";

			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				getSelect();
			} else {
				System.out.println(" ���� ���� ");
			}

		} catch (Exception e) {
			System.out.println(" ���� ����2 ");
		}
	}

	public static void getDelete(String idx) {
		try {
			String sql = "delete from members where idx =" + idx;
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("======= ���� �� ������ ========");
				getSelect();
			} else {
				System.out.println(" ���� ���� ");
			}

		} catch (Exception e) {
			System.out.println(" ���� ����2 ");
		}
	}

	public static void getUpdate(String idx, String age) {
		try {
			String sql = "update members set m_age=" + age + " where idx=" + idx;
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("======= ���� �� ������ ========");
				getSelect();
			} else {
				System.out.println(" ���� ���� ");
			}

		} catch (Exception e) {
			System.out.println(" ���� ����2 ");
		}
	}

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.55:1521:xe";
			String user = "c##nohsam";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);

			System.out.println("�����Ͻÿ�");
			System.out.println("1. ���̺� ������ ����");
			System.out.println("2. ���̺� ������ ����");
			System.out.println("3. ���̺� ������ ����");
			System.out.println("4. ���̺� ������ ����");
			System.out.print(">>>   ");
			int su = sc.nextInt();

			switch (su) {
			case 1:
				getSelect();
				break;
			case 2:
				getInsert();
				break;
			case 3:
				getSelect();
				System.out.print("������ IDX : ");
				String idx = sc.next();
				getDelete(idx);
				break;
			case 4:
				getSelect();
				System.out.print("������ IDX : ");
				String idx2 = sc.next();
				System.out.print("������ ���� : ");
				String age = sc.next();
				getUpdate(idx2, age);
				break;
			}

			System.out.println();
			System.out.println();
			System.out.println("���� �ϼ̽��ϴ�.");
		} catch (Exception e) {
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
