package com.ict.edu;

// Thread Ŭ������ start() , run() �� �����Ѵ�.
public class Ex03 extends Thread {

	public void go() {
		System.out.println(currentThread().getName() + " : go() �޼ҵ�"); // Thread�� ��ӹ޾Ҵ�.
	}

	public void run() {
		System.out.println(currentThread().getName() + " : run() �޼ҵ�"); // Thread�� ��ӹ޾Ҵ�.
	}
}
