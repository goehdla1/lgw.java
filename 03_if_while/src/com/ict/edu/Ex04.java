package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		// switch ~ case : if���� ���� ���ǹ�
		// if���� ���ǽ��� boolean ���̴�. �� �񱳿��� , �������� , boolean�� ���.
		// switch���� ���ڰ��� byte , short int char String �� �� ���.
		// ����: switch(���ڰ�){
		// case ���ǰ� 1 : ���ڰ��� ���ǰ� 1 �� ������ ������ ���� ; break ;
		// case ���ǰ� 2 : ���ڰ��� ���ǰ� 2 �� ������ ������ ���� ; break ;
		// case ���ǰ� 3 : ���ڰ��� ���ǰ� 3 �� ������ ������ ���� ; break ;
		// default : ���ǰ� 1,2,3 ��� ���� ���� �� ������ ���� ;
		// }
		// break �� ������ break�� ������ ���� ��� ���๮�� ����
		// break ������ ���� �����ϰ� �ִ� ������ ����� ����

		// char k1�� A�̸� ������ī B�̸� ����� C�̸� ĳ���� �������� �ѱ�

		char k1 = 'B';
		String res = "";
		switch (k1) {
		case 'A':
			System.out.println("������ī");
			break;
		case 'B':
			System.out.println("�����");
			break;
		case 'C':
			System.out.println("ĳ����");
			break;
		default:
			System.out.println("�ѱ�");
			break;
		}
		char k2 = 'B';
		switch (k2) {
		case 'A':
			res = "������ī";
			break;
		case 'B':
			res = "�����";
			break;
		case 'C':
			res = "ĳ����";
			break;
		default:
			res = "�ѱ�";
			break;
		}
		System.out.println("��� :" + res);
		// char k3�� A,a�̸� ������ī B,b�̸� ����� C,c�̸� ĳ���� �������� �ѱ�

		char k3 = 'B';
		String str = "";
		switch (k3) {
		case 'a':
			str = "������ī";
			break;
		case 'A':
			str = "������ī";
			break;
		case 'b':
			str = "�����";
			break;
		case 'B':
			str = "�����";
			break;
		case 'c':
			str = "ĳ����";
			break;
		case 'C':
			str = "ĳ����";
			break;

		default:
			str = "�ѱ�";
			break;
		}
		System.out.println("��� : " + str);

		switch (k3) {
		case 'a':
		case 'A':
			str = "������ī"; // => or ����. (a,A�� or �����̴�.)
			break;
		case 'b':
		case 'B':
			str = "�����"; // = > or ����.(b,B�� or �����̴�.)
			break;
		case 'c':
		case 'C':
			str = "ĳ����"; // = > or ����.(c,C�� or �����̴�.)
			break;
		default:
			str = "�ѱ�";
			break;
		}
		System.out.println("��� : " + str);

		// int k4�� 1 �Ǵ� 3�̸� ���� , 2 �Ǵ� 4�̸� ����
		int k4 = 1;
		switch (k4) {
		case 1:
		case 3:
			str = "����";
			break;
		case 2:
		case 4:
			str = "����";
			break;
		}
		System.out.println("���: " + str);

		// String k5 �� �ѱ��̸� ����, �߱��̸� �ϰ� , �Ϻ��̸� ���� , �̱��̸� ������

		String k5 = "�ѱ�";
		switch (k5) {
		case "�ѱ�":
			str = "����";
			break;
		case "�߱�":
			str = "�ϰ�";
			break;
		case "�Ϻ�":
			str = "����";
			break;
		case "�̱�":
			str = "������";
			break;
		}
		System.out.println("��� : " + str);

		// switch���� ������ �о����� �����������. (���� if�� �������.)
		// int k6�� ������ 90�� �̻��̸� A���� , 80���̻��̸� B���� , 70�̻��̸� C���� , ������ F

		int k6 = 97;
		switch ((int) (k6 / 10)) { // => ���� ����ȯ�� �Ѵ�. 9.1,9.2,9.3,9.x ... �� int�ιٲٸ� ��� 9�̴ϱ� ���� �� ��ȯ���� �������� ���Ѵ�. 
		case 10:
			str = "A";
		case 9:
			str = "A";
			break;
		case 8:
			str = "B";
			break;
		case 7:
			str = "C";
			break;

		default:
			str = "F";
			break;
		}
		System.out.println("���: " + str);

	}
}