package com.ic.edu;

import java.net.ServerSocket;
import java.net.Socket;

// 스레드 ,무한루프 처리.
public class Ex03 implements Runnable {
	ServerSocket ss = null;

	public Ex03() {
		try {
			ss = new ServerSocket(7777);
			System.out.println("서버 대기중....");

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
				// 들어온 정보는 Socket s 가 가지고 있따.
				Socket s = ss.accept();
				System.out.println("ip  :" + s.getInetAddress().getHostAddress());
				System.out.println(Thread.currentThread().getName());
			}
		} catch (Exception e) {

		}

	}

}
