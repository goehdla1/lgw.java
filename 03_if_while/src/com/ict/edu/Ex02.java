package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// if ~ else ~ : ���ǽ��� ���϶��� �����϶� ���� ������ ó���Ѵ�.
		// ���� : if(���ǽ�){
		// ���ǽ��� ���϶� ���� ����;
		// ���ǽ��� ���϶� ���� ����;
		// }else{
		// ���ǽ��� �����϶� ���� ����;
		// ���ǽ��� �����϶� ���� ����;
		// }

		// int k1 �� 60�̻��̸� �հ�,������ ���հ�
		int k1 = 70;
		String str = "�ʱⰪ";
		if (k1 >= 60) {
			str = "�հ�";

		} else {
			str = "���հ�";

		}
		System.out.println("��� :" + str);

		str = (k1 >= 60) ? "���հ�" : "�հ�";

		System.out.println("��� :" + str);

		// Ȧ�� ¦�� �Ǻ�
		int k2 = 258;
		if (k2 % 2 == 0) {
			str = "¦��";

		} else {
			str = "Ȧ��";

		}
		System.out.println("��� :" + str);

		str = (k2 % 2 == 1) ? "Ȧ��" : "¦��";
		System.out.println("��� :" + str);

		// �빮��,�ҹ��� �Ǻ� ����
		char k3 = 'v';
		if (k3 >= 'a' && k3 <= 'z') {
			str = "�ҹ���";

		} else {
			str = "�빮��";

		}
		System.out.println("��� :" + str);

		str = (k3 >= 'A' && k3 <= 'Z') ? "�빮��" : "�ҹ���";
		System.out.println("��� :" + str);

		// 1 �Ǵ� 3�̸� ���� , �ƴϸ� ����
		int k4 = 2;
		if (k4 == 1 || k4 == 3) {
			str = "����";

		} else {
			str = "����";

		}
		System.out.println("��� :" + str);

		str = (k4 == 1 || k4 == 3) ? "����" : "����";
		System.out.println("��� :" + str);

		// �ٹ��ð��� 8�ð������� �ð��� 8590�̰�
		// 8�ð��� �ʰ��� �ð� ��ŭ�� 1.5�� �����Ѵ�.
		// ���� �ٹ��� �ð��� 10�̴�.
		// �󸶸� �޾ƾ� �ϴ°�?

		int time = 8;
		int dan = 8590;
		double overdan = 8590 * 1.5;
		int pay = 0;
		if (time > 8) {
			pay = (8 * dan) + (int) ((time - 8) * overdan);

		} else {
			pay = dan * time;

		}
		System.out.println("��� :" + pay);

		pay = (time > 8) ? (dan * 8 + (int) (overdan * (time - 8))) : (dan * time);
		System.out.println("��� :" + pay);

		// �� �� �� ū ���� ����Ͻÿ�.
		int k5 = 2580;
		int k6 = 15778;
		int res = 0;
		if (k5 > k6) {
			res = k5;

		} else {
			res = k6;

		}
		System.out.println("��� :" + res);

		res = (k5 > k6) ? k6 : k5;
		System.out.println("��� :" + res);

		}
	}