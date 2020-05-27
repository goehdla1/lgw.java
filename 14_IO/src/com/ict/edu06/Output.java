package com.ict.edu06;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// ObjectOutputStream : ��ü ��� ��Ʈ�� , ����Ʈ ��Ʈ�� - > writeObject �� ������ �ִ�.
// writeObject() => ����ȭ �޼ҵ�
// ���°�. => Output , VO
public class Output {
	public static void main(String[] args) {
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io09.txt";
		File file = new File(pathName);

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

			// �ϳ��� ��ü ������ ��� ����. // ��üȭ
			VO vo = new VO("��浿", 34, 70.4, true);
			// ��ü ����ȭ
			oos.writeObject(vo);
			oos.flush();

		} catch (Exception e) {

		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();

			} catch (Exception e2) {

			}
		}
	}

}
