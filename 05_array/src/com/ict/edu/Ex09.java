package com.ict.edu;

public class Ex09 {
	public static void main(String[] args) {
		// ������ �迭 : 1���� �迭�� ������ ���� ��.
		// �������� : 1���� �迭 �ȿ� �����ϴ� �迭�� ���� �������� ����.

		// ���� : �ڷ���[][] �̸�;
		// ���� : �̸� = new �ڷ���[1�����迭�� ��][] ;

		// ����� ������ �ѹ���!! : �ڷ���[][] �̸� = new �ڷ���[1���� �迭�� ��][];

		char[][] ch = new char[3][];

		// ������ ���� (�������̿����� ���� == > �����߻�)
		// ch[0][0] = 'a';
		// ch[0][1] = 'A';
		// ch[1][0] = 'b';
		// ch[1][1] = 'B';
		// ch[2][0] = 'c';
		// ch[2][1] = 'C';

		char[] k1 = {'j','a','v','a'};
		char[] k2 = {'j','s','p'};
		char[] k3 = {'a','n','d','o','r','i','d'};
		
		ch[0] = k1;
		ch[1] = k2;
		ch[2] = k3;
				
		// ����ϱ�.
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.print(ch[i][j]);
				
			}
			System.out.println();
		}
		System.out.println("============================================================================");
		
		// ���� , ���� , ������ ���� �ѹ���
		int[][] c1 = {{1,2},{4,5,6,7,8},{10,20,30}};
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c1[i].length; j++) {
				System.out.print(c1[i][j]);
				
			}
			System.out.println();
		}
	}
}
