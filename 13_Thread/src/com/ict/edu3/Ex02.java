package com.ict.edu3;

public class Ex02 implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName() + " : aaaaaaaaaaaaaaaaaaaaa ");
		}

	}

}
