package com.ict.edu4;

// ���� ������ : �Ϲ� �������� �۾��� ���� �������� ������ �����ϴ� ������.
//				 �Ϲ� �����尡 �����ϸ� ���� ������� ���������� ���� �ȴ�.

public class Ex01 implements Runnable {
	boolean autoSave = false;

	@Override
	public void run() {
		while (true) {
			try {
				// 1000�п� 1�ʴ� . �� 3�ʵ��� ����.
				Thread.sleep(1000 * 3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(1);

		}
	}

	public static void main(String[] args) {
		Ex01 e1 = new Ex01();
		Thread thread = new Thread(e1);
		thread.setDaemon(true); // main �޼ҵ� ���� ������ . ���ӵǾ� �ִ� ������� �ڵ� ���� ��Ų��.
		thread.start();

		for (int i = 1; i < 15; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			System.out.println(i);
		}

		System.out.println("���α׷� ����");
	}

}
