
public class Ex18 {
	public static void main(String[] args) {
		System.out.println();
		// ���� ������(���ǿ�����)
		// - ���� : ���庯�� = ���ǽ� ? ���϶� ���๮�� : �����϶� ���๮��;
		// - ���ǽĿ� ���� ���� : boolean�� -> �񱳿���,������,boolean
		// - ���庯��, ���϶� ������ , �����϶� ������ ��� ���� �ڷ����̾�� �Ѵ�.
		
		String res = true ? "�հ�" : "���հ�";
		System.out.println("���:" + res);
		
		// - ���庯��, ���϶� ������ , �����϶� ������ ��� ���� �ڷ����̾�� �Ѵ�.
		//res = false ? 10 : "B"; =���� :10�� string�� �ƴ϶�.
		
		//���ܻ���
		int point = true ? 10 : 20 ;
		long point2 = true ? 10 : 20 ;
		double point3 = true ? 10 : 24.7 ;

		// ����� 90�̻��̸� 'A' , �ƴϸ� 'B'
		double avg = 87.6;
		int result = (avg >= 90) ? 'A':'B'; // (avg >= 90) boolean��
		System.out.println("���: " + result);
		
	}
}
