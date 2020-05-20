package com.ict.edu;

public class Ex02 {
	// String Ŭ���� �ֿ� �޼ҵ�
	public static void main(String[] args) {
		String str = "ICT���簳�߿� 2������";

		// charAt(int index) : char
		// ��ġ������ ���ڷ� ������ �ش� ��ġ�� ���ڸ� ��ȯ�Ѵ�.
		char c1 = str.charAt(5);
		System.out.println(c1);

		// ��� �빮�ڷ� ������. ( �빮�ڿ� �ҹ����� ���̴� 32�̴�.)
		String str2 = "���ѹα� I Love You 123";
		for (int i = 0; i < str2.length(); i++) {
			char k = str2.charAt(i);
			// �ҹ��� ã��
			if (k >= 'a' && k <= 'z') {
				k = (char) (k - 32);
				System.out.print(k);
			} else {
				System.out.print(k);
			}

		}
		System.out.println();
		// 2.concat(String str) : String
		// ���� ���ڿ��� ���� ���ڿ��� ��ģ��.
		String str3 = "���ѹα�";
		String str4 = "KOREA";

		String result = str3.concat(str4); // = > ��������. = ���ѹα�KOREA
		System.out.println(result);
		System.out.println(str3 + str4); // ���� ����.
		System.out.println("=====================================================================================");
		// 3. equals(Object anObject) : boolean��
		// ���� ���ڿ��� ���� ���ڿ��� ������ true , �ٸ��� false (��ҹ��� ����)
		// 4. equalsIgnoreCase(String anotherString) : boolean��
		// ���� ���ڿ��� ���� ���ڿ��� ������ true , �ٸ��� false (��ҹ��� ���� ����)

		String str5 = "Korea";
		String str6 = "KOREA";

		if (str5.equals(str6)) {
			System.out.println("����.");

		} else {
			System.out.println("�ٸ���.");

		}
		System.out.println("=====================================================================================");

		if (str5.equalsIgnoreCase(str6)) {
			System.out.println("����.");

		} else {
			System.out.println("�ٸ���.");

		}
		System.out.println("=====================================================================================");

		// 5 . format(Locale l, String format, Object... args)
		// ������ �����ϰ� ���Ŀ� ���� ����
		String str7 = "ICT ���� ���߿�";
		String res = String.format("%s", str7);
		System.out.println(res);
		System.out.println("=====================================================================================");
		// ���� �ڸ��� ���д�.
		res = String.format("%25s", str7);
		System.out.println(res);
		System.out.println("=====================================================================================");
		// ���ڶ� �ڸ��� ������� ����.
		res = String.format("%6s", str7);
		System.out.println(res);

		// 6. getBytes() : byte[]
		// �ش� ���ڿ��� byte[]�� ��ȯ ��Ų��.
		// ���� ������Ҷ� ����Ѵ�. (�빮��,���ڸ� ����, ���� �̿��� ���ڴ�
		String str8 = "java";
		byte[] b = str8.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");

		}
		System.out.println();
		System.out.println("==========================================================================");

		// �ݴ�� �ش� byte[]�� ���ڿ��� ������.
		String str9 = new String(b);
		System.out.println(str9);

		// 7. indexOf(int ch) , indexOf(String str) , indexOf(String str, int fromIndex)
		// char �� String �� ������ �ش繮�ڿ��� char�� String�� ��ġ���� �˷��ش�.
		String str10 = "BufferedReader";

		// 'r' �� ��ġ���� ã�ƶ�.
		int k1 = str10.indexOf('r');
		System.out.println(k1);
		System.out.println("==========================================================================");

		k1 = str10.indexOf('K'); // = > -1 �� �ش� ���ڰ� ���ٶ�°� �ǹ��Ѵ�.
		System.out.println(k1);
		System.out.println("==========================================================================");

		k1 = str10.indexOf("er");
		System.out.println(k1);

		// ���⼭ int fromIndex �� ������ġ�� ���Ѵ�.
		// 2��° , 3��° ���ڳ� ���ڸ� ã�� �����̴�.

		// ������ 'r'�� ��ġ���� 5�̴�. 6���� �ٽ� 'r'�� ã���� �ι�° 'r'�� ã�� �� �ִ�.
		k1 = str10.indexOf('r', str10.indexOf('r') + 1);
		System.out.println(k1);

		k1 = str10.indexOf("er", str10.indexOf("er") + 1);
		System.out.println(k1);

		System.out.println("==========================================================================");
		// 8. lastIndexOf(int ch) , lastIndexOf(String str) : int
		// ������ ���ڳ� ���ڿ��� ã�� �� ���.

