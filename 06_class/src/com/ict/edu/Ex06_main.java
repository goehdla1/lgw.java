package com.ict.edu;

public class Ex06_main {
	public static void main(String[] args) {
		Ex06 e6 = new Ex06();

		System.out.println(e6.name);
		String s = e6.s_name();
		System.out.println(s);
		System.out.println();

		System.out.println(e6.age);
		int s1 = e6.s_age();
		System.out.println(s1);
		System.out.println();

		// weight�� private�̱� ������ �ٷ� �����Ҽ� ����.
		// System.out.println(e6.weight);

		// �޼ҵ带 �̿��ؼ� �����Ѵ�.(getter)
		double s2 = e6.s_weight();
		System.out.println(s2);
		System.out.println();

		// �̸��� �Ѹ��� ��������
		e6.re_name("�Ѹ�");
		// Ȯ��
		System.out.println(e6.name);
		s = e6.s_name();
		System.out.println(s);
		System.out.println();

		// ���̸� 5000 ���� ��������.
		e6.re_age(5000);

		// Ȯ��
		System.out.println(e6.age);
		s1 = e6.s_age();
		System.out.println(s1);
		System.out.println();
		
		// �����Ը� 10000���� ��������
		// int�� double�� ������ �� �ִ�.
		e6.re_weight(10000);
		
		//System.out.println(e6.weight);
		s2 = e6.s_weight();
		System.out.println(s2);
		System.out.println();

	}
}
