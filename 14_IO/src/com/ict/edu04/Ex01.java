package com.ict.edu04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

// ���ڽ�Ʈ�� : ��� ó���� 2byte�� ó��.
//		 ��� : ���� ��� ���� ������ ���������� ����� �� ����.
// �ֻ��� Ŭ���� : Reader(�Է�), Writer(���)
// FileOutputStream : 1byte ó�� , write(int b) , write(byte[] b)
// FileWriter : 2byte ó�� , write(int b) ,write(char[]b) , write(String str)

public class Ex01 {
	public static void main(String[] args) {
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io06.txt";
		File file = new File(pathName);

		FileWriter fw = null;

		try {
			fw = new FileWriter(file);
			// ����
			fw.write(97);
			// char
			fw.write('e');
			// char �迭
			char[] c = { 'j', 'a', 'v', 'a' };
			fw.write(c);
			//String
			fw.write("Korea\n");
			fw.write("���ѹα�\n");
			fw.write("��������\n");
			fw.write("1324\n");
			fw.flush();
		} catch (Exception e) {

		} finally {
			try {

			} catch (Exception e2) {

			}
		}
	}
}
