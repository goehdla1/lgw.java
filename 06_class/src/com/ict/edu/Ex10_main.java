package com.ict.edu;

import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {
		// 5���� �̸�, ����, ����, ������ �Է� �޾Ƽ�
		// �̸� , ����, ��� , ���� , ������ ���ϰ� ��������.
		// ������ ������ main���� ����.
		Scanner sc = new Scanner(System.in);

		// �ѻ���� ������ ������ �ִ� Ŭ������ Ex09�̴�.
		// 5���� ������ ���� �� �ִ� �迭�� ������.

		// �Է��ϱ�.
		Ex10[] arr = new Ex10[5]; // 5���� �迭�� �����.

		for (int i = 0; i < arr.length; i++) {
			Ex10 person = new Ex10(); // Ex09�� ��üȭ �ѰŴ�. new �� ���ο� ��ü�� ����°��̴�. for���� �ᵵ �ߺ��̵��� �ʴ´�.
			System.out.println("�̸��� �Է����ּ���.");
			// String name = sc.next(); �̸��� ���ؼ�
			// person.setName(name); name�� �־��ش�.
			person.setName(sc.next()); // ���� �ΰ��� ��ģ ��ɾ�.

			System.out.println("���� ������?");
			int kor = sc.nextInt();

			System.out.println("���� ������?");
			int eng = sc.nextInt();

			System.out.println("���� ������?");
			int math = sc.nextInt();

			// �հ�
			// ������ Ex10Ŭ������ ó���� ������ ����������.
			// ó���� ������ ������ �Ҷ��� ���� ���Ǵ� ���
			int sum = person.s_sum(kor, eng, math);
			person.setSum(sum);
			// ���
			double avg = person.s_avg();
			person.setAvg(avg);
			// ����
			String hak = person.s_hak();
			person.setHak(hak);

			arr[i] = person;
		}

		// ���� �� ����,���
		// ����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum()) {

					arr[i].setRank(arr[i].getRank() + 1);

				}
			}
		}
		
		//����
		Ex10 tmp = new Ex10(); // �ӽ� �����ϴ°͵� Ŭ������ �������Ѵ�.
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					
				}
			}
			
		}

		// ����ϱ�
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + " ");
			System.out.print(arr[i].getSum() + " ");
			System.out.print(arr[i].getAvg() + " ");
			System.out.print(arr[i].getHak() + " ");
			System.out.println(arr[i].getRank() + " ");
		}
	}
}
