package com.ict.edu01;

import com.ict.edu01.Ex05.Inner02;

public class Main {
	public static void main(String[] args) {
		// ����Ŭ������ ������ ��ü ������ �� �� ����.
		// Inner01 Inner01 = new Inner01();
		// �ܺ� Ŭ������ ���ؼ� ��ü�� �����Ѵ�.

		Ex05 e5 = new Ex05();
		System.out.println(e5.name);
		// private age ���� ����
		// System.out.println(e5.age);

		e5.play();

		System.out.println("===========================================================");

		// Member ����Ŭ����
		// �ּ� ���� �ٸ���.
		Ex05.Inner01 inner01 = new Ex05().new Inner01();

		Ex05.Inner01 inner02 = e5.new Inner01();
		inner02.prn();

		System.out.println("============================================================");

		System.out.println(Inner02.a3);
		System.out.println(Inner02.a4);
		Inner02.go2();
		System.out.println("============================================================");
		
		// static ����Ŭ������ �ٷ� ���� �� �ִ�.
		Inner02 test = new Inner02();
		System.out.println(test.a1);
		System.out.println(test.a2);
		test.go();
		
	}
}
