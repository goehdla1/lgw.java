package com.ict.edu3;

// Runnable �������̽��� �߻�޼ҵ� run()�� ������ �ִ�.

public class Ex01 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : 1111111111111111111 ");
		}

		play(); // �޼ҵ� �ȿ� �޼ҵ带 ���� �� �ִ�. �� main �� play�� ���ϴ°� �ƴ϶� ������ �̵����� ���� �Ѵ�.

	}

	public void play() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : ##################### ");
		}
	}

}
