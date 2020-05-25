package com.ict.edu3;

// Runnable 인터페이스는 추상메소드 run()만 가지고 있다.

public class Ex01 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : 1111111111111111111 ");
		}

		play(); // 메소드 안에 메소드를 넣을 수 있다. 또 main 이 play를 일하는게 아니라 스레드 쫄따구가 일을 한다.

	}

	public void play() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : ##################### ");
		}
	}

}
