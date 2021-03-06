class Ex07{
	public static void main(String[] args){
	// 수의 연산에 따른 자료형 변환.
	// 연산 후에는 무조건 큰 자료형으로 변경 된다.
	// 예외) byte,short 는 연산하면 무조건 int 이상의 자료형으로 변경
	byte su1 = 20;
	short su2 = 25;
	// int su3 = 30;
	// long su4 = 35;

	// float su5 = 34.1f;
	// double su6 = 247.12;

	// byte(short) + byte = int
	int res1 =su1 + su1;		//byte res1 = su1 + su1 (x)
	System.out.println(res1);
	// byte(short) + short = int
	int res2 = su1 + su2;		//short res2 = su1 + su2 (x)
	System.out.println(res2);	
	// byte(short) + int = int
	// byte(short) + long = long
	// byte(short) + float = float
	// byte(short) + double = double

	// int + int = int
	// int + long = long
	// int + float = float
	// int + double = double

	// long + long = long
	// long + float = float
	// long + double = double

	// float + float = float
	// float + double = double

	// 소수점 첫째자리 까지 구하는 방법.
	double num1 = 83.5555;
	int num2 =(int)(num1 * 10);	// > num1은 double이기 때문에 int num2 로 바꾸려면 강제 변환을 해야함.
	double num3 = num2/10.0;	// > num2/10 = num2(int)/10(int)= int(83)에서 double로 바꾸면 83.0 이 나옴.
					// > 그래서 num2 / 10.0 (double(실수)로 변경) 83.5
					// > 소수점 두째자리는 *100 , /100.0
	System.out.println(num3);
	
	// 일의 자리 절삭하기.
	int num4 = 12758;
	int num5 = num4/10;
	System.out.println(num5);

	int num6 = num5*10;
	System.out.println(num6);
	
	}
}