package com.ict.edu2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io02.txt";
		File file = new File(pathname);
		FileInputStream fis = null; // ¿­°í
		try {
			fis = new FileInputStream(file);
			byte[] b = new byte[(int) (file.length())];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {

				}
				fis.close(); // ´Ý°í
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
