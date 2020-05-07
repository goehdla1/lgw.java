class Ex16{
	public static void main(String[] args){
	// 논리연산자 : &&(and , 논리곱) , ||(or , 논리합) , !(not , 논리부정)
	// 논리연산자의 대상(들어오는 정보) : boolean형 , 비교연산 , 논리연산
	// 논리연산자의 결과는 boolnea형 , 즉, 조건식에 사용된다.

	// or ( ||, 논리합) - 합집합
	// - 주어진 조건이 모두 "true"일때 결과는 true
	// - 주어진 조건들 중 "true"를 만나면 결과는 true
	// - true를 만나면 이후 연산을 하지 않음.

	int su1 = 0;
	int su2 = 0;
	su1 = 10;
	su2 = 7;
	boolean result = false;

	result = (su1 >= 7) || (su2 >=5); // true = true || true
	System.out.println(result);

	result = (su1 >= 7) || (su2 <=5); // true = true || false
	System.out.println(result);

	result = (su1 <= 7) || (su2 >=5); // true = false || true
	System.out.println(result);

	result = (su1 <= 7) || (su2 >=5); // false = false || false
	System.out.println(result);
	System.out.println("======================");

	// or은 조건이 true이면 뒤 조건을 연산하지 않는다.
	result = ((su1 = su1+2) > su2) || (su1 == (su2 = su2 +5));
	System.out.println("결과 :" + result); // true
	System.out.println("결과 :" + su1); // 12
	System.out.println("결과 :" + su2); // 7 => (su1 = su1+2) > su2)가 true이기 때문에 뒤에 조건은 연산 안함.
	System.out.println("======================");

	// NOT ( ! , 논리부정)
	// - 주어진 논리값을 반대로 출력함
	// - true => false , false => true
	result = true;
	System.out.println(result);	// 값 = ture
	System.out.println(! result);	// 값 = false
	System.out.println(!! result);  // 값 = true
	System.out.println(!!! result); // 값 = false
}
	}