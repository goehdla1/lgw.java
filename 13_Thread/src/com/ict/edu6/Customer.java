package com.ict.edu6;

// �Һ���
public class Customer implements Runnable {
	private Car car; // Ŭ���� Car�� �ڷ������� ����Ѵ�.

	
	public Customer(Car car) {
		// �����ڿ��� ���� ���ڸ� ���������� ����.
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
