package com.ict.edu;

import java.net.Socket;

public class Ex01 {
	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket("203.236.220.55", 7777);
			System.out.println("Ŭ���̾�Ʈ : �����ϼ̽��ϴ�.");
		} catch (Exception e) {
			
		} finally {
			try {

			} catch (Exception e2) {

			}
		}
	}
}
