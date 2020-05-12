package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//이름 , 국어 , 영어 , 수학 정보를 받아서
		//이름 , 총점 , 평균(소수점 첫째자리까지) , 학점 출력
		
		

		esc: while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("이름을 입력하세요");
			String name = sc.next();
			System.out.println("국어점수를 입력하세요");
			int kor = sc.nextInt();
			System.out.println("영어점수를 입력하세요");
			int eng = sc.nextInt();
			System.out.println("수학점수를 입력하세요");
			int math = sc.nextInt();

			int sum = (kor + eng + math);
			double ever = ((int)(sum / 3.0*10)/10.0);
			char res = ' ';
			if (ever >= 90) {
				res = 'A';

			} else if (ever >= 80) {
				res = 'B';

			} else if (ever >= 70) {
				res = 'C';

			} else
				res = 'F';
			System.out.println("총점은 : " + sum);
			System.out.println("평균은 : " + ever);
			System.out.println("학점은 : " + res);
			System.out.println("이름은 : " + name);
			esc2:while (true) {
				System.out.println("계속 할까요 (1.예/ 2.아니요) >>");
				int su = sc.nextInt();
				if (su == 1) {
					continue esc;

				}else if (su == 2) {
					break esc;
					
				}else {
					System.out.println("잘못 입력하셨습니다.");
					continue esc2;
				}
			}

		}
		System.out.println("수고하셨습니다.");
	}
}
