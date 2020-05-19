package com.ict.edu5;

public abstract class Animal {
	// �߻� Ŭ���� : �߻�޼ҵ带 ������ �ִ� Ŭ������ �߻� Ŭ������� �Ѵ�.
	// �Ϲ����� ����ʵ�� ����޼ҵ嵵 ������ ���� �� �ִ�.

	// �߻� �޼ҵ� : body�� ���� �޼ҵ�({���೻��})�� �߻� �޼ҵ��� �Ѵ�.
	// �ݵ�� abstract ���� ����Ѵ�.
	// �ݵ�� Ŭ�������� abstract�� �پ�� �Ѵ�.

	int su1 = 10;
	static int su2 = 20;
	final int su3 = 30;
	static final int su4 = 40;

	public void play() {
		su1++;
		su2++;
		// su3++;
		// su4++;

	}

	// static �޼ҵ�
	public static void prn() {
		int k1 = 100;
		// ������������ static�� ����� �� ����.
		// static int k2 = 200;

		// ���� ������ �ν��Ͻ� ������ �� �� ����.
		// System.out.println(su1);
		System.out.println(su2);
		// ���� ������ �ν��Ͻ� ����� �� �� ����.
		// System.out.println(su3);
		System.out.println(su4);
	}

	// �߻�޼ҵ� , �߻�޼ҵ�� �ݵ�� abstract�� �پ�� �Ѵ�.
	// �ݵ�� Ŭ�������� abstract�� �پ�� �Ѵ�.
	public abstract void like();

	// static�� ������� ������
	// public static abstract void like();
}
