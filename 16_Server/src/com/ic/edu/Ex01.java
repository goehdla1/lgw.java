package com.ic.edu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 자바통신은 소켓 통신 , 소켓은 읽기/쓰기 위한 인터페이스 제공
// 포트 : 내부와 외부를 연결하는 게이트 역할을 한다.
// 0 - 65535 , 0 - 1024 는 사용자가 지정하지 않는다.

// 서버 : ServerSocket , 클라이언트 : Socket
// 203.236.220.77

public class Ex01 {
	public static void main(String[] args) {
		// 서버는 끊나지 않고 계속 켜져 있어야한다. 그래서 close를 쓰지 않는다. , 무한루프를 돌린다.
		try {
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("서버 대기 중...");

			// 클라이언트가 접속할 때 까지 기다린다.
			// 접속을 하면 담당소켓을 하나 만든다.
			// 담당소켓(s)은 접속한 클라이언트의 정보를 가지고 있다 , 그래야지 정보를 주고 받을 수 있다.

			Socket s = ss.accept();

			// 클라이언트에 대한 정보 출력
			String ip = s.getInetAddress().getHostAddress();
			String name = s.getInetAddress().getHostName();

			System.out.println("ip :" + ip);
			System.out.println("name :" + name);
			System.out.println("서버 : 수고하셨습니다.");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
