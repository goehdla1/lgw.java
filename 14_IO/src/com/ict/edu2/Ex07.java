package com.ict.edu2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex07 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io03.txt";
		File file = new File(pathname);

		FileOutputStream fos = null;
		// 속도 향상을 위해 Buffer 사용 // 혼자서는 사용하지 못한다.
		BufferedOutputStream bos = null;

		try {
			// 스트림 체인 방식.
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);

			// 하나 쓸 수 있다.
			bos.write(105);
			bos.write('c');
			bos.write('t');

			byte[] b = { 'e', 'd', 'u' };
			bos.write(b);
			String msg = "Hello World";
			byte[] b2 = msg.getBytes();
			bos.write(b2);

			bos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				// 반대로 닫아줘라.
				if (bos != null)
					bos.close();
				if (fos != null)
					fos.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
