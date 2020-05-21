package com.ict.edu;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Ex04[] arr = new Ex04[3];
		HashSet<Ex04> set1 = new HashSet<Ex04>();

		while (true) {
			Ex04 person = new Ex04();

			System.out.println("이름을 입력하세요");
			String name = sc.next();
			person.setName(name);
			System.out.println("국어점수?");
			int kor = sc.nextInt();
			System.out.println("영어점수?");
			int eng = sc.nextInt();
			System.out.println("수학점수?");
			int math = sc.nextInt();

			person.sum(kor, eng, math);
			
			// arr[i] = person;

			set1.add(person);
			System.out.println("계속할까요?(y/n)");
			String str = sc.next();
			if (str.equalsIgnoreCase("n"))
				break;

		}
		// 순위
		for (Ex04 k1 : set1) {
			for (Ex04 k2 : set1) {
				if (k1.getAvg() < k2.getAvg()) {
					k1.setRank(k1.getRank());

				}

			}

		}

		// 출력
		for (Ex04 k : set1) {
			System.out.print(k.getName() + " ");
			System.out.print(k.getAvg() + " ");
			System.out.print(k.getSum() + " ");
			System.out.print(k.getHak() + " ");
			System.out.print(k.getRank() + " ");

		}

	}

}
