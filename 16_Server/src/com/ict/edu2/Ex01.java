package com.ict.edu2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// ���ڼ��� : ���� ������ �״�� �����ش�.
public class Ex01 implements Runnable{
	ServerSocket ss =  null;
	
	// ������ �ޱ� ���� ��Ʈ�� ó�� (����Ʈ ��Ʈ��)
	InputStream is;
	BufferedInputStream bis;
	OutputStream os ;
	BufferedOutputStream bos ;
	
	public Ex01() {
		try {
			ss = new ServerSocket(7777);
			System.out.println("���� ���� ��� �� ...");
			new Thread(this).start();
		} catch (Exception e) {
		}
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				Socket s = ss.accept();
				// Ŭ���̾�Ʈ���� �����͸� �����Դ�. �������� ��Ʈ�� ó��
				is = s.getInputStream(); 
				bis = new BufferedInputStream(is);
				
				 //while�� ���������� ���� // 
				byte b = 0 ;
				StringBuffer sb = new StringBuffer();
				while((b=(byte) bis.read()) != -1) {
					System.out.println((char)(b));
					sb.append((char)(b));
				}
				
				/*
				byte[] b = new byte[1024];
				bis.read(b);
				
				String msg  = new String(b);*/
				String msg = sb.toString();
				
				msg = msg.trim();
				System.out.println("�������� : " + msg);
				
				
				// Ŭ���̾�Ʈ���� ������ 
				os = s.getOutputStream();
				bos = new BufferedOutputStream(os);
				bos.write(msg.getBytes());
				bos.flush();
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}