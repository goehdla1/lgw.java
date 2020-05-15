package com.ict.edu;

public class Ex15 {
	// static 초기화
	// static {
	// 내용 ;
	// }

	int s1 = 100;
	static int s2 = 200;
	static int k2 = 2;
	// k3 = 5000;
	// static 초기화
	static {
		s2 = 10000;
		s3 = 20000;
		s4 = 30000;
	}

	// int k3;
	static int s3 = 10;
	static int s4; // 선언을 나중에 해도 오류가 나지 않는다.

	public static void main(String[] args) {
		// System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("===========================");
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
