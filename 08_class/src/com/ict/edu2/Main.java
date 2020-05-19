package com.ict.edu2;

public class Main {
	public static void main(String[] args) {
		DcaPhone dca = new DcaPhone();
		dca.call(); // 부모
		dca.sms();  // 부모
		dca.dca();  // 자식
		
		System.out.println("=============================");
		
		Mp3Phone mp3 = new Mp3Phone();
		mp3.call();  // 부모
		mp3.sms();   // 부모
		mp3.sound(); // 자식
		
		System.out.println("=============================");
		
		GamePhone gp = new GamePhone();
		gp.call();   // 부모
		gp.sms();    // 부모
		gp.play();   // 자식
		
		System.out.println("=============================");
		
		Phone p1 =new DcaPhone(); // 부모 클래스에 자식 생성자도 가능.
		p1.call(); // 부모
		p1.sms();  // 부모
		//p1.dca();   자식 멧호두는 못쓴다.
		
		Phone p2 = new Mp3Phone();
		p2.call(); // 부모
		p2.sms();  // 부모
		//p2.sound();  자식 멧호듀는 못써
	}
}
