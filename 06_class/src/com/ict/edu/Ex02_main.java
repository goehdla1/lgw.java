package com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		// static 멤버필드 호출
		// 객체 생성하기 전에 호출. = static
		System.out.println(Ex02.com);
		System.out.println(Ex02.eng);
		// static이 아니기 때문에 호출 못함.
		// System.out.println(Ex02.kor);
		// System.out.println(Ex02.math);
		
		
		
		// Ex02 클래스 객체 만들기
		// 객체 생성하고 나서 호출 = 인스턴스
		// 클래스이름 참조변수 = new 생성자();
		// Ex02 에 생성자가 없으면 기본생성자로 생성.
		Ex02 test = new Ex02();
		System.out.println(test.kor);
		System.out.println(test.eng);
		System.out.println(test.math);
		System.out.println(test.com);
		
		System.out.println(Ex02.com);
		System.out.println(Ex02.eng);
		
		System.out.println(test);
	}

}
