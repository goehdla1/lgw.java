package com.ict.edu01;

import com.ict.edu01.Ex05.Inner02;

public class Main {
	public static void main(String[] args) {
		// 내부클래스가 별도로 객체 생성을 할 수 없다.
		// Inner01 Inner01 = new Inner01();
		// 외부 클래스를 통해서 객체를 생성한다.

		Ex05 e5 = new Ex05();
		System.out.println(e5.name);
		// private age 여서 오류
		// System.out.println(e5.age);

		e5.play();

		System.out.println("===========================================================");

		// Member 내부클래스
		// 주소 값이 다르다.
		Ex05.Inner01 inner01 = new Ex05().new Inner01();

		Ex05.Inner01 inner02 = e5.new Inner01();
		inner02.prn();

		System.out.println("============================================================");

		System.out.println(Inner02.a3);
		System.out.println(Inner02.a4);
		Inner02.go2();
		System.out.println("============================================================");
		
		// static 내부클래스는 바로 만들 수 있다.
		Inner02 test = new Inner02();
		System.out.println(test.a1);
		System.out.println(test.a2);
		test.go();
		
	}
}
