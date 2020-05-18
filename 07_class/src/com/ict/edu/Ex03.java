package com.ict.edu;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		// ��Ŭ�������� API ȣ�� : �ش�Ŭ������ Ŀ���� ���� shift + f2
		// ���� : Math.random() , Random Ŭ����
		// 1. Random Ŭ����
		Random ran = new Random();

		// ���� �ڷ����� ������ �߻� : �ڷ��� �����ȿ��� ���� �߻�
		System.out.println("boolean��: " + ran.nextBoolean());
		System.out.println("int��: " + ran.nextInt());
		System.out.println("long��: " + ran.nextLong());
		System.out.println("================================================================================================");
		
		// float�� double�� 0.0 �̻� - 1.0 �̸����� ���� �߻�
		System.out.println("float��: " + ran.nextFloat());
		System.out.println("double��: " + ran.nextDouble());
		System.out.println("================================================================================================");
		
		// Ư�� ������ �����ϴ� ��� :
		// 1. nextInt(����) : 0 ~ ���� ������ �������� ���� �߻�
		System.out.println("�������� : " + ran.nextInt(5)); // 0 - 4 ���� ���� �� �� �߻�
		System.out.println("================================================================================================");

		// 2. (int)nextDouble() * ���� : 0 ~ ���� ������ �������� �� �� �߻�
		System.out.println("�������� : " + (int) ran.nextDouble() * 5); // 0 - 4 ���� ���� �� �� �߻�
		System.out.println("================================================================================================");

		// 2. Math Ŭ���� : ��ü �޼ҵ尡 static�̹Ƿ� ��ü ���� ���� ȣ�� ����
		// 1) random()
		System.out.println(Math.random()); // 0.0 �̻� - 1.0�̸�
		System.out.println("================================================================================================");

		// Ư�� ������ ������ �� �ִ�.
		System.out.println((int) (Math.random() * 6)); // 0 - 5����
		System.out.println("================================================================================================");
		
		// 2. abs : ���밪 ���� / ������ ����� ���鶧 ���� ���.
		System.out.println(Math.abs(100));
		System.out.println(Math.abs(-100));
		System.out.println("================================================================================================");
		
		// 3 . ceil(double x) �ø� , round(doulbe x) �ݿø� , floor(double x) ����
		System.out.println("�ø� : " + Math.ceil(3.45));		// 4
		System.out.println("�ø� : " + Math.ceil(3.55));		// 4
		System.out.println("�ݿø� : " + Math.round(3.45));		// 3
		System.out.println("�ݿø� : " + Math.round(3.55));		// 4
		System.out.println("���� : " + Math.floor(3.45));		// 3
		System.out.println("���� : " + Math.floor(3.55));		// 3
		System.out.println("================================================================================================");
		
		// 4. max(�ڷ��� a, �ڷ��� b) : �� �� ū �� ���
		System.out.println("max : " + Math.max(44.6,45));
		// 5. min(�ڷ��� a, �ڷ��� b) : �� �� ���� �� ���
		System.out.println("min : " + Math.min(44.6,45));
		System.out.println("================================================================================================");
		
		// 6. pow(double a, double b) : ������
		System.out.println(Math.pow(2, 3)); // 2�� 3�� = > 8.0
		System.out.println(Math.pow(3, 2)); // 3�� 2�� = > 9.0
		System.out.println("================================================================================================");
		
		
		
	}

}
