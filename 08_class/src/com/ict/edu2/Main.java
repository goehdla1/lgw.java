package com.ict.edu2;

public class Main {
	public static void main(String[] args) {
		DcaPhone dca = new DcaPhone();
		dca.call(); // �θ�
		dca.sms();  // �θ�
		dca.dca();  // �ڽ�
		
		System.out.println("=============================");
		
		Mp3Phone mp3 = new Mp3Phone();
		mp3.call();  // �θ�
		mp3.sms();   // �θ�
		mp3.sound(); // �ڽ�
		
		System.out.println("=============================");
		
		GamePhone gp = new GamePhone();
		gp.call();   // �θ�
		gp.sms();    // �θ�
		gp.play();   // �ڽ�
		
		System.out.println("=============================");
	}
}