		k1 = str10.lastIndexOf('d');
		System.out.println(k1);

		k1 = str10.lastIndexOf("er");
		System.out.println(k1);

		// 9. length(): int
		// �ش� ���ڿ��� ���̸� ���� �ش�. ( for���� ���� ���ȴ�.)
		// ���̴� 1������ �����̴�
		String str11 = "abcABC123������";
		k1 = str11.length();
		System.out.println("���� : " + k1);
		System.out.println("==========================================================================");

		// 10 . replace(char oldChar, char newChar), replace ( String oldstr , String
		// newstr) : String
		// ���ο� ���ڳ� ���ڿ��� �޾Ƽ� ġȯ�ϱ�.
		String str12 = "���ѹα�";
		String str13 = str12.replace("���ѹα�", "KOREA");
		System.out.println(str12);
		System.out.println(str13);
		System.out.println("==========================================================================");

		str12 = str12.replace("��", "�� �� ");
		System.out.println(str12);

		// 11. contains(CharSequence s) : boolean , ���� char �� ����.
		// ���ڷ� ���� ���ڿ��� �ش� ���ڿ��� �����ϸ� true , �������������� false
		String str14 = "KOREA @ ���ѹα�";
		boolean b1 = str14.contains("@");
		System.out.println(b1);

		b1 = str14.contains("����");
		System.out.println(b1);

		// ��,�ҹ��� ���� �Ѵ�. ��Ȯ������
		b1 = str14.contains("korea");
		System.out.println(b1);
		System.out.println("==========================================================================");

		// 12. isEmpty() : boolean
		// �ش� ���ڿ��� ��������� true , ������ ������ false
		String str15 = "";
		b1 = str15.isEmpty();
		System.out.println(b1);

		str15 = "���ѹα�";
		b1 = str15.isEmpty();
		System.out.println(b1);
		System.out.println("==========================================================================");

		// 13. split(String regex, int limit ) : String[] => �迭�� ���ͼ� for������ Ȯ���ؾ� �ȴ�.
		// split(String regex) : String[]
		// String regex : ������(��������) , int limit => ���� �迭�� ũ��.
		String str16 = "���,����,���� ������,���ξ���,�θ���";
		String[] arr = str16.split(",");
		for (String k : arr) {
			System.out.println(k);

		}
		System.out.println("==========================================================================");

		String[] arr2 = str16.split(" ");
		for (String k : arr2) {
			System.out.println(k);

		}
		System.out.println("==========================================================================");

		String[] arr3 = str16.split(",", 7);
		for (String k : arr3) {
			System.out.println(k);

		}
		System.out.println("==========================================================================");

		String[] arr4 = str16.split(",", 3);
		for (String k : arr4) {
			System.out.println(k);

		}
		System.out.println("==========================================================================");

		// 14. substring(int beginIndex) : String
		// ���� ��ġ���� ������ ���ڿ� ����
		// substring(int beginIndex, int endIndex)
		// ���� ��ġ���� ����ġ ������ ���ڿ� ����
		String str17 = "010-7777-9999";
		String msg = str17.substring(4);
		System.out.println(msg);

		msg = str17.substring(4, 8);
		System.out.println(msg);
		System.out.println("==========================================================================");

		msg = str17.substring(0, 3);
		System.out.println(msg);
		System.out.println("==========================================================================");

		String str18 = "770707-1";
		msg = str18.substring(7, 8);
		System.out.println(msg);
		System.out.println("==========================================================================");

		msg = str18.substring(str18.indexOf("-") + 1, str18.indexOf("-") + 2);
		System.out.println(msg);

		// ���� : 010-7777-9999 = > 010-7777-XXXX

		// 15. toLowerCase() : String
		// ��� �빮�ڸ� �ҹ��ڷ� ���� ��Ų��.
		// 16. toUpperCase() : String
		// ��� �ҹ��ڸ� �빮�ڷ� ���� ��Ų��.
		String str19 = "kOREa 19";
		msg = str19.toLowerCase();
		System.out.println(msg);

		msg = str19.toUpperCase();
		System.out.println(msg);
		System.out.println("==========================================================================");

		msg = str19.toLowerCase();
		msg = str19.substring(0, 1).toUpperCase() + str19.substring(1).toLowerCase();
		System.out.println(msg);
		System.out.println("==========================================================================");

