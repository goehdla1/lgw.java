package com.ict.edu2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	// ������ ���̽� ���� ���
	public static void listPrn(ArrayList<VO> list) {
		System.out.println();
		System.out.println("IDX\tID\tPW\tNAME\tAGE\tREG");
		for (VO vo : list) {
			System.out.print(vo.getIdx() + "\t");
			System.out.print(vo.getId() + "\t");
			System.out.print(vo.getPw() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getAge() + "\t");
			System.out.println(vo.getReg());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Ͻÿ�");
		System.out.println("1. ���̺� ������ ����");
		System.out.println("2. ���̺� ������ ����");
		System.out.println("3. ���̺� ������ ����");
		System.out.println("4. ���̺� ������ ����");
		System.out.println("5. �α���");
		System.out.print(">>>   ");
		int su = sc.nextInt();

		ArrayList<VO> list = null;
		switch (su) {
		case 1:
			list = DAO.getInstance().getSelect();
			listPrn(list);
			break;
		case 2:
			System.out.println("������ �Է��ϼ���");
			System.out.print("idx : ");
			String idx = sc.next();

			System.out.print("���̵� : ");
			String id = sc.next();

			System.out.print("�н����� : ");
			String pw = sc.next();

			System.out.print("�̸� : ");
			String name = sc.next();

			System.out.print("���� : ");
			String age = sc.next();

			list = DAO.getInstance().getInsert(idx, id, pw, name, age);
			listPrn(list);
			break;
		case 3:
			list = DAO.getInstance().getSelect();
			listPrn(list);
			System.out.println();
			System.out.print("������ IDX : ");
			System.out.println();
			String idx1 = sc.next();
			list = DAO.getInstance().getDelete(idx1);
			listPrn(list);
			break;
		case 4:
			list = DAO.getInstance().getSelect();
			listPrn(list);
			System.out.println();
			System.out.print("������ IDX : ");
			String idx2 = sc.next();
			System.out.print("������ ���� : ");
			String age1 = sc.next();
			System.out.println();
			list = DAO.getInstance().getUpdate(idx2, age1);
			listPrn(list);
			break;
		case 5:
			System.out.println();
			System.out.print(" ID : ");
			String log_id = sc.next();
			System.out.print(" PW : ");
			String log_pw = sc.next();
			System.out.println();
			list = DAO.getInstance().getLogIn(log_id, log_pw);
			if (list.size() == 1) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ����");
			}
			break;
		}

		System.out.println();
		System.out.println();
		System.out.println("���� �ϼ̽��ϴ�.");
	}
}
