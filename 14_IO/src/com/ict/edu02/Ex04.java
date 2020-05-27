package com.ict.edu02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io02.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			String str = "Phone:010-9777-1111\n이름:임건우\nage:150";
			byte[] b = str.getBytes();
			fos.write(b);
			fos.flush();
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		finally {

			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}
}
