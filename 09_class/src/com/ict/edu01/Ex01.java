package com.ict.edu01;

// ������ (enum) : ����� �ϳ��� ��ü�� �ν��ϰ�, �������� ��� ��ü���� �� ���� ��� �� �ϳ��� ����(��ü)
public class Ex01 {

	static final int JAVA = 200; // ���
	static final int HTML = 1000;

	public enum Lesson {
		// static final ����
		JAVA, JSP, SPRING, ANDROID, HTML // 1000
	}

	public static void main(String[] args) {
		// enum���� �ϳ� ����
		// ������ ������ ����� �Ѵ�.
		Lesson s1 = Lesson.JAVA;
		System.out.println("s1 :" + s1); // ��ü
		System.out.println("JAVA : " + Ex01.JAVA); // ������
		System.out.println("========================================================================================");
		System.out.println("HTML : " + Ex01.HTML);
		System.out.println("HTML : " + Lesson.HTML);
		System.out.println("========================================================================================");

		Lesson[] item = Lesson.values();
		
		// ordinal : index()
		for (Lesson k : item) {
			System.out.println(k + ":" + k.ordinal());

		}
	}
}
