class Ex10{
	public static void main(String[] args){
	// 증감 연산자 : 1 증가 또는 1 감소 하는 연산자
	// char형 , 정수형 , 실수형에 사용 가능.
	// ++변수 : 현재값을 먼저 1증가 하고 나머지 실행
	// 변수++ : 현재값 가지고 연산 후  나중에 1증가

	int su1 = 10;
	int su2 = 10;

	System.out.println(++ su1); // 1증가 후 값이 나옴
	System.out.println(su2 ++); // 값이나온 후 1증가

	System.out.println(su1); // - 결과: 11
	System.out.println(su2); // - 결과: 11
	}
}