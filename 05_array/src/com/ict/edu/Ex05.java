package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		String[] name = { "ȫ", "��", "��", "��", "��" };
		int[] kor = { 80, 90, 80, 70, 100 };
		int[] eng = { 80, 95, 85, 70, 100 };
		int[] math = { 100, 100, 100, 100, 100 };

		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		int[] rank = { 1, 1, 1, 1, 1 };

		// ���� , ��� , ����
		for (int i = 0; i < 5; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
		}
		for (int i = 0; i < 5; i++) {
			avg[i] = (int) (sum[i] / 3.0 * 10) / 10.0;

			if (avg[i] >= 90) {
				hak[i] = "A";

			} else if (avg[i] >= 80) {
				hak[i] = "B";

			} else if (avg[i] >= 70) {
				hak[i] = "C";

			} else {
				hak[i] = "F";
			}
		}
		for (String k0 : name) {
			System.out.print(k0 + " ");

		}
		System.out.println();

		for (int k : sum) {
			System.out.print("����" + k + " ");
		}

		System.out.println();
		for (double k2 : avg) {
			System.out.print("���" + k2 + " ");

		}
		System.out.println();
		for (String k3 : hak) {
			System.out.print(k3 + "���� ");

		}
		// rank
		double su[] = { 86.6, 95.0, 88.3, 80.0, 100.0 };
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (su[i] < su[j]) {
					rank[i]++;

				}

			}

		}

		System.out.println();
		// ���
		for (int k5 : rank) {
			System.out.print(k5 + " ");
			

		}
		System.out.println();
		System.out.println("�� ��\t�� ��\t�� ��\t�� ��\t�� ��");
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.println(rank[i]+"\t");
			
		}
	}

}
