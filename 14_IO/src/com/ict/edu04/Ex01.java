package com.ict.edu04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

// 문자스트림 : 모든 처리를 2byte씩 처리.
//		 대상 : 세계 모든 언어로 구성된 문서파일을 출력할 때 적합.
// 최상위 클레스 : Reader(입력), Writer(출력)
// FileOutputStream : 1byte 처리 , write(int b) , write(byte[] b)
// FileWriter : 2byte 처리 , write(int b) ,write(char[]b) , write(String str)

public class Ex01 {
	public static void main(String[] args) {
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io06.txt";
		File file = new File(pathName);

		FileWriter fw = null;

		try {
			fw = new FileWriter(file);
			// 숫자
			fw.write(97);
			// char
			fw.write('e');
			// char 배열
			char[] c = { 'j', 'a', 'v', 'a' };
			fw.write(c);
			//String
			fw.write("Korea\n");
			fw.write("대한민국\n");
			fw.write("大韓民國\n");
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
