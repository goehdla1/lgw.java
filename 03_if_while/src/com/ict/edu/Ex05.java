package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라 실행문을 반복 처리하는 문
		// for문 형식 : (초기식; 조건식; 증감식){
		// 조건식이 참일때 실행할 문장 ;
		// }
		// for문은 무조건 초기식부터 시작한다. => 조건식으로 이동
		// 조건식은 boolean형 (boolean,비교연산,논리연산)
		// 조건식이 참이면 for문 안쪽 블록을 실행한다.
		// 조건식이 거짓이면 for문 실행하지 않는다.
		// for문의 끝을 만나면 무조건 증감식으로 간다.
		// 증감식은 초기식을 증가하거나 감소시키는 역할을 하고
		// 다시 조건식으로 간다.
		// 원하는 것을 반복적으로 쓸때 사용한다.

		// 자바에서는 if문 , switch문 , for문 안에서 만든 변수는
		// 밖에서 사용할 수 없다.

		// 안녕하세요 10번 출력하시오.
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("=========================================");

		for (int i = 1; i < 11; i++) { // ==> i = 1(시작) , i < 11 (11번째에 끝난다 는 뜻.)
			System.out.println(i + "Hello");
		}

		System.out.println("=========================================");

		// 0 ~ 10 까지 출력하기.

		for (int i = 0; i < 11; i++) {
			System.out.println(i); // = > 여기서 i 는 계속 변한다. (i++때문에)
		}

		System.out.println("=========================================");

		// 0 ~ 10까지 짝수만 출력하기.

		for (int i = 0; i < 11; i = i + 2) {

			System.out.println(i);
		}
		System.out.println("=========================================");

		// 0 ~ 10까지 짝수만 출력하기.
		
		for (int i = 0; i < 11; i++) {	 
			if (i % 2 == 0) {  				// = if는 참만!
				System.out.println(i);
			}
		}
		System.out.println("=========================================");

		// 0 ~ 10까지 홀수만 출력하기.
		
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}