package com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex12 {
	public static void main(String[] args) {
		// ���ѹα� , ĳ���� , ���� , �������� ������ ���� HashMap�� �����Ű��
		// ���ϴ� ���� key ���� �Ǿ� , ȭ�鿡�� ���� ����� ������ ��µǴ� ���α׷� �ۼ�

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("���ѹα�", "����");
		map.put("�ѱ�", "����");
		map.put("korea", "����");
		map.put("ĳ����", "��Ÿ��");
		map.put("����", "����");
		map.put("������", "����");
		Set<String> set = map.keySet();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("�����Է� : ");
			String str = sc.next();
			str = str.toLowerCase();
			if (set.contains(str)) {
				String result = map.get(str);
				System.out.println(str + "�� ������" + result + "�Դϴ�.");

			} else {
				System.out.println("�����Ϳ� ���� ���� �Դϴ�.");
			}

			System.out.println("����ұ��(y/n)");
			String msg = sc.next();
			if (msg.equalsIgnoreCase("n"))
				break;
		}
	}
}
