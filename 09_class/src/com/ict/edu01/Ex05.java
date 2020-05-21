package com.ict.edu01;

// 1. Member ���� Ŭ���� // 3. static ����Ŭ����
public class Ex05 {
	// ����ʵ�
	String name = "ȫ�浿";
	private int age = 24;
	static boolean gender;

	public Ex05() {
		System.out.println("�ܺ� : " + this);
	}

	// �ܺθ���޼ҵ�
	public void play() {
		int money = 10000;

		// ���������� static ���Ұ�.
		// static int time = 120 ;
		// static final int time = 120 ;

		System.out.println("�ܺ� �޼ҵ� : " + money);
	}

	// Member ���� Ŭ����
	public /* static */ class Inner01 {
		int k1 = 100;

		// ���� Ŭ���� ���� static ��� ����. => Ŭ������ static ���̸� ��밡��
		/* static */ int k3 = 300;

		// ��밡��
		static final int k2 = 200;

		public Inner01() {
			System.out.println("���� : " + this);
		}

		public void prn() {
			System.out.println(k1);
			System.out.println(k2);
			System.out.println(Inner01.k2);

			// �ܺ� Ŭ������ ����� ������� ��� �� �� �ִ�.
			System.out.println(name);
			System.out.println(age); // private ��밡��.
			System.out.println(
					"=================================================================================================");
			play();

		}
	} // ���� Ŭ���� ��

	// static ���� Ŭ����
	public static class Inner02 {
		int a1 = 100;
		final int a2 = 200;
		static int a3 = 300; // Ŭ������ static�� ������ ������ ����
		static final int a4 = 400;

		public void go() {
			// �ܺ�Ŭ������ �ν��Ͻ� �������� �� ������.
			// System.out.println(name);
			// System.out.println(age);

			// �ܺ�Ŭ������ static
			System.out.println(gender);
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);

		}

		// static �޼ҵ�� static �� ��� ����
		public static void go2() {
			// System.out.println(name);
			// System.out.println(age);
			// System.out.println(a1);
			// System.out.println(a2);
			System.out.println(gender);
			System.out.println(a3);
			System.out.println(a4);
		}

	}

} // �ܺ� Ŭ����