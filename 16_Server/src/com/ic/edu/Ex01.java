package com.ic.edu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// �ڹ������ ���� ��� , ������ �б�/���� ���� �������̽� ����
// ��Ʈ : ���ο� �ܺθ� �����ϴ� ����Ʈ ������ �Ѵ�.
// 0 - 65535 , 0 - 1024 �� ����ڰ� �������� �ʴ´�.

// ���� : ServerSocket , Ŭ���̾�Ʈ : Socket
// 203.236.220.77

public class Ex01 {
	public static void main(String[] args) {
		// ������ ������ �ʰ� ��� ���� �־���Ѵ�. �׷��� close�� ���� �ʴ´�. , ���ѷ����� ������.
		try {
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("���� ��� ��...");

			// Ŭ���̾�Ʈ�� ������ �� ���� ��ٸ���.
			// ������ �ϸ� �������� �ϳ� �����.
			// ������(s)�� ������ Ŭ���̾�Ʈ�� ������ ������ �ִ� , �׷����� ������ �ְ� ���� �� �ִ�.

			Socket s = ss.accept();

			// Ŭ���̾�Ʈ�� ���� ���� ���
			String ip = s.getInetAddress().getHostAddress();
			String name = s.getInetAddress().getHostName();

			System.out.println("ip :" + ip);
			System.out.println("name :" + name);
			System.out.println("���� : �����ϼ̽��ϴ�.");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
