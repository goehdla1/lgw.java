package com.ict.edu5;

//  5. �ΰ��� �����带 �����Ͽ� ù��° �������� ����� 1-50���� ����ϰ�
//     �ι�° �������� ����� 51-100���� ����ϰ� �ٽ� ù��° �����尡 101-150 ���� ���.
// 	   �׸��� �� �ٽ� �ι�° �����尡 151-200 ����϶�.(synchronized ���)
public class Ex05 implements Runnable {
	int x = 0;

	@Override
	public synchronized void run() {
		for (;;) {

			try {
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName() + " : " + ++x);
				if (x % 2 ==0) {

					wait();

				} else {
					notify();
				}
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {

		Ex05 t = new Ex05();
		new Thread(t, "tiger").start();
		new Thread(t, "lion").start();
	}

}
