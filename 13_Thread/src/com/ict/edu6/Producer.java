package com.ict.edu6;

public class Producer implements Runnable {
	private Car car;

	public Producer(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			// 자동차생산
			carName = car.getCar();
			// 차를 넣어줘야지.?
			car.push(carName);
			try {
				Thread.sleep((int) (Math.random() * 200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
