package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//�̸� , ���� , ���� , ���� ������ �޾Ƽ�
		//�̸� , ���� , ���(�Ҽ��� ù°�ڸ�����) , ���� ���
		
		

		esc: while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�̸��� �Է��ϼ���");
			String name = sc.next();
			System.out.println("���������� �Է��ϼ���");
			int kor = sc.nextInt();
			System.out.println("���������� �Է��ϼ���");
			int eng = sc.nextInt();
			System.out.println("���������� �Է��ϼ���");
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
			System.out.println("������ : " + sum);
			System.out.println("����� : " + ever);
			System.out.println("������ : " + res);
			System.out.println("�̸��� : " + name);
			esc2:while (true) {
				System.out.println("��� �ұ�� (1.��/ 2.�ƴϿ�) >>");
				int su = sc.nextInt();
				if (su == 1) {
					continue esc;

				}else if (su == 2) {
					break esc;
					
				}else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					continue esc2;
				}
			}

		}
		System.out.println("�����ϼ̽��ϴ�.");
	}
}
