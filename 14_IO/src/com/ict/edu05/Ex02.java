package com.ict.edu05;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

// OutputStreamWriter : OuputStream = > Writer(����Ʈ��Ʈ�� = > ���ڽ�Ʈ��)
// OutputStream = > OutputStreamWriter = > Writer = > BufferedWriter
public class Ex02 {
	public static void main(String[] args) {
		// System.out.println("Hello World");

		OutputStreamWriter osw = null;
		BufferedWriter bw = null;

		// System.out = �����
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			bw.write("Welcom ���ѹα�");
			bw.flush();
		} catch (Exception e) {

		} finally {

		}
		try {
			bw.close();
			osw.close();

		} catch (Exception e) {

		}

	}

}
