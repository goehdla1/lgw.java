package com.ict.edu2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex06 {
	public static void main(String[] args) {
		// 사진, 동영상, 음악은 1byte씩 처리해야 된다.
		// 읽는 위치
		String pathname1 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "자바.png";
		File file = new File(pathname1);

		// 쓰는 위치
		String pathname2 = "C:" + File.separator + "study" + File.separator + "자바.png";
		File file2 = new File(pathname2);

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			int k = 0;
			// 동영상 , 사진 파일은 이렇게 써야한다.
			while ((k = fis.read()) != -1) {
				fos.write(k);
			}
			fos.flush();
		} catch (Exception e) {

		} finally {
			try {
				if (fos != null)
					fos.close();
				if (fis != null)
					fis.close();
			} catch (Exception e2) {

			}

		}
	}
}
