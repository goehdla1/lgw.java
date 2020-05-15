package com.ict.edu;

import java.util.Random;

public class Ex02_main {
	public static void main(String[] args) {
		// static ����ʵ� ȣ��
		// ��ü �����ϱ� ���� ȣ��. = static
		System.out.println(Ex02.com);
		System.out.println(Ex02.eng);
		// static�� �ƴϱ� ������ ȣ�� ����.
		// System.out.println(Ex02.kor);
		// System.out.println(Ex02.math);
		
		
		
		// Ex02 Ŭ���� ��ü �����
		// ��ü �����ϰ� ���� ȣ�� = �ν��Ͻ�
		// Ŭ�����̸� �������� = new ������();
		// Ex02 �� �����ڰ� ������ �⺻�����ڷ� ����.
		Ex02 test = new Ex02();
		System.out.println(test.kor);
		System.out.println(test.eng);
		System.out.println(test.math);
		System.out.println(test.com);
		
		System.out.println(Ex02.com);
		System.out.println(Ex02.eng);
		
		System.out.println(test);
		System.out.println("==================================================================");
		
		// API�� �̿��ؼ� static �޼ҵ�� �ν��Ͻ��� ȣ���� ����.
		// API���� �����ϴ� Random Ŭ������ nextInt() , nextInt(int bound) , nextDouble()�� ����ϴ� ���̴�.
		
		// nextInt() , nextInt(int bound) , nextDouble()�� static�� �ƴϹǷ�
		// Ŭ������ ��ü�� ���� ����ؾ� �ȴ�.
	
		// 1. Ŭ������ ��ü�� ����� ���
		//  Ŭ���� �������� = new ������
		Random ran = new Random();
		// nextInt() : int ���� �ȿ��� �������� ���� �����Ѵ�.
		int res = ran.nextInt(); // = > ran.nextInt() ����� �޾Ƽ� ��ȯ�ϱ� ������ ����� �޾�����ؼ� int res �� ����. 
		System.out.println(res);
		System.out.println("---------------------------------");
		
		// nextInt(����) : ��ȯ�� ( 0 - ���� ������)
		res = ran.nextInt(6); // 0-5 ����
		System.out.println(res);
		System.out.println("---------------------------------");
		
		
		// �������� ���� 0.0 - 1.0 �̸��� �Ǽ�
		double res2 = ran.nextDouble();
		System.out.println(res2);
		System.out.println("---------------------------------");
		
		// res2�� 0 - 5������ ������ ǥ������.
		System.out.println((int)(res2*6));
		
		// API���� �����ϴ� static �޼ҵ� ����ϱ�
		// Math Ŭ������ �޼ҵ���� static�̹Ƿ� ��ü �������� ��밡��
		// Ŭ�����̸�.����ʵ� , Ŭ�����̸�.����޼ҵ�� ���
		System.out.println(Math.random());
		
		// ���ϴ� ������������ ������������ �� ����
		System.out.println((int)(Math.random()*6)); // 0 - 5 ����
	}

}
