class Ex03{
	public static void main(String[] args){
	// 문자를 변수에 저장하기
	// char의 데이터 값은 0~65535의 숫자 값이다.
	// 문자를 사용하기 위해서는 반드시 ''(홑따옴표)를 사용한다.
	// 1.선언과 데이터를 한다.
	char k1 = 'a';
	System.out.println(k1);

	char k2 = 65;
	System.out.println(k2);
	
	char k3 = '가';
	System.out.println(k3);

	char k4 = '1';
	System.out.println(k4);

	char k5 = '\u0042';
	System.out.println(k5);

	char k6 = '\uAC00';
	System.out.println(k6);
	}
}