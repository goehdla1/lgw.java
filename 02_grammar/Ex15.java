class Ex15{
	public static void main(String[] args){
	// 논리연산자 : &&(and , 논리곱) , ||(or , 논리합) , !(not , 논리부정)
	// 논리연산자의 대상(들어오는 정보) : boolean형 , 비교연산 , 논리연산
	// 논리연산자의 결과는 boolnea형 , 즉, 조건식에 사용된다.

	// AND ( &&, 논리곱) - 교집합
	// - 주어진 조건이 모두 "true"일때 결과는 true
	// - 즉 주어진 조건들 중 "false"를 만나면 결과는 false
	// - false를 만나면 이후 연산을 하지 않음.
	// - ' a >= 10 && a<= 20 ' 의 의미는 a는 10부터 20까지의 범위를 의미한다.
	
	int su1 = 0;
	int su2 = 0;
	su1 = 10;
	su2 = 7;
	boolean result = false;

	result = (su1 >= 7) && (su2 >=5); // true = true && true
	System.out.println(result);

	result = (su1 >= 7) && (su2 <=5); // false = true && false
	System.out.println(result);

	result = (su1 <= 7) && (su2 >=5); // false = false && true
	System.out.println(result);

	result = (su1 <= 7) && (su2 >=5); // false = false && false
	System.out.println(result);
	System.out.println("======================");

	result = ((su1 = su1+2) > su2) && (su1 == (su2 = su2 +5));
	System.out.println("결과 :" + result); // true
	System.out.println("결과 :" + su1); // 12
	System.out.println("결과 :" + su2); // 12

 	System.out.println("======================");

	// AND는 false를 만나면 결과는 false이고 , 뒤 조건은 연산하지 않는다.
	result = ((su1 = su1+2) < su2) && (su1 == (su2 = su2 +5)); // 앞에서 거짓이 나오면 뒤에는 계산 자체를 안함
	System.out.println("결과 :" + result);  // false
	System.out.println("결과 :" + su1);	// 14
	System.out.println("결과 :" + su2);	// 12

	su1 = 34;
	// su1 의 값이 20 ~ 30 사이의 값이냐?!
	result = (su1 >= 20) && (su1 <= 30);
	System.out.println ("결과 :" + result);

	// char c1이 수문자이냐 ? 
	char c1 ='g';
	result = (c1 >= 97) && (c1 <= 122); // => 이스키코드 활용 / 굳이?
	System.out.println("결과 :" + result);

	result = (c1 >= 'a') && (c1 <= 'z'); // => char 는 숫자 값을 갖고 있기 때문에.
	System.out.println("결과 :" + result);
	}
}