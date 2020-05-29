package com.ict.edu2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex01 implements Runnable{
	Socket s;
	
	OutputStream os;
	BufferedOutputStream bos ;
	InputStream is;
	BufferedInputStream bis;
	Scanner sc = new Scanner(System.in);
	public Ex01() {
		new Thread(this).start();
	}
	@Override
	public void run() {
		try {
			while(true) {
				System.out.print("�Է� : ");
				String msg = sc.next();
				
				s = new Socket("203.236.220.77", 7777);
			
				// ������
				os = s.getOutputStream();
				bos = new BufferedOutputStream(os);
				bos.write(msg.getBytes());
				bos.flush();
				
				// ����
				is = s.getInputStream();
				bis = new BufferedInputStream(is);
				
				byte b = 0 ;
				StringBuffer sb = new StringBuffer();
				while((b = (byte) bis.read())!= -1) {
					sb.append((char)(b));
				}
				String str = sb.toString();
				
				/*
				byte[] b = new byte[1024];
				bis.read(b);
				String str = new String(b);
				str = str.trim();
				*/
				System.out.println("�������� ���� : " + str);
				if(str.equalsIgnoreCase("exit")) break;
				
			}
			
			System.out.println("�����ϼ̽��ϴ�.");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				s.close();
				bos.close();
				os.close();
				bis.close();
				is.close();
			} catch (Exception e2) {
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
