package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		// while �� : for ���� ���� �ݺ���
		// ����1 :
		// �ʱ��
		// while(���ǽ�){
		// ���ǽ��� ���϶� ����;
		// ������;
		// }
		// while���� ���� ������ ������ ���ǽ����� ����.

		// ����2 :
		// �ʱ��
		// while(true){
		// if(������������) - break;
		// ���ǽ��� ���϶� ����;
		// ������;
		// }
		// while���� ���� ������ ������ ���ǽ����� ����.

		// 0 - 10 ���� ���.
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " ");

		}
		System.out.println();

		int k1 = 0; // ==> �ʱ��
		while (k1 < 11) { // ==> ������ ������ �˶� ���� ����.
			System.out.print(k1 + " ");
			k1++; // ==> ������
		}

		System.out.println();

		int k2 = 0;
		while (true) { // ==> ������ ������ ���߿� ���ö� ���� ����.
			System.out.print(k2 + " ");
			k2++;
			if (k2 > 10)
				break; // ==> ���� ���� ������. ���������� �ʈf��.
		}
		System.out.println();

		// 0 ~ 10���� ¦���� ����ϱ�.
		int k3 = 0;
		while (k3 < 11) {
			if (k3 % 2 == 0) {
				System.out.print(k3 + " ");
			}
			k3++;
		}
		System.out.println();
		// 0 ~ 10���� Ȧ���� ����ϱ�.

		int k4 = 0;
		while (k4 < 11) {
			if (k4 % 2 == 1) {
				System.out.print(k4 + " ");
			}
			k4++;
		}
		System.out.println();
		// 0 ~ 50 ���� 7�� ��� ���

		int k5 = 0;
		while (k5 < 51) {
			if (k5 % 7 == 0) {
				System.out.print(k5 + " ");
			}
			k5++;
		}
		System.out.println();

		// a - g

		char k6 = 'a';
		while (k6 <= 'g') {
			System.out.print(k6 + " ");
			k6++;
		}
		System.out.println();
		// ������ 5�� ����ϱ�.

		int k7 = 1;
		while (k7 < 10) {
			System.out.println("5*" + k7 + "=" + (5 * k7));
			k7++;

		}
		System.out.println();
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0

		int k8 = 1;
		while (k8 < 17) {

			System.out.print("0 ");

			if (k8 % 4 == 0) {
				System.out.println();

			}
			k8++;
		}
		System.out.println();

		int k9 = 1;
		while (k9 < 5) {
			System.out.println("0 0 0 0");
			k9++;

		}
		// ����
		// 0 - 10 ���� ������.
		int v1 = 0;
		int sum = 0;
		while (v1 < 11) {
			sum = sum + v1;

			v1++;
		}
		System.out.println(sum);
		// 0 - 10 Ȧ���� �հ�.

		int v2 = 0;
		int sum1 = 0;
		while (v2 < 11) {
			if (v2 % 2 == 1) {
				sum1 = sum1 + v2;

			}

			v2++;
		}
		System.out.println(sum1);

		// 0 - 10 ¦���� �հ�.
		
		int v3 = 0;
		int sum2 = 0;
		while (v3 < 11) {
			if (v3 % 2 == 0) {
				sum2 = sum2 + v3;

			}

			v3++;
		}
		System.out.println(sum2);

		// 0 - 10 Ȧ��,¦���� �հ�
		int sum3 = 0 ;
		int sum4 = 0 ;
		int v4 = 0 ;
		while (v4 < 11) {
			if (v4 % 2 == 0) {
			sum3 = sum3 + v4;
				
				
			} else {sum4 = sum4 + v4;
				
			}
			v4++;
		}
		System.out.println("¦���� ���� = " + sum3 + ", Ȧ���� ���� = " + sum4 + " �� �� =" + (sum3+sum4));
		// 7!
		
		int v5 = 7;
		int ss = 1;
		while (v5 > 0) {
			ss = ss * v5;
			v5--;
		}
		System.out.println("7! = " + ss);
	}
}