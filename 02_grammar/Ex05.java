class Ex05{
	public static void main(String[] args){
	//실수 : 소수점이 있음
	// float < double
	// 실수의 기본 double

	// float는 숫자 뒤어 반드시 F,f를 붙여야 한다.(생략시 오류.)
		// ex) float num1 = 24(o) , float num2 = 24.0(x) = 24.0은 double이라 float보다 값이 크기때문	
	
	// 24가 정수이므로 float는 실수 그러므로 저장이 가능
	float su1 = 24;
	System.out.println(su1);	
	
	float su2 = 31.4f;
	System.out.println(su2);

	// char c1은 float에 저장할 수 있다.
	
	char c1 = 97;
	System.out.println(c1);

	float su3 = c1;
	System.out.println(su3);
	
	// double 은 byte < short < int < long < float < double 이기때문에 모두 받아서 저장할 수 있다.
	double su4 = 3.14;
	System.out.println(su4);

	double su5 = su3;
	System.out.println(su5);

	double su6 = c1;
	System.out.println(su6);
	}
}