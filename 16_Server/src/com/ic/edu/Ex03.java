package com.ic.edu;

import java.net.ServerSocket;
import java.net.Socket;

// ������ ,���ѷ��� ó��.
public class Ex03 implements Runnable {
	ServerSocket ss = null;

	public Ex03() {
		try {
			ss = new ServerSocket(7777);
			System.out.println("���� �����....");

			new Thread(this).start();

		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		new Ex03();
		System.out.println(Thread.currentThread().getName());

	}

	@Override
	public void run() {

		try {
			while (true) {
				System.out.println(Thread.currentThread().getName());
				// ���� ������ Socket s �� ������ �ֵ�.
				Socket s = ss.accept();
				System.out.println("ip  :" + s.getInetAddress().getHostAddress());
				System.out.println(Thread.currentThread().getName());
			}
		} catch (Exception e) {

		}

	}

}
