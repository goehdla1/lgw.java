package com.ict.edu04;
// FileInputSteam : read() : int(�ƽ�Ű�ڵ�) = > char����ȯ , read(byte[] b)

import java.io.File;
import java.io.FileReader;

// FileReader : read() : int(�����ڵ�) = > char����ȯ , read(char[] b)

public class Ex03 {

	public static void main(String[] args) {
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io06.txt";
		File file = new File(pathName);
		FileReader fr = null;
		try {
			fr = new FileReader(file);

			// �� ���� �б� : ��� ���ڸ� �о� �� �� �ִ�. // (�����ڵ�)
			// int k = fr.read();
			// System.out.println(k + " : " + (char) (k));

			// ��ü �б�
			// int k = 0;
			// while ((k = fr.read()) != -1) {
			// System.out.print((char)(k));

			// }
			// char[] �迭
			// char[] c = new char[(int) (file.length())];
			// fr.read(c);
			// for (char k : c) {
			// System.out.println(c);

			// }
			// String
			char[] c = new char[(int) (file.length())];
			fr.read(c);
			String str = new String(c);
			System.out.println(str);
			
		} catch (Exception e) {

		} finally {
			try {
				fr.close();
			} catch (Exception e2) {

			}
		}
	}
}
