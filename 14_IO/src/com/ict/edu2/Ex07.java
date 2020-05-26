package com.ict.edu2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex07 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io03.txt";
		File file = new File(pathname);

		FileOutputStream fos = null;
		// �ӵ� ����� ���� Buffer ��� // ȥ�ڼ��� ������� ���Ѵ�.
		BufferedOutputStream bos = null;

		try {
			// ��Ʈ�� ü�� ���.
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);

			// �ϳ� �� �� �ִ�.
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
				// �ݴ�� �ݾ����.
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
