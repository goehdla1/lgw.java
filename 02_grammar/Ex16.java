class Ex16{
	public static void main(String[] args){
	// �������� : &&(and , ����) , ||(or , ����) , !(not , ������)
	// ���������� ���(������ ����) : boolean�� , �񱳿��� , ������
	// ���������� ����� boolnea�� , ��, ���ǽĿ� ���ȴ�.

	// or ( ||, ����) - ������
	// - �־��� ������ ��� "true"�϶� ����� true
	// - �־��� ���ǵ� �� "true"�� ������ ����� true
	// - true�� ������ ���� ������ ���� ����.

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

	// or�� ������ true�̸� �� ������ �������� �ʴ´�.
	result = ((su1 = su1+2) > su2) || (su1 == (su2 = su2 +5));
	System.out.println("��� :" + result); // true
	System.out.println("��� :" + su1); // 12
	System.out.println("��� :" + su2); // 7 => (su1 = su1+2) > su2)�� true�̱� ������ �ڿ� ������ ���� ����.
	System.out.println("======================");

	// NOT ( ! , ������)
	// - �־��� ������ �ݴ�� �����
	// - true => false , false => true
	result = true;
	System.out.println(result);	// �� = ture
	System.out.println(! result);	// �� = false
	System.out.println(!! result);  // �� = true
	System.out.println(!!! result); // �� = false
}
	}