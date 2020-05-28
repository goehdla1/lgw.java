package com.ict.edu10;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Input {
	public static void main(String[] args) {

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io14.txt";
		File file = new File(pathname);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

			// ���������� ������ �����. output���� list�� ����߱⋚���� .
			ArrayList<VO> list = (ArrayList<VO>) ois.readObject();

			System.out.println("�̸�\t����\t���\t����");
			for (VO k : list) {
				System.out.print(k.getName() + "\t");
				System.out.print(k.getSum() + "\t");
				System.out.print(k.getAvg() + "\t");
				System.out.println(k.getHak() + "\t");

			}

		} catch (Exception e) {

		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();

			} catch (Exception e) {

			}

		}

	}

}
