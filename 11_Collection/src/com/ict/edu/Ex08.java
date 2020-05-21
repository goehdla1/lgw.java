package com.ict.edu;

import java.util.Iterator;
import java.util.Stack;

public class Ex08 {
	public static void main(String[] args) {
		// List �������̽� : �迭�� ����� ���� , ���� , ���� ,�߰��� �����Ӵ� , ũ�⸦ �̸� ������ �ʾƵ� �ȴ�.
		// ���� Ŭ���� : Stack , ArrayList , Vector;
		// Stack : LIFO(Last In First Out) : �������� ���� �����Ͱ� ���� ������ ����
		// add, push, addElement = > �߰�
		// add(index , E ) = > ���� ( ��ġ���� �ָ� �߰��� �� �� �ִ�.)
		// pop : �� ���� �����ϴ� ��ü�� ��ȯ�ϰ� �����Ѵ�.
		// peek : �� ���� �����ϴ� ��ü�� ��ȯ
		// search : �˻� (������ 1����)
		// indexOf : �˻� (���� 0����)
		// elementAt (index) => ���� (���� 0����)
		// get(index) : ���� (���� 0����)
		// firstElement() => �� ó�� ��� ����
		// lastElement() => ������ ��� ����
		// setElmentAt(Element , index ) = > ġȯ

		Stack<String> st = new Stack<String>();
		st.add("�Ѹ�");
		st.addElement("������");
		st.push("������");
		System.out.println(st);

		st.add(0, "��浿");
		st.add(3, "����");
		System.out.println(st);
		System.out.println("=======================================================");
		// ��������ü ���� : pop(����) , peek
		System.out.println(st.peek());
		System.out.println(st);

		System.out.println(st.pop());
		System.out.println(st);
		System.out.println("=======================================================");

		if (st.contains("�Ѹ�")) {
			System.out.println(st.indexOf("�Ѹ�") + "��° ��ġ");
			System.out.println(st.search("�Ѹ�") + "��° ��ġ");
			System.out.println(st.get(3));
			System.out.println(st.elementAt(3));
			System.out.println(st.firstElement());
			System.out.println(st.lastElement());
			System.out.println(st.size() + "��");
		} else {
			System.out.println("�������� ����.");
		}

		// ġȯ
		st.setElementAt("�����", 2);
		System.out.println(st);
		System.out.println("=====================================================");

		// �ߺ� ����
		st.add("�Ѹ�");
		st.add(3, "�Ѹ�");
		System.out.println(st);
		System.out.println("=====================================================");

		// ���
		for (String k : st) {
			System.out.println(k);

		}
		System.out.println("=====================================================");
		Iterator<String> it = st.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k);

		}
		System.out.println("=====================================================");

		// �Ųٷ� �����鼭 �����ϱ�
		while (!st.isEmpty()) {
			// st.peek(); // ���ѷ���
			String k = st.pop();
			System.out.println(k + " ���� " + st.size() + ".");
		}
	}
}
