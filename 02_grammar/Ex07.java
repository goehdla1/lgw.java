class Ex07{
	public static void main(String[] args){
	// ���� ���꿡 ���� �ڷ��� ��ȯ.
	// ���� �Ŀ��� ������ ū �ڷ������� ���� �ȴ�.
	// ����) byte,short �� �����ϸ� ������ int �̻��� �ڷ������� ����
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

	// �Ҽ��� ù°�ڸ� ���� ���ϴ� ���.
	double num1 = 83.5555;
	int num2 =(int)(num1 * 10);	// > num1�� double�̱� ������ int num2 �� �ٲٷ��� ���� ��ȯ�� �ؾ���.
	double num3 = num2/10.0;	// > num2/10 = num2(int)/10(int)= int(83)���� double�� �ٲٸ� 83.0 �� ����.
					// > �׷��� num2 / 10.0 (double(�Ǽ�)�� ����) 83.5
					// > �Ҽ��� ��°�ڸ��� *100 , /100.0
	System.out.println(num3);
	
	// ���� �ڸ� �����ϱ�.
	int num4 = 12758;
	int num5 = num4/10;
	System.out.println(num5);

	int num6 = num5*10;
	System.out.println(num6);
	
	}
}