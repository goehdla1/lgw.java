package com.ict.edu07;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ouput {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io10.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// �������� ��ü ������ ��� ���� 
			VO vo1 = new VO("��浿", 34, 70.4, true);
			VO vo2 = new VO("������", 16, 56.4, false);
			VO vo3 = new VO("�Ѹ�", 14, 86.7, true);
			VO vo4 = new VO("����", 3, 74.1, true);
			VO vo5 = new VO("�����", 47, 94.1, false);
			
			ArrayList<VO> list = new ArrayList<VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			
			// ��ü ����ȭ
			oos.writeObject(list);
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