package com.ict.edu;

public class Ex01 {
	// String Ŭ���� �ֿ� �޼ҵ�
	public static void main(String[] args) {
		// String ��ü ����

		String str1 = "abc";

		char data[] = { 'a', 'b', 'c' };

		String str2 = new String(data);

		byte data2[] = { 97, 98, 99 };
		String str3 = new String(data2);

		String data3 = "ABC";
		String str4 = new String(data3);
		
		String str5 = new String("ABC");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println("=============================================");
		
		// ����
		// char , int , double �� ���ڸ� �����ϴ� �ڷ�����
		// '����'��� ǥ���� '==' ����Ѵ�.
		// �׷��� ���ڿ�(String)�� '=='�� ����ϸ� �ȵ�.
		// ������ ���ڴ� ������ ���ٶ�� ���̱�
		//		  ���ڿ��� ������ �ƴ϶� �ּҰ� ���ٶ�� ��.
		// �׷��Ƿ� ���ڿ����� �����Ͱ� ���ٶ�� ����
		// equals() = > �� , �ҹ��ڸ� ������ , equalsIgnoreCase() = > ��,�ҹ��ڸ� ���� ���� �ʴ´�. �޼ҵ带 ����ؾ� �ȴ�.
		
		if (str1 == str2) {
			System.out.println("����.");
		
		}else {
			System.out.println("�ٸ���.");
		}
		
		if (str4 == str5) {
			System.out.println("����.");
			
		}else {
			System.out.println("�ٸ���.");
		}
		System.out.println("========================================");
		if (str1.equals(str2)) { // ������ ������. equals�� ���.
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���.");
		}
		System.out.println("========================================");
		if (str3.equalsIgnoreCase(str4)) { // equalsIgnoreCase�� ��ҹ��ڸ� �������� �ʴ���.
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���.");
		}
	}
}
