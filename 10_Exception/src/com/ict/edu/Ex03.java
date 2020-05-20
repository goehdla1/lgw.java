package com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

// ���� catch �� : try���� ���� �߻��� ������ �� �� �ִ� ���
// ���� ���� : Exception ����ҋ��� �ݵ�� �Ʒ� �� catch���� ���

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// InputMismatchException
		// ArithmeticException
		/*
		 * try { int var = 50; System.out.println("���� �Է� : "); int su = sc.nextInt();
		 * System.out.println("���� : " + (var / su));
		 * 
		 * } catch (ArithmeticException e1) { System.out.println("0���δ� �������� �����ϴ�."); }
		 * catch (InputMismatchException e2) { System.out.println("������ �Է����ּ���."); }
		 */

		try {
			int var = 50;
			System.out.println("���� �Է� : ");
			int su = sc.nextInt();
			System.out.println("���� : " + (var / su));

		} catch (Exception e) {
			System.out.println("����� �Է��ϼ���.");
		}

		System.out.println("�����ϼ̽��ϴ�.");
	}
}
