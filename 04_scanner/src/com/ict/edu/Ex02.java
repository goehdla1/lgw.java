package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// ���ڸ� �޾Ƽ� Ȧ��, ¦���� ��������.
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int su = sc.nextInt();
		String result = " ";
		if (su % 2 == 0) {
			result = "¦��";

		} else {
			result = "Ȧ��";

		}

		System.out.println("��� : " + result);

		// ���� �Է��ϸ� ������ ��µǰ� ����
		// 1.�ѱ�=���� , 2.�߱�=����¡ 3.�Ϻ�=���� �������� ������ ����.
		System.out.print("�����Է� : 1.�ѱ�=����, 2.�߱� = ����¡ 3. �Ϻ�=���� >>");
		int num = sc.nextInt();
		result = "";

		if (num == 1) {
			result = "�ѱ�=����";

		} else if (num == 2) {
			result = "�߱� = ����¡";
		} else if (num == 3) {
			result = "�Ϻ� = ����";

		} else {
			result = "������ ����";

		}
		System.out.println("��� : " + result);

		System.out.print("�����Է� :�ѱ�, �߱� ,�Ϻ� >>");     // ==> ��Ʈ������ ����� ����.

		String country = sc.next();
		result = "";
		switch (country) {
		case "�ѱ�": result = "����"; break;
		case "�߱�": result = "����¡"; break;
		case "�Ϻ�": result = "����"; break;

		default: result = "������ ����";
			break;
		}
		System.out.println("��� : " + result);
		

		// �ٹ��ð��� 8�ð������� �ð��� 8590 �̰�
		// 8�ð��� �ʰ��� �ð� ��ŭ�� 1.5�� �����Ѵ�.
		// �ٹ��ð��� �Է��ؼ� �˹ٱݾ��� ��������.

		System.out.print("�ٹ��ð��� �Է��Ͻÿ�. : ");
		int su1 = sc.nextInt();
		int dan = 8590;
		int over = (int) (8590 * 1.5);
		int res = 0;
		if (su1 > 8) {
			res = (dan * 8) + (over * (su1 - 8));

		} else {
			res = (dan * su1);

		}
		System.out.println("�˹ٱݾ��� : " + res);

		// menu�� 1 �̸� ī���ī 3500, 2�̸� ī��� 4000,
		// 3�̸� �Ƹ޸�ī�� 3000, 4�̸� �����꽺 3500�̴�.
		// ģ���� 2���� 10000������ �Ծ���.
		// �޴��� �� ����� �ܵ��� ���(��, �ΰ��� 10% ����)
		System.out.print("menu ���� : \n1.ī���ī(3500)  \n2. ī���(4000)  \n3.�Ƹ޸�ī��(3000)  \n4. �����꽺 (3500) >> ");

		int menu = sc.nextInt();
		int input = 10000;
		int su3 = 2;
		int choice = 0;
		String drink = "";
		
		if (menu == 1) {
			choice = 3500;
			drink = "ī���ī";

		} else if (menu == 2) {
			choice = 4000;
			drink = "ī���";

		} else if (menu == 3) {
			choice = 3000;
			drink = "�Ƹ޸�ī��";

		} else if (menu == 4) {
			choice = 3500;
			drink = "�����꽺";

		}
		
		int vat = (int)(choice * 1.1);
		int total = (su3 * vat);
		int output = (input - total);
		
		System.out.println("�� �޴��� : " + drink + " �ܵ��� : " + output);

	}
}
