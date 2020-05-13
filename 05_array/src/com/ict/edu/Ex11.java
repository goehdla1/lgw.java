package com.ict.edu;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("번호");
			int no = sc.nextInt();
			System.out.println("국어점수");
			int kor = sc.nextInt();
			System.out.println("영어점수");
			int eng = sc.nextInt();
			System.out.println("수학점수");
			int math = sc.nextInt();

			int sum = kor + eng + math;
			int avg = sum / 3;
			char hak = 'a';
			if (avg >= 90) {
				hak = 'A';

			} else if (avg >= 80) {
				hak = 'B';

			} else if (avg >= 70) {
				hak = 'C';

			} else {
				hak = 'F';
			}
			int rank = 1;
			arr[i][0] = no;
			arr[i][1] = sum;
			arr[i][2] = avg;
			arr[i][3] = hak;
			arr[i][4] = rank;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][1] > arr[j][1]) {
					arr[i][4]++;

				}
			}
		}
		int[] tmp = new int[5];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					

				}

			}

		}

		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}
	}
}
