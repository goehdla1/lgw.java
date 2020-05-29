package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex06 {
	public static void main(String[] args) {
		// ����, ������, ������ 1byte�� ó���ؾ� �ȴ�.
		// �д� ��ġ
		String pathname1 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "�ڹ�.png";
		File file = new File(pathname1);

		// ���� ��ġ
		String pathname2 = "C:" + File.separator + "study" + File.separator + "�ڹ�.png";
		File file2 = new File(pathname2);

		// Buffered �� ȥ�� ����Ҽ��� ����.
		FileInputStream fis = null;
		BufferedInputStream bis = null;

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			// ��Ʈ�� ü�� ���
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(file2);
			bos = new BufferedOutputStream(fos);
			int k = 0;
			// ������ , ���� ������ �̷��� ����Ѵ�.
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