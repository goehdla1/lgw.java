package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// ���� �������� ������ (Thread.currentThread()) �� getName �̸� ȣ��.
		System.out.println(Thread.currentThread().getName()); // main ������.

		Ex02 test = new Ex02();
		test.play();
		System.out.println(1);
		String name = test.sound();
		System.out.println(name);
		System.out.println(2);
		System.out.println("==================================================================");

		Ex03 test2 = new Ex03();
		System.out.println(Thread.currentThread().getName() + " : 1");
		test2.go();
		System.out.println(Thread.currentThread().getName() + " : 2");
		// test2.run(); - > �̱� ������ (main �ϲ�)
		test2.start(); // - > ��Ƽ ������ ( main ���� �ٸ� �ϲ�)
		System.out.println(Thread.currentThread().getName() + " : 3");
	}
}
