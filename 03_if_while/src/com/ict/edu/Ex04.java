package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		// switch ~ case : if문과 같이 조건문
		// if문은 조건식이 boolean 형이다. 즉 비교연산 , 논리연산 , boolean형 사용.
		// switch문은 인자값이 byte , short int char String 일 때 사용.
		// 형식: switch(인자값){
		// case 조건값 1 : 인자값과 조건값 1 과 같을때 수행할 문장 ; break ;
		// case 조건값 2 : 인자값과 조건값 2 과 같을때 수행할 문장 ; break ;
		// case 조건값 3 : 인자값과 조건값 3 과 같을때 수행할 문장 ; break ;
		// default : 조건값 1,2,3 모두 같지 않을 때 수행할 문장 ;
		// }
		// break 가 없으면 break를 만날때 까지 모든 실행문을 실행
		// break 역할은 현재 실행하고 있는 범위를 벗어나는 역할

		// char k1이 A이면 아프리카 B이면 브라질 C이면 캐나다 나머지는 한국

		char k1 = 'B';
		String res = "";
		switch (k1) {
		case 'A':
			System.out.println("아프리카");
			break;
		case 'B':
			System.out.println("브라질");
			break;
		case 'C':
			System.out.println("캐나다");
			break;
		default:
			System.out.println("한국");
			break;
		}
		char k2 = 'B';
		switch (k2) {
		case 'A':
			res = "아프리카";
			break;
		case 'B':
			res = "브라질";
			break;
		case 'C':
			res = "캐나다";
			break;
		default:
			res = "한국";
			break;
		}
		System.out.println("결과 :" + res);
		// char k3이 A,a이면 아프리카 B,b이면 브라질 C,c이면 캐나다 나머지는 한국

		char k3 = 'B';
		String str = "";
		switch (k3) {
		case 'a':
			str = "아프리카";
			break;
		case 'A':
			str = "아프리카";
			break;
		case 'b':
			str = "브라질";
			break;
		case 'B':
			str = "브라질";
			break;
		case 'c':
			str = "캐나다";
			break;
		case 'C':
			str = "캐나다";
			break;

		default:
			str = "한국";
			break;
		}
		System.out.println("결과 : " + str);

		switch (k3) {
		case 'a':
		case 'A':
			str = "아프리카"; // => or 관계. (a,A가 or 관계이다.)
			break;
		case 'b':
		case 'B':
			str = "브라질"; // = > or 관계.(b,B가 or 관계이다.)
			break;
		case 'c':
		case 'C':
			str = "캐나다"; // = > or 관계.(c,C가 or 관계이다.)
			break;
		default:
			str = "한국";
			break;
		}
		System.out.println("결과 : " + str);

		// int k4가 1 또는 3이면 남자 , 2 또는 4이면 여자
		int k4 = 1;
		switch (k4) {
		case 1:
		case 3:
			str = "남자";
			break;
		case 2:
		case 4:
			str = "여자";
			break;
		}
		System.out.println("결과: " + str);

		// String k5 이 한국이면 서울, 중국이면 북경 , 일본이면 동경 , 미국이면 워싱턴

		String k5 = "한국";
		switch (k5) {
		case "한국":
			str = "서울";
			break;
		case "중국":
			str = "북경";
			break;
		case "일본":
			str = "동경";
			break;
		case "미국":
			str = "워싱턴";
			break;
		}
		System.out.println("결과 : " + str);

		// switch문은 범위가 넓어지면 사용하지말자. (차라리 if문 사용하자.)
		// int k6의 정수가 90점 이상이면 A학점 , 80점이상이면 B학점 , 70이상이면 C학점 , 나머지 F

		int k6 = 97;
		switch ((int) (k6 / 10)) { // => 강제 형변환을 한다. 9.1,9.2,9.3,9.x ... 를 int로바꾸면 모두 9이니까 강제 형 변환으로 범위값을 구한다. 
		case 10:
			str = "A";
		case 9:
			str = "A";
			break;
		case 8:
			str = "B";
			break;
		case 7:
			str = "C";
			break;

		default:
			str = "F";
			break;
		}
		System.out.println("결과: " + str);

	}
}
