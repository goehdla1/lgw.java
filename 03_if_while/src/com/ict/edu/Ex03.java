package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
		// ��ø if�� : if���� ������ ����� ��
		// ���� ) if(���ǽ�1){
		// ���ǽ���1�� ���϶� ���๮��;
		// }else if(���ǽ�2){
		// ���ǽ�1�� �����̰� , ���ǽ�2�� ���� ��� ���๮��;
		// }else if(���ǽ�3){
		// ���ǽ�1,2�� �����̰� , ���ǽ�3�� ���� ��� ���๮��;
		// }else{
		// ���ǽ� 1,2,3 ��� �����϶� , �� ������
		// }

		// int k1�� ������ 90�� �̻��̸� A���� , 80���̻��̸� B���� , 70�̻��̸� C���� , ������ F
		int k1 = 60;
		String str = "";
		if (90 <= k1) {
			str = "A����";

		} else if (80 <= k1) {
			str = "B����";

		} else if (70 <= k1) {
			str = "C����";

		} else {
			str = "F����";

		}

		System.out.println("��� : " + str);

		// char k2�� �빮������ , �ҹ������� , �������� , ��Ÿ�������� �Ǻ�
		char k2 = 100;

		if (k2 >= 'A' && k2 <= 'Z') {
			str = "�빮��";

		} else if (k2 >= 'a' && k2 <= 'z') {
			str = "�ҹ���";

		} else if (k2 >= 0 && k2 <= 9) {
			str = "����";

		} else {
			str = "��Ÿ����";
		}

		System.out.println("���: " + str);

		// char k3�� A,a�̸� ������ī B,b�̸� ����� C,c�̸� ĳ���� �������� �ѱ�

		char k3 = 'a';
		if (k3 == 'A' || k3 == 'a') {
			str = "������ī";

		} else if (k3 == 'B' || k3 == 'b') {
			str = "�����";

		} else if (k3 == 'C' || k3 == 'c') {
			str = "ĳ����";
		} else {
			str = "�ѱ�";

		}
		System.out.println("���: " + str);

		// menu�� 1�̸� ī���ī 3500 , 2�̸� ī��� 4000 , 3�̸� �Ƹ޸�ī�� 3000 ,
		// 4�̸� �����꽺 3500�̴�. ģ���� 2���� 10000������ �Ծ���.
		// �ܵ��� ���ΰ�? (��, �ΰ��� 10% ����)

		int menu = 1;
		int input = 10000;
		int mo = 3500;
		int ra = 4000;
		int aa = 3000;
		int fu = 3500;
		int su = 2;
		int res = 0;
		if (menu == 1) {
			res = (input - (int) ((mo * su) * (1.1)));

		} else if (menu == 2) {
			res = (input - (int) ((ra * su) * (1.1)));

		} else if (menu == 3) {
			res = (input - (int) ((aa * su) * (1.1)));

		} else if (menu == 4) {
			res = (input - (int) ((fu * su) * (1.1)));

		}
		System.out.println("�ܵ���:" + res);
		System.out.println("=========================�����丵 : 1. �ߺ��ڵ��� ������.");

		int dan2 = 0;
		String drink2 = "";
		menu = 1;
		if (menu == 1) {
			dan2 = 3500;
			drink2 = "ī���ī";

		} else if (menu == 2) {
			dan2 = 4000;
			drink2 = "ī���";

		} else if (menu == 3) {
			dan2 = 3000;
			drink2 = "�Ƹ޸�ī��";

		} else if (menu == 4) {
			dan2 = 3500;
			drink2 = "�����꽺";

		}
		int su2 = 2;
		int total2 = dan2 * su2;
		int vat2 = (int) (total2 * 0.1);
		int input2 = 10000;
		int output2 = input2 - (total2 + vat2);
		System.out.println("�ܵ�: " + output2);
	}
}