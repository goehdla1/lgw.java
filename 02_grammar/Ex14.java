class Ex14{
	public static void main(String[] args){
	// 비교 연산자 : > , < , >= , <= , ==(같다) , !=(같지않다=다르다)
	// 비교연산자를 사용할 수 있는 자료형 : char , 정수 , 실수 / String(x)
	// 연산 결과는 무조건 boolean형 (true,false) => 조건식에 사용된다.
	
	int su1 = 90;
	int su2 = 80;
	char su3 = 'a';
	char su4 = 'A';
	double su5 = 97.0;
	double su6 = 78.0;

	boolean result = su1 > su2 ;
	System.out.println("결과 : " + result);

	//boolean result = su3 > su4 ; => 안된다 boolean result 선언은 한번.
	result = su3 > su4;
	System.out.println("결과 ; " + result);

	result = su5 > su6;
	System.out.println("결과 : " + result);
	
	//문자와 정수 비교 연산 된다.
	result = su1 > su3;
	System.out.println("결과 : " + result);

	//정수와 실수 비교 연산 된다.
	result = su1 > su5;
	System.out.println("결과 : " + result);
	
	result = su3 >= su5;
	System.out.println("결과 : " + result);
	
	}
}