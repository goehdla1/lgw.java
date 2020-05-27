package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
		// set 인터페이스를 구현한 클래스 : HashSet , TreeSet;
		// 특징 : 중복 , 정렬 안됨 (TreeSet은 항상 오름차순 상태)

		// 컬렉션 생성 : HashSet<제네딕=객체타입=클래스> 참조변수 = new HashSet<제네닉>();

		HashSet<Integer> h1 = new HashSet<Integer>(); // Integer = > 정수를 받는 클래스.
		HashSet<Double> h2 = new HashSet<Double>();
		HashSet<Boolean> h3 = new HashSet<Boolean>();
		TreeSet<Character> h4 = new TreeSet<Character>();
		TreeSet<String> h5 = new TreeSet<String>();

		// 해당 컬렉션에 객체 넣기 (일반 객체로 만든 후 넣어야 된다.
		// 1. 객체로 만들기
		Integer k1 = new Integer(10); // 박싱
		Integer k2 = new Integer("20"); // 숫자 형태의 스트링 이다.

		// 2. 컬렉션에 넣기 (add)
		h1.add(k1);
		h1.add(k2);
		h1.add(new Integer(30)); // 선언 없이 넣을 수 있다.
		h1.add(new Integer("40"));
		h1.add(10); // 오토박싱 : 자료형 int 10 을 자동으로 객체로 만들어서 넣어준다.
		h1.add(50); // 오토박싱 : 자료형 int 10 을 자동으로 객체로 만들어서 넣어준다.
		h1.add(60); // 오토박싱 : 자료형 int 10 을 자동으로 객체로 만들어서 넣어준다.
		// Double 넣기
		Double k3 = new Double(3.22);
		Double k4 = new Double("7.77");
		h2.add(3.14);
		h2.add(new Double(3.5));
		h2.add(k3);
		h2.add(k4);
		// 자료형이 맞지 않아서 안된다.
		// h2.add(10); (X) , h2.add(10.0); (O) = > h2 가 Double형이다. // 오토박싱은 자료형이 무조건
		// 같아야한다. 크다 작다해서 변형이 되지 않는다.

		h3.add(true);
		h3.add(false);
		h3.add(true); // 오류는 나지 않지만 들어 갈 수가 없다. (중복x)
		System.out.println(h3);

		h4.add('j');
		h4.add('a');
		h4.add('v');
		h4.add('a');// 오류는 나지 않지만 들어 갈 수가 없다. (중복x)

		h5.add("java");
		h5.add("html");
		h5.add("jsp");
		h5.add("css");
		h5.add("db");

		System.out.println("==========================================================");
		System.out.println("전체 내용보기.");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		System.out.println(h5);

		System.out.println("==========================================================");
		System.out.println("하나씩 보기<개선된FOR>");

		for (Integer k : h1) {
			System.out.print(k + " ");

		}
		System.out.println();
		// 언박식: 객체를 일반적으로 사용하는 자료형으로 변환
		for (int k : h1) {
			System.out.print(k + " ");

		}
		System.out.println();

		System.out.println("하나씩 보기<iterator>");
		Iterator<Double> it = h2.iterator();

		while (it.hasNext()) { // it.hasNext에게 접근 할 것이 있니? 라고 묻는다. True.
			double res = (double) it.next(); // 다음객체를 꺼내기 위해서 이동하고 반환한다..
			System.out.println(res + " ");
		}
		System.out.println();

		System.out.println("========================================================================================");
		// h4 ,h5 출력.

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
		System.out.println(
				"==============================================================================================");

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
