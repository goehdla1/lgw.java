package com.ict.edu;

import java.util.Scanner;

public class Ex05 {
	// finally : ����ó���� ������� �ݵ�� �����ؾ� �Ǵ� ������ ó���Ҷ� ���.
	// �����ͺ��̽� , I/O , ��Ʈ��ũ���� �ַ� ����.
	// try {
	// ���ܹ߻� ������ �����;
	// } catch(���ܰ�ü e) {
	// ���ܹ߻� ������ ����;
	// } catch(���ܰ�ü e) {
	// ���ܹ߻� ������ ����;
	// } finally{
	// ������ �����ؾ� �ϴ� ����
	// }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int var = 50;
			System.out.println("���� �Է� : ");
			int su = sc.nextInt();
			System.out.println("���� : " + (var / su));

		} catch (Exception e) {
			System.out.println("����� �Է��ϼ���.");
			return;
		} finally {
			System.out.println("�ݵ�� �����ϴ� ����");
		}
		System.out.println("���� �ϼ̽��ϴ�.");
	}
}
