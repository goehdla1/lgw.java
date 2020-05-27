package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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

		// Buffered 는 혼자 사용할수가 없다.
		FileInputStream fis = null;
		BufferedInputStream bis = null;

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			// 스트림 체인 방식
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(file2);
			bos = new BufferedOutputStream(fos);
			int k = 0;
			// 동영상 , 사진 파일은 이렇게 써야한다.
			while ((k = fis.read()) != -1) {
				bos.write(k);
			}
			bos.flush();
		} catch (Exception e) {

		} finally {
			try {
				if (bos != null)
					bos.close();
				if (fos != null)
					fos.close();
				if (bis != null)
					bis.close();
				if (fis != null)
					fis.close();
			} catch (Exception e2) {

			}

		}
	}
}
