package com.ict.edu;

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
	}

}
