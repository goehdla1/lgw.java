package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 숫자를 받아서 홀수, 짝수를 구분하자.
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int su = sc.nextInt();
		String result = " ";
		if (su % 2 == 0) {
			result = "짝수";

		} else {
			result = "홀수";

		}

		System.out.println("결과 : " + result);

		// 나라를 입력하면 수도가 출력되게 하자
		// 1.한국=서울 , 2.중국=베이징 3.일본=도쿄 나머지는 데이터 없음.
		System.out.print("나라입력 : 1.한국=서울, 2.중국 = 베이징 3. 일본=도쿄 >>");
		int num = sc.nextInt();
		result = "";

		if (num == 1) {
			result = "한국=서울";

		} else if (num == 2) {
			result = "중국 = 베이징";
		} else if (num == 3) {
			result = "일본 = 도쿄";

		} else {
			result = "데이터 없음";

		}
		System.out.println("결과 : " + result);

		System.out.print("나라입력 :한국, 중국 ,일본 >>");     // ==> 스트링으로 물어보는 문제.

		String country = sc.next();
		result = "";
		switch (country) {
		case "한국": result = "서울"; break;
		case "중국": result = "베이징"; break;
		case "일본": result = "도쿄"; break;

		default: result = "데이터 없음";
			break;
		}
		System.out.println("결과 : " + result);
		

		// 근무시간이 8시간까지는 시간당 8590 이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 근무시간을 입력해서 알바금액을 선정하자.

		System.out.print("근무시간을 입력하시오. : ");
		int su1 = sc.nextInt();
		int dan = 8590;
		int over = (int) (8590 * 1.5);
		int res = 0;
		if (su1 > 8) {
			res = (dan * 8) + (over * (su1 - 8));

		} else {
			res = (dan * su1);

		}
		System.out.println("알바금액은 : " + res);

		// menu가 1 이면 카페모카 3500, 2이면 카페라떼 4000,
		// 3이면 아메리카노 3000, 4이면 과일쥬스 3500이다.
		// 친구와 2잔을 10000원내고 먹었다.
		// 메뉴를 고른 결과와 잔돈을 출력(단, 부가세 10% 포함)
		System.out.print("menu 선택 : \n1.카페모카(3500)  \n2. 카페라떼(4000)  \n3.아메리카노(3000)  \n4. 과일쥬스 (3500) >> ");

		int menu = sc.nextInt();
		int input = 10000;
		int su3 = 2;
		int choice = 0;
		String drink = "";
		
		if (menu == 1) {
			choice = 3500;
			drink = "카페모카";

		} else if (menu == 2) {
			choice = 4000;
			drink = "카페라떼";

		} else if (menu == 3) {
			choice = 3000;
			drink = "아메리카노";

		} else if (menu == 4) {
			choice = 3500;
			drink = "과일쥬스";

		}
		
		int vat = (int)(choice * 1.1);
		int total = (su3 * vat);
		int output = (input - total);
		
		System.out.println("고른 메뉴는 : " + drink + " 잔돈은 : " + output);

	}
}
