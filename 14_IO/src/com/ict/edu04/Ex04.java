package com.ict.edu04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// BufferedReader : 속도향상 
// readLine() : 한 줄씩 읽는다. 더 이상 읽을 수 없을때 null이 된다.
public class Ex04 {
	public static void main(String[] args) {
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io07.txt";
		File file = new File(pathName);

		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			// 한 줄 읽기
			// String msg = br.readLine();
			// System.out.println(msg);

			// 다 읽기!!!!!!!!!!!!!!!!!!
			String msg = null;
			String str = "";
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine()) != null) {

				// 찍어보기.
				// System.out.println(msg);

				// 저장하기.
				// String은 누적합을 계속 쓰는것이 좋진 않다.
				// str = str + msg + "\n";
				// str = str.concat(msg + "\n");
				// 쌓는 방법은 append
				sb.append(msg + "\n");
			}
			// System.out.println(str);
			// 출력하는 방법은 toString으로 본다 , 왜? 안드로이드에서 안보이기 때문에.
			System.out.println(sb.toString());
		} catch (Exception e) {

		} finally {
			try {
				br.close();
				fr.close();

			} catch (Exception e2) {

			}
		}
	}

}
