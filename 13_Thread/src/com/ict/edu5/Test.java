package com.ict.edu5;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Test {
	public static void main(String[] args) {

		String pathName = "C" + File.separator + "study" + File.separator + "test2.txt";
		File file = new File(pathName);

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			// int m = bis.read();
			// System.out.println((char) (m));
			// int m1 = 0;
			// while ((m1 = bis.read()) != -1) {
			// System.out.println(m1);

			// }

			// byte[] b = new byte[(int) file.length()];
			// bis.read(b);
			// for (byte k : b) {
			// System.out.println((char) (k));

			// }
			byte[] b1 = new byte[(int) (file.length())];
			bis.read(b1);
			String msg = new String(b1);
			System.out.println(msg);

		} catch (

		Exception e) {

		} finally {
			try {
				if (fis != null)
					fis.close();
				if (bis != null)
					bis.close();
			} catch (Exception e2) {

			}
		}
	}

}
