package com.ict.edu8;

//	인터페이스 : 서비스를 제공하는 목록을 말한다.
//  상수와 추상메소드로 이루어져 있다.
//  그래서 생성자가 없다. = > 객체생성 (X)
//  유일하게 다중상속이 가능하다\
//  ** 인터페이스가 '같다'라는 말은 대체가 가능하다는 뜻 즉 , 호환이 가능하다.
//


public interface Ex01 {
	// 모두다 static final 이다.
	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;

	// 추상메소드가 아니라서 오류 생김.
	// public void play() {}

	// 일반적인 추상메소드
	public abstract void play();

	// interface 안에서는 abstract 예약어를 사용하지 않아도 오류 X
	public void sound();
}
