package com.ict.edu;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학을 입력 받아서
		// 이름 , 총점, 평균 , 학점 , 순위를 구하고 정렬하자.
		// 순위와 정렬은 main에서 구함.
		Scanner sc = new Scanner(System.in);

		// 한사람의 정보를 가지고 있는 클래스가 Ex09이다.
		// 5명의 정보를 가질 수 있는 배열을 만들자.

		// 입력하기.
		Ex12[] arr = new Ex12[5]; // 5명의 배열을 만들고.

		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("이름을 입력해주세요.");
			String name = sc.next();
			
			System.out.println("국어 점수는?");
			int kor = sc.nextInt();

			System.out.println("영어 점수는?");
			int eng = sc.nextInt();

			System.out.println("수학 점수는?");
			int math = sc.nextInt();

			// 합계
			int sum = (kor+ eng+ math);
			// 평균
			double avg = (int)(sum/3.0*10)/10.0;
			// 학점
			
		String hak= (" ");
				if (avg >= 90) {
					hak = "A";

				} else if (avg >= 80) {
					hak = "B";

				} else if (avg >= 70) {
					hak = "C";

				} else {
					hak = "F";
				}
			
			
			
			
			Ex12 person = new Ex12(name, sum, avg, hak, 1); 
			arr[i] = person;
		}

		// 순위 와 정렬,출력
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum()) {

					arr[i].setRank(arr[i].getRank() + 1);

				}
			}
		}

		// 정렬
		Ex12 tmp = new Ex12(); // 임시 저장하는것도 클래스로 만들어야한다.
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;

				}
			}

		}

		// 출력하기
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + " ");
			System.out.print(arr[i].getSum() + " ");
			System.out.print(arr[i].getAvg() + " ");
			System.out.print(arr[i].getHak() + " ");
			System.out.println(arr[i].getRank() + " ");
		}
	}
}
