package com.ict.edu05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// InputStreamReader : InputStram = > Reader ( 바이트스트림 => 문자스트림)
// InputStream = > InputStreamReader = > Reader = > BufferedReader
public class Ex01 {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("원하는 문자 입력 : ");
		// String msg = sc.next();
		// System.out.println(msg);

		System.out.println("원하는 문자 입력 : ");
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			// System.in = 키보드
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine();
			System.out.println("받은 문자 : " + msg);

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
