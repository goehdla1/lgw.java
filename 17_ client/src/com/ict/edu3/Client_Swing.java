package com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Client_Swing extends JFrame implements Runnable {
	JPanel jp;
	JTextArea jta;
	JScrollPane jsp;
	JTextField jtf;
	JButton jb;

	Socket s;
	BufferedReader br;
	BufferedWriter bw;

	public Client_Swing() {
		setTitle("멀티채팅");
		jp = new JPanel();
		jta = new JTextArea();
		jta.setLineWrap(true);
		jta.setEnabled(false);
		jta.setFont(new Font("굴림", Font.BOLD, 20));
		jta.setBackground(Color.gray);
		jta.setForeground(Color.WHITE);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jtf = new JTextField(35);
		jb = new JButton("보내기");
		jp.add(jtf);
		jp.add(jb);
		add(jsp, BorderLayout.CENTER);
		add(jp, BorderLayout.SOUTH);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);

		connet();

		addWindowListener(new WindowAdapter() {

		});

		jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});
	}

	public void connet() {
		try {
			s = new Socket("203.236.220.55", 7788);
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));

			new Thread(this).start();
		} catch (Exception e) {
			System.out.println("1 : " + e);
		}
	}

	public void sendMsg() {
		try {

			String msg = jtf.getText().trim();
			if (msg.length() > 0) {
				msg += System.getProperty("line.separator");
				bw.write(msg);
				bw.flush();
				jtf.setText("");
				jtf.requestFocus();
			} else {
			}
		} catch (Exception e) {
			System.out.println("2 : " + e);
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				String msg = br.readLine();
				jta.append(msg + "\n");
				if (msg.equalsIgnoreCase("bye~~~")) {
					break;
				}
			}
			System.exit(0);
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		new Client_Swing();
	}

}
