
public class Ex19 {
	public static void main(String[] args) {
		// ���⿬���� ������
		// int k1�� Ȧ������ ¦������ �Ǻ�����
		int k1 = 7;
		String a = (k1 % 2 == 0) ? "Ȧ��" : "¦��";
		System.out.println(a);
		// int k2�� 60�̻��̸� �հ�, ���հ� �Ǻ�����
		int k2 = 30;
		String b = (k2 >= 60) ? "�հ�" : "���հ�";
		System.out.println(b);
		// char k3 = �빮������ , �빮�ڰ� �ƴ��� �Ǻ�����
		char k3 = 'H';
		String c = (k3 >= 'A') && (k3 <= 'Z') ? "�빮��" : "�빮�� �ƴ�";
		System.out.println(c);

		// �ٹ��ð��� 8�ð������� �ð��� 8590�̰�
		// 8�ð��� �ʰ��� �ð� ��ŭ�� 1.5�� �����Ѵ�.
		// ���� �ٹ��� �ð��� 10�̴�.
		// �󸶸� �޾ƾ� �ϴ°�?

		int time = 10;
		int dan= 8590;
		double dan1 = 8590*1.5;
		int pay = (time > 8) ?(int)((time-2)*dan + 2*dan1) : time * dan ;
		System.out.println("���" + pay);
	}
}