package com.ict.edu04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

// BufferedWriter : 속도 향상과 줄바꾸기 메소드가 존재한다.

public class Ex02 {
	public static void main(String[] args) {
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io07.txt";
		File file = new File(pathName);

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			// 숫자
			bw.write(97);
			bw.newLine();
			// char
			bw.write('e');
			bw.newLine();
			// char 배열
			char[] c = { 'j', 'a', 'v', 'a' };
			bw.write(c);
			bw.newLine();
			// String : 줄바꾸기 메소드 = > newLine().
			bw.write("Korea");
			bw.newLine();
			bw.write("대한민국");
			bw.newLine();
			bw.write("大韓民國");
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
