package com.ict.edu4;

// final : ���� , ���� �ǹ̰� �ִ�.
// final class = > ����� �ȵȴ�.
// final method = > �������̵��� �ȵȴ�.
// final ����  = > ���

public abstract class Animal {
	int eyes = 2;
	int legs = 4;

	public void like() {
		System.out.println("���ڱ�");
	}

	public abstract void sound();

	public final void sleep() {
		System.out.println("6�ð� ���� �ܴ�.");
	}

}