package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
		// set �������̽��� ������ Ŭ���� : HashSet , TreeSet;
		// Ư¡ : �ߺ� , ���� �ȵ� (TreeSet�� �׻� �������� ����)

		// �÷��� ���� : HashSet<���׵�=��üŸ��=Ŭ����> �������� = new HashSet<���״�>();

		HashSet<Integer> h1 = new HashSet<Integer>(); // Integer = > ������ �޴� Ŭ����.
		HashSet<Double> h2 = new HashSet<Double>();
		HashSet<Boolean> h3 = new HashSet<Boolean>();
		TreeSet<Character> h4 = new TreeSet<Character>();
		TreeSet<String> h5 = new TreeSet<String>();

		// �ش� �÷��ǿ� ��ü �ֱ� (�Ϲ� ��ü�� ���� �� �־�� �ȴ�.
		// 1. ��ü�� �����
		Integer k1 = new Integer(10); // �ڽ�
		Integer k2 = new Integer("20"); // ���� ������ ��Ʈ�� �̴�.

		// 2. �÷��ǿ� �ֱ� (add)
		h1.add(k1);
		h1.add(k2);
		h1.add(new Integer(30)); // ���� ���� ���� �� �ִ�.
		h1.add(new Integer("40"));
		h1.add(10); // ����ڽ� : �ڷ��� int 10 �� �ڵ����� ��ü�� ���� �־��ش�.
		h1.add(50); // ����ڽ� : �ڷ��� int 10 �� �ڵ����� ��ü�� ���� �־��ش�.
		h1.add(60); // ����ڽ� : �ڷ��� int 10 �� �ڵ����� ��ü�� ���� �־��ش�.
		// Double �ֱ�
		Double k3 = new Double(3.22);
		Double k4 = new Double("7.77");
		h2.add(3.14);
		h2.add(new Double(3.5));
		h2.add(k3);
		h2.add(k4);
		// �ڷ����� ���� �ʾƼ� �ȵȴ�.
		// h2.add(10); (X) , h2.add(10.0); (O) = > h2 �� Double���̴�. // ����ڽ��� �ڷ����� ������
		// ���ƾ��Ѵ�. ũ�� �۴��ؼ� ������ ���� �ʴ´�.

		h3.add(true);
		h3.add(false);
		h3.add(true); // ������ ���� ������ ��� �� ���� ����. (�ߺ�x)
		System.out.println(h3);

		h4.add('j');
		h4.add('a');
		h4.add('v');
		h4.add('a');// ������ ���� ������ ��� �� ���� ����. (�ߺ�x)

		h5.add("java");
		h5.add("html");
		h5.add("jsp");
		h5.add("css");
		h5.add("db");

		System.out.println("==========================================================");
		System.out.println("��ü ���뺸��.");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		System.out.println(h5);

		System.out.println("==========================================================");
		System.out.println("�ϳ��� ����<������FOR>");

		for (Integer k : h1) {
			System.out.print(k + " ");

		}
		System.out.println();
		// ��ڽ�: ��ü�� �Ϲ������� ����ϴ� �ڷ������� ��ȯ
		for (int k : h1) {
			System.out.print(k + " ");

		}
		System.out.println();

		System.out.println("�ϳ��� ����<iterator>");
		Iterator<Double> it = h2.iterator();

		while (it.hasNext()) { // it.hasNext���� ���� �� ���� �ִ�? ��� ���´�. True.
			double res = (double) it.next(); // ������ü�� ������ ���ؼ� �̵��ϰ� ��ȯ�Ѵ�..
			System.out.println(res + " ");
		}
		System.out.println();

		System.out.println("========================================================================================");
		// h4 ,h5 ���.

		for (Character c1 : h4) {
			System.out.print(c1 + " ");

		}
		System.out.println();
		Iterator<Character> it2 = h4.iterator();
		while (it2.hasNext()) {
			char cr = (char) it2.next();
			System.out.print(cr + " ");
	
		}
		System.out.println();
		System.out.println("==============================================================================================");
		
		for (String str : h5) {
			System.out.print(str + " ");
			
		}
		System.out.println();
		
		Iterator<String> it3 = h5.iterator();
		while (it3.hasNext()) {
			String str = (String) it3.next();
			System.out.print(str + " ");
			
		}
	}
	
}
