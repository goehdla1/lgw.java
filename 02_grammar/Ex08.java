class Ex08{
	public static void main(String[] args){
	// 참조 자료형 : 클래스를 자료형으로 사용한다.
	// String 클래스 : 문자열 처리하는 기능을 가지고 있는 클래스
	// String 클래스는 기본자료형은 아니다.
	// String 클래스를 자료형처럼 사용하기 위해서는 반드시 "" 사용해야 된다.

	String str = "hello";
	System.out.println(str);
	
	// String + 연산 - String에서 + 는 덧셈이 아니다. 문자연결자 이다.
	//		 - + 연산을 하면 결과는 무조건 String 이다.
	
	str = "10000";
	int su = 10000;
	
	System.out.println(str + 10);	// 결과: 1000010 문자 + 숫자 는 문자연결
	System.out.println(su + 10);	// 결과: 10010 숫자 + 숫자 는 숫자.

	int su1 = 20;
	int su2 = 4;
	System.out.println(su1 + su2);		        // 답: 24
	System.out.println("결과:" + su1 + su2);	// 답:(결과: 204) 여기서 결과(문자)와 su1(숫자) 먼저 계산 된다. 
	System.out.println("결과:" + (su1 + su2));      // 답:(결과:24)
	int su3 =su1 + su2;
	System.out.println("결과:" + su3); // - 저장하고 값을 넣는게 좋다. (결과:24)
	}
}