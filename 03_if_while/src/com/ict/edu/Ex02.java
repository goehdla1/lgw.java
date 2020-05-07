package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// if ~ else ~ : 조건식이 참일때와 거짓일때 각각 나눠서 처리한다.
		// 형식 : if(조건식){
		// 조건식이 참일때 실행 문장;
		// 조건식이 참일때 실행 문장;
		// }else{
		// 조건식이 거짓일때 실행 문장;
		// 조건식이 거짓일때 실행 문장;
		// }

		// int k1 이 60이상이면 합격,나머지 불합격
		int k1 = 70;
		String str = "초기값";
		if (k1 >= 60) {
			str = "합격";

		} else {
			str = "불합격";

		}
		System.out.println("결과 :" + str);

		str = (k1 >= 60) ? "불합격" : "합격";

		System.out.println("결과 :" + str);

		// 홀수 짝수 판별
		int k2 = 258;
		if (k2 % 2 == 0) {
			str = "짝수";

		} else {
			str = "홀수";

		}
		System.out.println("결과 :" + str);

		str = (k2 % 2 == 1) ? "홀수" : "짝수";
		System.out.println("결과 :" + str);

		// 대문자,소문자 판별 문제
		char k3 = 'v';
		if (k3 >= 'a' && k3 <= 'z') {
			str = "소문자";

		} else {
			str = "대문자";

		}
		System.out.println("결과 :" + str);

		str = (k3 >= 'A' && k3 <= 'Z') ? "대문자" : "소문자";
		System.out.println("결과 :" + str);

		// 1 또는 3이면 남자 , 아니면 여자
		int k4 = 2;
		if (k4 == 1 || k4 == 3) {
			str = "남자";

		} else {
			str = "여자";

		}
		System.out.println("결과 :" + str);

		str = (k4 == 1 || k4 == 3) ? "남자" : "여자";
		System.out.println("결과 :" + str);

		// 근무시간이 8시간까지는 시간당 8590이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다.
		// 얼마를 받아야 하는가?

		int time = 8;
		int dan = 8590;
		double overdan = 8590 * 1.5;
		int pay = 0;
		if (time > 8) {
			pay = (8 * dan) + (int) ((time - 8) * overdan);

		} else {
			pay = dan * time;

		}
		System.out.println("결과 :" + pay);

		pay = (time > 8) ? (dan * 8 + (int) (overdan * (time - 8))) : (dan * time);
		System.out.println("결과 :" + pay);

		// 두 수 중 큰 값을 출력하시오.
		int k5 = 2580;
		int k6 = 15778;
		int res = 0;
		if (k5 > k6) {
			res = k5;

		} else {
			res = k6;

		}
		System.out.println("결과 :" + res);

		res = (k5 > k6) ? k6 : k5;
		System.out.println("결과 :" + res);

		}
	}
