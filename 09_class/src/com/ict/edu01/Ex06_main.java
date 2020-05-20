package com.ict.edu01;

public class Ex06_main {
	public static void main(String[] args) {

		// 내부클래스 별도로 객체 생성 안됨.
		// In_01 in01 = new In_01();

		Ex06 e6 = new Ex06();
		System.out.println(e6.name);
		e6.sound();
		System.out.println("==============================================");
		// 1. 내부클래스가 존재하는 메소드를 실행
		e6.play();
		System.out.println("외부메소드 끝");
		// 내부클래스가 존재하는 메소드 실행이 끝나면 내부클래스 사용 못함.
		// 그래서 메소드가 끝나기 바로 전에 생성자를 만들어서 호출하고 main에서 실행한다.

		// Member 내부 클래스 만드는 방식
		// Ex06.In_01 in01= e6.new In_01();

	}
}
