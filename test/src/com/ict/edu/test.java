package com.ict.edu;

import java.util.Calendar;

public class test {
	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		System.out.print(now.get(Calendar.YEAR) + "��");
		System.out.print(now.get(Calendar.MONTH) + 1 + "��"); // 0 - 11
		System.out.print(now.get(Calendar.DATE) + "��");
		System.out.println(now.get(Calendar.DAY_OF_MONTH) + "��");

		int res = now.get(Calendar.DAY_OF_WEEK);
		switch (res) {
		case 1:
			System.out.println("�Ͽ���");
			break;
		case 2:
			System.out.println("������");
			break;
		case 3:
			System.out.println("ȭ����");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("�����");
			break;
		case 6:
			System.out.println("�ݿ���");
			break;
		case 7:
			System.out.println("�����");
			break;
		}
	}
}
