package com.ict.edu;

public class Ex14 {
	// static : ��ü ������ ������� �̸� ��������� �ʵ�� �޼ҵ�
	// Ŭ������ ������������ ����� �� ����.
	// : ���� ���� ( ��簴ü�� ����� �� �ִ�.)

	int su = 10; // �ν��Ͻ� ����
	static int num = 10; // static ���� , Ŭ���� ���� = > �Ѱ��� ������ ����.

	public Ex14() {
		su++;
		num++;
	}

	public void sum(int k1, int k2) {
		// static�� ���������� ����� �� ����.
		// static double p1 = 3.14;
		su = k1 + k2;
	}

	// static �޼ҵ� : static ������ �������� ���.
	public static void add(int k1, int k2) {
		// �������� ��� �Ұ�.
		// su = k1 + k2;
		
		num = k1 + k2; // static ����.

		double p1 = 3.14; // �Ϲ� ���� ����.
		
		// static�� ���������� ����� �� ����.
		// static double p1 = 3.14;
	}

}