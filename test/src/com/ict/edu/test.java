package com.ict.edu;

import java.util.Calendar;

public class test {
	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		System.out.print(now.get(Calendar.YEAR) + "년");
		System.out.print(now.get(Calendar.MONTH) + 1 + "월"); // 0 - 11
		System.out.print(now.get(Calendar.DATE) + "일");
		System.out.println(now.get(Calendar.DAY_OF_MONTH) + "일");

		int res = now.get(Calendar.DAY_OF_WEEK);
		switch (res) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		case 7:
			System.out.println("토요일");
			break;
		}
	}
}
