package com.ict.edu;

import java.util.Random;

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
		System.out.println("==================================================================");
		
		// API를 이용해서 static 메소드와 인스턴스를 호출해 보자.
		// API에서 제공하는 Random 클래스의 nextInt() , nextInt(int bound) , nextDouble()를 사용하는 예이다.
		
		// nextInt() , nextInt(int bound) , nextDouble()은 static이 아니므로
		// 클래스를 객체로 만들어서 사용해야 된다.
	
		// 1. 클래스를 객체로 만드는 방법
		//  클래스 참조변수 = new 생성자
		Random ran = new Random();
		// nextInt() : int 범위 안에서 무작위로 정수 추출한다.
		int res = ran.nextInt(); // = > ran.nextInt() 결과를 받아서 반환하기 때문에 결과를 받아줘야해서 int res 를 쓴다. 
		System.out.println(res);
		System.out.println("---------------------------------");
		
		// nextInt(숫자) : 반환값 ( 0 - 숫자 전까지)
		res = ran.nextInt(6); // 0-5 까지
		System.out.println(res);
		System.out.println("---------------------------------");
		
		
		// 정해지지 않은 0.0 - 1.0 미만의 실수
		double res2 = ran.nextDouble();
		System.out.println(res2);
		System.out.println("---------------------------------");
		
		// res2를 0 - 5까지의 정수로 표현하자.
		System.out.println((int)(res2*6));
		
		// API에서 제공하는 static 메소드 사용하기
		// Math 클래스의 메소드들은 static이므로 객체 생성없이 사용가능
		// 클래스이름.멤버필드 , 클래스이름.멤버메소드로 사용
		System.out.println(Math.random());
		
		// 원하는 정수까지으로 정해지지않은 수 지정
		System.out.println((int)(Math.random()*6)); // 0 - 5 까지
	}

}
