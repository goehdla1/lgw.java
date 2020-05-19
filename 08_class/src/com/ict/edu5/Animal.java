package com.ict.edu5;

public abstract class Animal {
	// 추상 클래스 : 추상메소드를 가지고 있는 클래스를 추상 클래스라고 한다.
	// 일반적인 멤버필드와 멤버메소드도 가지고 있을 수 있다.

	// 추상 메소드 : body가 없는 메소드({실행내용})를 추상 메소드라고 한다.
	// 반드시 abstract 예약어를 사용한다.
	// 반드시 클래스에도 abstract를 붙어야 한다.

	int su1 = 10;
	static int su2 = 20;
	final int su3 = 30;
	static final int su4 = 40;

	public void play() {
		su1++;
		su2++;
		// su3++;
		// su4++;

	}

	// static 메소드
	public static void prn() {
		int k1 = 100;
		// 지역변수에는 static을 사용할 수 없다.
		// static int k2 = 200;

		// 전역 변수의 인스턴스 변수는 올 수 없다.
		// System.out.println(su1);
		System.out.println(su2);
		// 전역 변수의 인스턴스 상수도 올 수 없다.
		// System.out.println(su3);
		System.out.println(su4);
	}

	// 추상메소드 , 추상메소드는 반드시 abstract를 붙어야 한다.
	// 반드시 클래스에도 abstract를 붙어야 한다.
	public abstract void like();

	// static은 만들수가 없다잉
	// public static abstract void like();
}
