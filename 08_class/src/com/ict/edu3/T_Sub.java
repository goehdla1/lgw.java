package com.ict.edu3;

public class T_Sub extends T_Super{
	String addr;
	int car;

	public T_Sub() {
		this("���� ȫ���Ա�");
		System.out.println("�ڽĻ�����1");
	}

	public T_Sub(String addr) {
		super();
		this.addr = addr;
		System.out.println("�ڽĻ�����2");
	}

	public T_Sub(int car) {
		this.car = car;
	}

	public T_Sub(String addr, int car) {
		this.addr = addr;
		this.car = car;
	}

	public T_Sub(int car, String addr) {
		this.addr = addr;
		this.car = car;
	}
}