		// 17. toString() : String
		// Object�� toString() : ��� ��ü�� ��� ���� , ��ü�� ������ �ִ� ������ ������ ���ڿ��� ����� �����ϴ�
		// �޼ҵ�(�������̵��Ҷ� ����.)
		// String�� toString() : ���ڿ� ��ü�� ��ȯ
		String str20 = "java 8 �ڹ� 8";
		msg = str20.toString();
		System.out.println(msg);
		System.out.println(str20);
		System.out.println(str20.toString());
		System.out.println("==========================================================================");

		// 18. trim() : String
		// �ش繮�ڿ��� �� , �� ���� ���� , �߰��� ������ �������� ���Ѵ�.
		String str21 = "    java    �ڹ�    JAVA";
		msg = str21.trim();
		System.out.println(str21);
		System.out.println(msg);

		System.out.println(str21.length());
		System.out.println(msg.length());
		System.out.println("==========================================================================");

		// 19. valueOf(�ڷ���) : static String
		// � �ڷ����̵� String���� ���� ��Ų��.
		boolean bo1 = true;
		char ch1 = 'A';
		int num1 = 34;
		long num2 = 58L;
		float num3 = 3.14f;
		double num4 = 342.12;

		System.out.println(bo1);
		System.out.println(ch1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println("==========================================================================");

		// �ڷ��� + 1
		// System.out.println(bo1+1); => boolean���� +�� �� �� ����.
		System.out.println(ch1 + 1);
		System.out.println(num1 + 1);
		System.out.println(num2 + 1);
		System.out.println(num3 + 1);
		System.out.println(num4 + 1);
		System.out.println("==========================================================================");

		System.out.println(String.valueOf(bo1) + 1);
		System.out.println(String.valueOf(ch1) + 1);
		System.out.println(String.valueOf(num1) + 1);
		System.out.println(String.valueOf(num2) + 1);
		System.out.println(String.valueOf(num3) + 1);
		System.out.println(String.valueOf(num4) + 1);
		System.out.println("==========================================================================");

		System.out.println(bo1 + "");
		System.out.println((ch1) + "");
		System.out.println((num1) + ""); // => �� �ڷ������� String���� ��ȯ ���. �߸Ź��.
		System.out.println((num2) + "");
		System.out.println((num3) + "");
		System.out.println(num4 + "");
		System.out.println("==========================================================================");

		// 20-1. Wrapper class : - �� �ڷ����� ���¸� ���� ���ڿ��� ��¥ �ڷ������� �����Ű�� Ŭ����
		// - ���� �ǹ̴� �⺻ �ڷ����� ��ü�� ���鶧 ����ϴ� Ŭ����(������ �ڵ����� �������)

		// ���ڿ��� boolean������ ���� : Boolean.parseBoolean()
		// "true" , "false" �� ��� ����.
		String message = "false";
		boolean m1 = Boolean.parseBoolean(message);
		if (m1) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
		System.out.println("==========================================================================");

		// 20-2. ���ڿ��� int������ ���� : Integer.parseInt()
		message = "241";
		int m2 = Integer.parseInt(message);
		System.out.println(message + 10);
		System.out.println(m2 + 10);
		System.out.println("==========================================================================");

		// 20-3. ���ڿ��� long������ ���� : Long.parseLong()
		// "����" => O, "����L" => X
		// message = "241L";
		message = "241";
		long m3 = Long.parseLong(message);
		System.out.println(message + 10);
		System.out.println(m3 + 10);
		System.out.println("==========================================================================");

		// 20-4. ���ڿ��� float�� ���� : Float.parseFloat
		message = "3.14f";
		float m4 = Float.parseFloat(message);
		System.out.println(message + 10);
		System.out.println(m4 + 10);
		System.out.println("==========================================================================");

		// 20-5. ���ڿ��� double�� ���� : Double.parseDouble
		message = "3.14";
		double m5 = Double.parseDouble(message);
		System.out.println(message + 10);
		System.out.println(m5 + 10);
		System.out.println("==========================================================================");

		// 20-6. ���ڿ��� char�� ���� : X
		// String.charAt() ���
		message = "A";
		char m6 = message.charAt(0);
		System.out.println(message);
		System.out.println(m6);
		System.out.println("==========================================================================");

		// 21. toCharArray() char[]
		// - �ش繮�ڿ��� char[]�� �������
		// - ��� ���� ��� ���� (getBytes()�� ����� ���ڸ� ����)
		message = "java �ڹ� JAVA �������� 2020"; // ���ڷ� ����(����� ���ڸ� ����)
		byte[] m7 = message.getBytes();
		for (byte k : m7) {
			System.out.println(k);

		}
		System.out.println("==========================================================================");

		char[] m8 = message.toCharArray();
		for (char k : m8) {
			System.out.println(k);

		}
		System.out.println("==========================================================================");
	}
}
