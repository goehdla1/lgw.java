package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Աݾ� : ?");
		int input = sc.nextInt();
		System.out.print("�޴��� �����ϼ���. 1. Ŀ������(3500) , 2. �̿�����(2500) , 3. ��(1500) , 4. �����꽺(4000) ");
		int menu = sc.nextInt();
		int dan = 0;
		String drink = " ";
		if (menu == 1) {
			drink = "Ŀ������";
			dan = 3500;
		}else if (menu == 2) {
			drink = "�̿�����";
			dan = 2500;
			
		}else if (menu == 3) {
			drink = "��";
			dan = 1500;
			
		}else if (menu == 4) {
			drink = "�����꽺";
					dan = 4000;
			
		}
		int output = input - 
				int vat = (dan*1.1);
		
		
		System.out.println("�Աݾ�: " + input);
		System.out.println("������ ���� : " + menu);
		System.out.println("�ܵ��� ? : " + );
	}
}
