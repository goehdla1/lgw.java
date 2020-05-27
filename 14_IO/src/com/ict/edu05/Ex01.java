package com.ict.edu05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// InputStreamReader : InputStram = > Reader ( ����Ʈ��Ʈ�� => ���ڽ�Ʈ��)
// InputStream = > InputStreamReader = > Reader = > BufferedReader
public class Ex01 {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("���ϴ� ���� �Է� : ");
		// String msg = sc.next();
		// System.out.println(msg);

		System.out.println("���ϴ� ���� �Է� : ");
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			// System.in = Ű����
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine();
			System.out.println("���� ���� : " + msg);

		} catch (Exception e) {

		} finally {
			try {
				br.close();
				isr.close();

			} catch (Exception e2) {

			}
		}

	}

}
