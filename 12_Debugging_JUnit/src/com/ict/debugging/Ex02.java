package com.ict.debugging;

public class Ex02 {
	public static void main(String[] args) {
		Ex02 test = new Ex02();

		String msg = "4";

		test.setData(msg);
		System.out.println(1);
		 msg = test.setData(msg);
		System.out.println(2);
		int msg3 = Integer.parseInt(msg);
		for (int i = 1; i < 10; i++) {
			System.out.println(msg + " * " + i + " =" + (msg3 * i));

		}

	}

	public void set(String msg) {
		System.out.println(msg);
	}

	public String setData(String msg) {
		String str = null;
		if (msg.length() >= 1) {
			str = msg.substring(0, 1);

		}
		return str;
	}
}
