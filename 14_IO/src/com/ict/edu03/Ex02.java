package com.ict.edu03;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

// printStream�� ��� �ڷ����� ����� �� �ִ�.
// ������ ȭ���̳� ���Ͽ� ����Ѵ�. (�������)
public class Ex02 {
	public static void main(String[] args) {
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io05.txt";
		File file = new File(pathName);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;

		try {
			// ȭ�鿡 ���
			System.out.println(true);
			System.out.println(10);
			System.out.println(24.1);
			System.out.println('c');
			System.out.println("Hello");
			System.out.println("���ѹα�");

			// ���Ͽ� ���
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);

			ps.println(true);
			ps.println(10);
			ps.println(24.1);
			ps.println('c');
			ps.println("Hello");
			ps.println("���ѹα�");
			ps.flush();

		} catch (Exception e) {

		} finally {
			try {
				ps.close();
				bos.close();
				fos.close();

			} catch (Exception e2) {

			}
		}
	}
}
