package com.ict.edu6;

// 소비자
public class Customer implements Runnable {
	private Car car; // 클래스 Car를 자료형으로 사용한다.

	
	public Customer(Car car) {
		// 생성자에서 받은 인자를 전역변수로 변경.
		this.car = car;
	}

	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.pop();
			try {
				Thread.sleep((int) (Math.random() * 200));
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}

	}

}
