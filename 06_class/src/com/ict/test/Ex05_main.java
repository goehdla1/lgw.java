package com.ict.test;

import com.ict.edu.Ex05;

public class Ex05_main {
	public static void main(String[] args) {
		// ��Ű���� �޶� public�� ��밡��. (import�� �ϸ�)
		System.out.println(Ex05.k1);
		// protected�� ������ ��Ű���� �ٸ��� ��� �Ұ�.
		//System.out.println(Ex05.k2);
		//System.out.println(Ex05.k3);
		// static�̴��� private�� ���� ����.
		// System.out.println(Ex05.k4);

		Ex05 e5 = new Ex05();
		// ��Ű���� �޶� public�� ��밡��. (import�� �ϸ�)
		System.out.println(e5.s1);
		// protected�� ������ ��Ű���� �ٸ��� ��� �Ұ�.
		//System.out.println(e5.s2);
		//System.out.println(e5.s3);
		// ��ü�� �����ص� private�� ���� ����.
		// System.out.println(e5.s4);
	}
}
