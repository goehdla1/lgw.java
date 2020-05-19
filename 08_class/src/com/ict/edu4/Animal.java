package com.ict.edu4;

// final : 종단 , 끝의 의미가 있다.
// final class = > 상속이 안된다.
// final method = > 오버라이딩이 안된다.
// final 변수  = > 상수

public abstract class Animal {
	int eyes = 2;
	int legs = 4;

	public void like() {
		System.out.println("잠자기");
	}

	public abstract void sound();

	public final void sleep() {
		System.out.println("6시간 잠을 잔다.");
	}

}