class Ex15{
	public static void main(String[] args){
	// �������� : &&(and , ����) , ||(or , ����) , !(not , ������)
	// ���������� ���(������ ����) : boolean�� , �񱳿��� , ������
	// ���������� ����� boolnea�� , ��, ���ǽĿ� ���ȴ�.

	// AND ( &&, ����) - ������
	// - �־��� ������ ��� "true"�϶� ����� true
	// - �� �־��� ���ǵ� �� "false"�� ������ ����� false
	// - false�� ������ ���� ������ ���� ����.
	// - ' a >= 10 && a<= 20 ' �� �ǹ̴� a�� 10���� 20������ ������ �ǹ��Ѵ�.
	
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
	System.out.println("��� :" + result); // true
	System.out.println("��� :" + su1); // 12
	System.out.println("��� :" + su2); // 12

 	System.out.println("======================");

	// AND�� false�� ������ ����� false�̰� , �� ������ �������� �ʴ´�.
	result = ((su1 = su1+2) < su2) && (su1 == (su2 = su2 +5)); // �տ��� ������ ������ �ڿ��� ��� ��ü�� ����
	System.out.println("��� :" + result);  // false
	System.out.println("��� :" + su1);	// 14
	System.out.println("��� :" + su2);	// 12

	su1 = 34;
	// su1 �� ���� 20 ~ 30 ������ ���̳�?!
	result = (su1 >= 20) && (su1 <= 30);
	System.out.println ("��� :" + result);

	// char c1�� �������̳� ? 
	char c1 ='g';
	result = (c1 >= 97) && (c1 <= 122); // => �̽�Ű�ڵ� Ȱ�� / ����?
	System.out.println("��� :" + result);

	result = (c1 >= 'a') && (c1 <= 'z'); // => char �� ���� ���� ���� �ֱ� ������.
	System.out.println("��� :" + result);
	}
}