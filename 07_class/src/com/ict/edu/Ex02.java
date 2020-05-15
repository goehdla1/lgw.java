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
	
	}
}
