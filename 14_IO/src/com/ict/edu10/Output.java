package com.ict.edu10;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Output {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io14.txt";
		File file = new File(pathname);
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

			ArrayList<VO> list = new ArrayList<VO>();

			esc: while (true) {
				System.out.println("�̸��� �����̴�?");
				String name = sc.next();
				System.out.println("����?");
				int age = sc.nextInt();
				System.out.println("������?");
				double weight = sc.nextDouble();
				System.out.println("����?");
				boolean gender = sc.nextBoolean();
				VO vo = new VO(name, age, weight, gender);
				list.add(vo);
				while (true) {
					System.out.println("��� �ұ��? 1.yet  2.no");
					int su = sc.nextInt();
					if (su == 1) {
						continue esc;

					} else if (su == 2) {
						break;

					}

				}

			}
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
