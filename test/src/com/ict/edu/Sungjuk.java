package com.ict.edu;

import java.util.Scanner;

public class Sungjuk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] arr = new Person[5];

		for (int i = 0; i < arr.length; i++) {
			Person p = new Person();
			System.out.println("이름이 뭐니?");
			String name = sc.next();
			p.setName(name);
			System.out.println("국어점수?");
			int kor = sc.nextInt();
			System.out.println("영어점수?");
			int eng = sc.nextInt();
			System.out.println("수학점수?");
			int math = sc.nextInt();

			arr[i] = p;
			p.getSum();
			p.getAvg();
			p.getHak();
			p.getRank();
		}
//순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i].setRank(arr[i].getRank() + 1);

			}

		}

		// 정렬
		Person tmp = new Person();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;

				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + " ");
			System.out.print(arr[i].getSum() + " ");
			System.out.print(arr[i].getAvg() + " ");
			System.out.print(arr[i].getHak() + " ");
			System.out.println(arr[i].getRank() + " ");
		}
	}
}
