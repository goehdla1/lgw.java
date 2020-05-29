package com.ict.edu;

import java.net.Socket;

public class Ex03 implements Runnable {
	Socket s = null;

	public Ex03() {
		new Thread(this).start();
	}

	@Override
	public void run() {
		try {

			s = new Socket("203.236.220.77", 7777);
			System.out.println("수고 하셨습니다.");
		} catch (Exception e) {

		} finally {
			try {
				s.close();
			} catch (Exception e2) {

			}
		}

	}

	public static void main(String[] args) {
		new Ex03();
	}
}
