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

		String pathname2 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io15.txt";
		File file2 = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);

			ArrayList<VO> list = (ArrayList<VO>) ois.readObject();
			System.out.println("이름\t나이\t몸무게\t성별");
			for (VO k : list) {
				System.out.print(k.getName() + "\t");
				System.out.print(k.getAge() + "\t");
				System.out.print(k.getWeight() + "\t");
				System.out.println(k.isGender() + "\t");

				bw.write(k.getName() + "\t");
				bw.write(k.getAge() + "\t");
				bw.write(k.getWeight() + "\t");
				bw.write(k.isGender() + "\t");

			}
			bw.flush();

		} catch (Exception e) {

		} finally {

		}
		try {
			ois.close();
			bis.close();
			fis.close();
			bw.close();
			fw.close();

		} catch (Exception e) {

		}
	}

}
