package com.ict.edu2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex02 implements Runnable {
	Socket s;

	OutputStream out;
	OutputStreamWriter osw;
	BufferedWriter bw;

	InputStream in;
	InputStreamReader isr;
	BufferedReader br;
	Scanner sc = new Scanner(System.in);

	public Ex02() {
		new Thread(this).start();
	}

	@Override
	public void run() {
		try {
			while (true) {
				System.out.print("�Է� : ");
				// sc.next(); => ����,���͸� ������ ����.
				// sc.nextLine(); = > ���� ��ü�� �޴´�.
				String msg = sc.nextLine();

				s = new Socket("203.236.220.55", 7788);

				// ������
				out = s.getOutputStream();
				osw = new OutputStreamWriter(out);
				bw = new BufferedWriter(osw);
				msg += System.getProperty("line.separator");
				bw.write(msg);
				bw.flush();

				// �ޱ�
				in = s.getInputStream();
				isr = new InputStreamReader(in);
				br = new BufferedReader(isr);

				String str = br.readLine();
				System.out.println("�������� �� ���� : " + str);
				if (str.equalsIgnoreCase("exit"))
					break;
			}
			System.out.println("�����ϼ̽��ϴ�.");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				s.close();

			} catch (Exception e2) {
			}

		}

	}

	public static void main(String[] args) {
		new Ex02();
	}
}
