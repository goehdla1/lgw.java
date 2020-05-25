package com.ict.edu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex09 {
	public static void main(String[] args) {
		// List �������̽� : �迭�� ����� ���� , ���� , ���� ,�߰��� �����Ӵ� , ũ�⸦ �̸� ������ �ʾƵ� �ȴ�.
		// ���� Ŭ���� : Stack , ArrayList , Vector;

		// ArrayList : ��Ƽ������ ����ȭ �������� ����
		// vector : ��Ƽ������ ����ȭ ������
		// ArrayList �� vector ������ ����.

		ArrayList<String> list = new ArrayList<String>();
		// �߰� , ���� : add
		list.add("����ȣ");
		list.add("�����");
		list.add("������");
		list.add(1, "�⼺��");

		System.out.println(list);
		System.out.println("=================================================");
		Vector<String> vector = new Vector<String>();
		vector.add("�⼺��");
		vector.add("������");
		vector.add("�����");
		vector.add(2, "����ȣ");

		System.out.println(vector);
		System.out.println("=================================================");

		if (list.contains("����ȣ")) {
			System.out.println(list.indexOf("����ȣ") + " ��° ��ġ");
			System.out.println(list.get(2));
			System.out.println(list.lastIndexOf("����ȣ") + " ��° ��ġ");
			list.set(0, "�ڼ���");
			// search , elementAt , firstElement() , lastElement() : ����
			// elementAt , firstElement() , lastElement() : vector�� ����.

		} else {
			System.out.println("�������� ����");
		}
		System.out.println(list);
		System.out.println("==================================================");

		if (vector.contains("�⼺��")) {
			System.out.println(vector.indexOf("�⼺��") + "�⼺�� ��ġ");
			System.out.println(vector.get(2));
			System.out.println(vector.lastIndexOf("�⼺��") + "��° ��ġ");
			System.out.println(vector.elementAt(1));
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());

		}
		// ġȯ
		vector.set(1, "���θ�");
		vector.setElementAt("�ڼ���", 2);
		System.out.println(vector);
		
		//ũ��
		System.out.println(list.size());
		System.out.println(vector.size());
		
		// ���
		for (String k : list) {
			System.out.println(k);
			
		}
		System.out.println("====================================================");
		Iterator<String> it = vector.iterator();
		while (it.hasNext()) {
			String res = (String) it.next();
			System.out.println(res);
			
		}
	}
}
