class Ex09{
	public static void main(String[] args){
	// ��������� : +,-,*,/,%(������)
	// char , ������ , �Ǽ��� ��밡��.
	int s1 = 9;
	int s2 = 4;
	int res = 0;

	res = s1 + s2 ;
	System.out.println("���:"+ res);

	res = s1 - s2 ;
	System.out.println("���:"+ res);

	res = s1 * s2 ;
	System.out.println("���:"+ res);

	// ���������� ���� �� ������ ���.
	res = s1 / s2 ;
	System.out.println("���:"+ res);

	// �Ǽ������� ���� ������ ���
	double result1 = (double)(s1) / s2;
	System.out.println("���:"+ result1);

	// ���� / ���� = ���� ��, �Ǽ����� ��Ȯ�ϰ� ������ ����.
	double result2 = s1 / s2;
	System.out.println("���:"+ result2);

	res = s1 % s2 ;
	System.out.println("���:"+ res);
	}
}