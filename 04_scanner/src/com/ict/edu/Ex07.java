package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String drink = " ";
		int dan = 0;
		
		esc: while (true) {
			System.out.print("�� �ٷ� ?");
			int input = sc.nextInt();
			System.out.print("�޴��� �����ϼ���. 1. Ŀ������(3500) , 2. �̿�����(2500) , 3. ��(1500) , 4. �����꽺(4000) ��, �ΰ��� ����.");
			int menu = sc.nextInt();
			System.out.print("���� �帱���?");
			int su1 = sc.nextInt();
			su1 = 1;
			if (menu == 1) {
				drink = "Ŀ������";

				dan = 3500;

			} else if (menu == 2) {
				drink = "�̿�����";

				dan = 2500;

			} else if (menu == 3) {
				drink = "��";

				dan = 1500;

			} else if (menu == 4) {
				drink = "�����꽺";

				dan = 4000;

			}
			int vat = (int) (dan * 1.1);
			int output = (input - (vat*su1));
			System.out.println("�Աݾ�: " + input);
			System.out.println("������ ���� : " + drink);
			System.out.println("�ܵ��� ? : " + output);

			esc2: while (true) {
				System.out.println("��� ���� �Ͻǰ��ΰ���? 1.yes 2. no >>");
				int su = sc.nextInt();
				if (su == 1) {
					continue esc;

				} else if (su == 2) {
					break esc;

				} else {
					System.out.println("�ٽ��Է��ϼ���.");
					continue esc2;
				}

			}

		}
		System.out.println("�����մϴ�.");

	}
}
