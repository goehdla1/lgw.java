package com.ict.edu;

public class Ex01 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �ܼ� if : ������ ���϶��� ���� , ���������� if�� ����
		// ���ǽ� : boolean , ��(����)����
		// ���� : if(���ǽ�){
		// ���ǽ��� ���϶� ���� ����;
		// ���ǽ��� ���϶� ���� ����;
		// }
		// ��, ���๮���� �� �� �� ���� { } ���� ����

		// int k1 �� 60�̻��̸� �հ�,
		int k1 = 50;
		String str = "�ʱⰪ";
		if (k1 >= 60) {
			str = "�հ�";
		}
		System.out.println("���:" + str);
		System.out.println("�����ϼ̽��ϴ�.");

		// int k2 �� 60�̻��̸� �հ�, 60 �̸��� ���հ�
		int k2 = 59;
		str = "�ʱⰪ";
		if (k2 >= 60) {
			str = "�հ�";
		}
		if (k2 < 60) {
			str = "���հ�";
		}
		System.out.println("���:" + str);
		
		// k2 �� k3 �� ����. k3�� �� ����
		// int k3 �� 60�̻��̸� �հ�, 60 �̸��� ���հ�
		int k3 = 59;
		str = "���հ�";
		if (k3 >= 60) {
			str = "�հ�";
		}
		System.out.println("���:" + str);
		
		// Ȧ�� ¦�� �Ǻ�
		int k4 = 7;
		str = "Ȧ��";
				if ((k4 % 2) == 0) {
					str = "¦��";
					
				}
				System.out.println("���:" + str);
		// �빮��,�ҹ��� �Ǻ� ����
		char k5 = 'b';
		String str4 = "�빮��";
		if (k5 >= 'a' && k5 <= 'z') {
			str4= "�ҹ���";
			
		}
		System.out.println("���:" + str4);
		// 1 �Ǵ� 3�̸� ���� , �ƴϸ� ����
		int k6 = 1;
		str = "����";
		if ((k6 == 1) || (k6 ==3)) {
			str = "����";
			System.out.println("���:" + str);
			
		}
		
		
		// �ٹ��ð��� 8�ð������� �ð��� 8590�̰�
		// 8�ð��� �ʰ��� �ð� ��ŭ�� 1.5�� �����Ѵ�.
		// ���� �ٹ��� �ð��� 10�̴�.
		// �󸶸� �޾ƾ� �ϴ°�?
		
		int time = 10 ; 
		int dan = 8590;
		double dan1 = 8590*1.5;
		int pay = time*dan;
		if (time>8) {pay =(int)((time-8)*dan1 + 8*dan);
			
		}
		System.out.println(pay);
		//�� �� �� ū ���� ����Ͻÿ�.
		
		int k7 = 10;
		int k8 = 15 ;
		int result = 0;
		result= k8 ;
		if (k7 > k8) {
			result = k7;
		}
		System.out.println("���:" + result);
	}
}