package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("국어점수를 입력하세요");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math = sc.nextInt();
		
		int sum = (kor + eng + math) ;
		double ever = (sum/3);
		char res =  ' ';
		if (ever >= 90) {
			res = 'A';
			
		}else if (ever >= 80) {
			res = 'B';
			
		}else if (ever >= 70) {
			res = 'C';
			
		}else {
			res = 'F';
		}
		
		
		System.out.println("이름은 : " + name);
		System.out.println("총점은 : " + sum);
		System.out.println("평균은 : " + ever);
		System.out.println("학점은 : " + res);
	
	}
}
