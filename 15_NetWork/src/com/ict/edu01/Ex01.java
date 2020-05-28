package com.ict.edu01;

import java.net.InetAddress;
import java.net.UnknownHostException;

// InetAddress : 자바에서 IP주소를 표현하는 클래스
// 				  생성자가 존재하지만 사용하지 않는다.
//				 6개의 static메소드를 이용한다.
//				 ** localhost 란 현재 내가 사용하고 있는 컴퓨터를 말한다.
public class Ex01 {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			System.out.println("이름 : " + addr.getHostName()); // 이름
			System.out.println("주소 : " + addr.getHostAddress()); // 주소
			System.out.println("toString() : " + addr.toString()); // 이름과 주소가 다 나온다. toString
			System.out.println("============================================================");

			addr = InetAddress.getByName("www.naver.com"); // 네이버를 알고 싶다.
			System.out.println("이름 : " + addr.getHostName()); // 이름
			System.out.println("주소 : " + addr.getHostAddress()); // 주소
			System.out.println("toString() : " + addr.toString()); // 이름과 주소가 다 나온다. toString
			System.out.println("============================================================");

			// 125.209.222.142 주소로 가고싶다. => byte[] 사용.
			byte[] b = { 125, (byte) 209, (byte) 222, (byte) 142 };
			addr = InetAddress.getByAddress(b);
			System.out.println("이름 : " + addr.getHostName()); // 이름
			System.out.println("주소 : " + addr.getHostAddress()); // 주소
			System.out.println("toString() : " + addr.toString()); // 이름과 주소가 다 나온다. toString
			System.out.println("============================================================");

			InetAddress[] addrs = InetAddress.getAllByName("m.naver.com"); // getAllByName = InetAddress 배열을 사용.
			for (InetAddress k : addrs) {
				System.out.println("이름 : " + k.getHostName()); // 이름
				System.out.println("주소 : " + k.getHostAddress()); // 주소
				System.out.println("toString() : " + k.toString()); // 이름과 주소가 다 나온다. toString
				System.out.println("---------------------------------------------------------------------");
			}
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}

	}
}
