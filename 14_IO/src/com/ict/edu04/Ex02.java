package com.ict.edu04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

// BufferedWriter : �ӵ� ���� �ٹٲٱ� �޼ҵ尡 �����Ѵ�.

public class Ex02 {
	public static void main(String[] args) {
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io07.txt";
		File file = new File(pathName);

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			// ����
			bw.write(97);
			bw.newLine();
			// char
			bw.write('e');
			bw.newLine();
			// char �迭
			char[] c = { 'j', 'a', 'v', 'a' };
			bw.write(c);
			bw.newLine();
			// String : �ٹٲٱ� �޼ҵ� = > newLine().
			bw.write("Korea");
			bw.newLine();
			bw.write("���ѹα�");
			bw.newLine();
			bw.write("��������");
			bw.newLine();
			bw.write("1324");
			bw.flush();
		} catch (Exception e) {

		} finally {
			try {
				bw.close();
				fw.close();

			} catch (Exception e2) {

			}
		}
	}
}
