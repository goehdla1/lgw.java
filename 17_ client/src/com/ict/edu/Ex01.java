package com.ict.edu;

import java.net.Socket;

public class Ex01 {
	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket("203.236.220.55", 7777);
			System.out.println("클라이언트 : 수고하셨습니다.");
		} catch (Exception e) {
			
		} finally {
			try {

			} catch (Exception e2) {

			}
		}
	}
}
