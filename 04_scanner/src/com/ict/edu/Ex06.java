package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.next();
		System.out.println("���������� �Է��ϼ���");
		int kor = sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
		int eng = sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
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
		
		
		System.out.println("�̸��� : " + name);
		System.out.println("������ : " + sum);
		System.out.println("����� : " + ever);
		System.out.println("������ : " + res);
	
	}
}
