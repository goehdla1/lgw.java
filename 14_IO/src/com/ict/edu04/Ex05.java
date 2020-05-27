package com.ict.edu04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

// PrintWriter : ����Ʈ��Ʈ�� , ���ڽ�Ʈ��  ��� ���ڷ� ���� �� �ִ�.
public class Ex05 {
	public static void main(String[] args) {
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io08.txt";
		File file = new File(pathName);
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);

			pw.print("printWriter�� ������ �����Ѵ�.");
			pw.print(true);
			pw.print(1234);
			pw.println();
			pw.print(3.14);
			pw.print('c');
			pw.flush();

		} catch (Exception e) {

		} finally {
			try {
				pw.close();
				bw.close();
				fw.close();

			} catch (Exception e2) {

			}
		}
	}
}
