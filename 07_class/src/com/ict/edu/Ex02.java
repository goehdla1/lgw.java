package com.ict.edu;

public class Ex02 {
	// String 클래스 주요 메소드
	public static void main(String[] args) {
		String str = "ICT인재개발원 2강의장";

		// charAt(int index) : char
		// 위치정보가 숫자로 들어오면 해당 위치의 글자를 반환한다.
		char c1 = str.charAt(5);
		System.out.println(c1);

		// 모두 대문자로 만들자. ( 대문자와 소문자의 차이는 32이다.)
		String str2 = "대한민국 I Love You 123";
		for (int i = 0; i < str2.length(); i++) {
			char k = str2.charAt(i);
			// 소문자 찾기
			if (k >= 'a' && k <= 'z') {
				k = (char) (k - 32);
				System.out.print(k);
			} else {
				System.out.print(k);
			}

		}
		System.out.println();
		// 2.concat(String str) : String
		// 들어온 문자열을 현재 문자열과 합친다.
		String str3 = "대한민국";
		String str4 = "KOREA";

		String result = str3.concat(str4); // = > 합쳐진다. = 대한민국KOREA
		System.out.println(result);
		System.out.println(str3 + str4); // 위랑 같다.
		System.out.println("=====================================================================================");
		// 3. equals(Object anObject) : boolean형
		// 들어온 문자열과 현재 문자열이 같으면 true , 다르면 false (대소문자 구별)
		// 4. equalsIgnoreCase(String anotherString) : boolean형
		// 들어온 문자열과 현재 문자열이 같으면 true , 다르면 false (대소문자 구별 없음)

		String str5 = "Korea";
		String str6 = "KOREA";

		if (str5.equals(str6)) {
			System.out.println("같다.");

		} else {
			System.out.println("다르다.");

		}
		System.out.println("=====================================================================================");

		if (str5.equalsIgnoreCase(str6)) {
			System.out.println("같다.");

		} else {
			System.out.println("다르다.");

		}
		System.out.println("=====================================================================================");

		// 5 . format(Locale l, String format, Object... args)
		// 형식을 지정하고 형식에 맞춰 생성
		String str7 = "ICT 인재 개발원";
		String res = String.format("%s", str7);
		System.out.println(res);
		System.out.println("=====================================================================================");
		// 남은 자리는 비어둔다.
		res = String.format("%25s", str7);
		System.out.println(res);
		System.out.println("=====================================================================================");
		// 모자란 자리는 상관하지 않음.
		res = String.format("%6s", str7);
		System.out.println(res);

		// 6. getBytes() : byte[]
		// 해당 문자열을 byte[]로 변환 시킨다.
		// 보통 입출력할때 사용한다. (대문자,숫자만 가능, 영어 이외의 글자는
		String str8 = "java";
		byte[] b = str8.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");

		}
		System.out.println();
		System.out.println("==========================================================================");

		// 반대로 해당 byte[]를 문자열로 만들자.
		String str9 = new String(b);
		System.out.println(str9);

		// 7. indexOf(int ch) , indexOf(String str) , indexOf(String str, int fromIndex)
		// char 나 String 이 들어오면 해당문자열에 char나 String의 위치값을 알려준다.
		String str10 = "BufferedReader";

		// 'r' 의 위치값을 찾아라.
		int k1 = str10.indexOf('r');
		System.out.println(k1);
		System.out.println("==========================================================================");

		k1 = str10.indexOf('K'); // = > -1 은 해당 문자가 없다라는걸 의미한다.
		System.out.println(k1);
		System.out.println("==========================================================================");

		k1 = str10.indexOf("er");
		System.out.println(k1);

		// 여기서 int fromIndex 란 시작위치를 말한다.
		// 2번째 , 3번째 문자나 글자를 찾기 위함이다.

		// 위에서 'r'의 위치값은 5이다. 6부터 다시 'r'을 찾으면 두번째 'r'을 찾을 수 있다.
		k1 = str10.indexOf('r', str10.indexOf('r') + 1);
		System.out.println(k1);

		k1 = str10.indexOf("er", str10.indexOf("er") + 1);
		System.out.println(k1);

		System.out.println("==========================================================================");
		// 8. lastIndexOf(int ch) , lastIndexOf(String str) : int
		// 마지막 문자나 문자열을 찾을 때 사용.

		k1 = str10.lastIndexOf('d');
		System.out.println(k1);

		k1 = str10.lastIndexOf("er");
		System.out.println(k1);

		// 9. length(): int
		// 해당 문자열의 길이를 구해 준다. ( for문에 많이 사용된다.)
		// 길이는 1번부터 시작이닷
		String str11 = "abcABC123가나다";
		k1 = str11.length();
		System.out.println("길이 : " + k1);
		System.out.println("==========================================================================");

		// 10 . replace(char oldChar, char newChar), replace ( String oldstr , String
		// newstr) : String
		// 새로운 문자나 문자열을 받아서 치환하기.
		String str12 = "대한민국";
		String str13 = str12.replace("대한민국", "KOREA");
		System.out.println(str12);
		System.out.println(str13);
		System.out.println("==========================================================================");
		
		str12 = str12.replace("한", "한 ♥ ");
		System.out.println(str12);
	
	}
}
