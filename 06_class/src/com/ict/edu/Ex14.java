package com.ict.edu;

public class Ex14 {
	// static : 객체 생성과 상관없이 미리 만들어지는 필드와 메소드
	// 클래스와 지역변수에는 사용할 수 없다.
	// : 공유 개념 ( 모든객체가 사용할 수 있다.)

	int su = 10; // 인스턴스 변수
	static int num = 10; // static 변수 , 클래스 변수 = > 한개를 가지고 쓴다.

	public Ex14() {
		su++;
		num++;
	}

	public void sum(int k1, int k2) {
		// static은 지역변수로 사용할 수 없다.
		// static double p1 = 3.14;
		su = k1 + k2;
	}

	// static 메소드 : static 변수나 지역변수 사용.
	public static void add(int k1, int k2) {
		// 전역변수 사용 불가.
		// su = k1 + k2;
		
		num = k1 + k2; // static 변수.

		double p1 = 3.14; // 일반 지역 변수.
		
		// static은 지역변수로 사용할 수 없다.
		// static double p1 = 3.14;
	}

}
