package com.ict.edu04;
// FileInputSteam : read() : int(아스키코드) = > char형변환 , read(byte[] b)

import java.io.File;
import java.io.FileReader;

// FileReader : read() : int(유니코드) = > char형변환 , read(char[] b)

public class Ex03 {

	public static void main(String[] args) {
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io06.txt";
		File file = new File(pathName);
		FileReader fr = null;
		try {
			fr = new FileReader(file);

			// 한 글자 읽기 : 모든 글자를 읽어 올 수 있다. // (유니코드)
			// int k = fr.read();
			// System.out.println(k + " : " + (char) (k));

			// 전체 읽기
			// int k = 0;
			// while ((k = fr.read()) != -1) {
			// System.out.print((char)(k));

			// }
			// char[] 배열
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
