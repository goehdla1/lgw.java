package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		// for�� : ������ ��Ģ�� ���� ���๮�� �ݺ� ó���ϴ� ��
		// for�� ���� : (�ʱ��; ���ǽ�; ������){
		// ���ǽ��� ���϶� ������ ���� ;
		// }
		// for���� ������ �ʱ�ĺ��� �����Ѵ�. => ���ǽ����� �̵�
		// ���ǽ��� boolean�� (boolean,�񱳿���,��������)
		// ���ǽ��� ���̸� for�� ���� ������ �����Ѵ�.
		// ���ǽ��� �����̸� for�� �������� �ʴ´�.
		// for���� ���� ������ ������ ���������� ����.
		// �������� �ʱ���� �����ϰų� ���ҽ�Ű�� ������ �ϰ�
		// �ٽ� ���ǽ����� ����.
		// ���ϴ� ���� �ݺ������� ���� ����Ѵ�.

		// �ڹٿ����� if�� , switch�� , for�� �ȿ��� ���� ������
		// �ۿ��� ����� �� ����.

		// �ȳ��ϼ��� 10�� ����Ͻÿ�.
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("=========================================");

		for (int i = 1; i < 11; i++) { // ==> i = 1(����) , i < 11 (11��°�� ������ �� ��.)
			System.out.println(i + "Hello");
		}

		System.out.println("=========================================");

		// 0 ~ 10 ���� ����ϱ�.

		for (int i = 0; i < 11; i++) {
			System.out.println(i); // = > ���⼭ i �� ��� ���Ѵ�. (i++������)
		}

		System.out.println("=========================================");

		// 0 ~ 10���� ¦���� ����ϱ�.

		for (int i = 0; i < 11; i = i + 2) {

			System.out.println(i);
		}
		System.out.println("=========================================");

		// 0 ~ 10���� ¦���� ����ϱ�.
		
		for (int i = 0; i < 11; i++) {	 
			if (i % 2 == 0) {  				// = if�� ����!
				System.out.println(i);
			}
		}
		System.out.println("=========================================");

		// 0 ~ 10���� Ȧ���� ����ϱ�.
		
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}