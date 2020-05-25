package com.ict.edu3;

public class Test_Main {
	public static void main(String[] args) {
		Ex01 testA = new Ex01();
		Ex02 testB = new Ex02();

		// test A , test B Runnable�� ������ �����Ͽ����Ƿ� , start()�� ����.
		// start() = > run() ���� ���� ������ ������ ó���� �ƴϴ�.
		// testA.run() ;
		// testB.run() ;

		// start()�� Thread Ŭ������ ������ �����Ƿ�
		// Thread Ŭ������ Ȱ���ؾ� �ȴ�.

		// ��� 1 : Runnable�� ��ӹ��� ��ü�� Thread �����ڿ� �־��ش�.
		Thread thread = new Thread(testA);
		thread.start();
	
		
		// ���� �ΰ��� �ϳ��� ��ģ��.
		new Thread(testB).start();

		// ��� 2 : �ȵ���̵忡�� ����ϴ� ���(�͸� ����Ŭ����)
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + " : �������������� ");

				}

			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
			System.out.println(Thread.currentThread().getName() + " ����������������");
				
			}
		}).start();
	}
}
