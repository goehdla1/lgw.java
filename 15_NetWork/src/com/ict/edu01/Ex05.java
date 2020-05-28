package com.ict.edu01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

// 파싱 : 파싱은 어떤 페이지(문서,html 등) 에서
//		  내가 원하는 데이터를 특정 패턴이나 순서로 추출해 가공하는 것을 말한다.
// XML : eXtensible Markup Language = > 확장 될 수 있는 표시 언어
// 		    사용자가 태그를 만들어서 사용할 수 있다.
// 		    시작태그  <속성='값' 속성='값'> , 텍스트 , 끝태그 </ㅌㅌ>

// XML 파싱  : xml로 구성 된 데이터를 원하는 데이터만 추출, 가공하는 방법
// - DOM (Document Object Modeling)방식 : 웹브라우저가 태그를 해석하고 표현하는 방식.

public class Ex05 {
	public static void main(String[] args) {
		BufferedReader br = null;

		// 파일로 저장.
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "오늘날씨1.txt";
		File file = new File(pathname);

		FileWriter fw = null; // 글자잖아?
		BufferedWriter bw = null; // 가속해야지

		try {
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
			String msg = null; // 저장은해야된다.
			StringBuffer sb = new StringBuffer(); // 저장하기 위해 쓴다.
			while ((msg = br.readLine()) != null) {
				sb.append(msg + "\n");

			}
			InputSource is = new InputSource(new StringReader(sb.toString()));
			// sb에 존재하는 내용을 읽어야 된다.
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // 추상이나,인터페이스라서 new 를 안쓴다. // 팩토리에서
																					// 빌더를 만들고.
			DocumentBuilder builder = factory.newDocumentBuilder(); // 팩토리를 이용해서 빌더를 만든다.
			Document document = builder.parse(is); // 빌더를 이용해서 document를 만든다.

			// 파일 저장을 위한 파일
			StringBuffer sb2 = new StringBuffer(); //

			// 원하는 태그(local)를 찾기 :
			NodeList locals = document.getElementsByTagName("local"); // list라서 배열이라고 생각하자. = > 이 과정을 파싱이라고 한다.

			for (int i = 0; i < locals.getLength(); i++) {
				// 태그(element) 텍스트 구하기
				String txt = locals.item(i).getFirstChild().getNodeValue(); // 공식이다. 외워.
				System.out.print(txt + "\t");
				// 태그(element) 속성(attribute)
				String att1 = ((Element) (locals.item(i))).getAttribute("desc");
				String att2 = ((Element) (locals.item(i))).getAttribute("ta");
				System.out.println(att1 + "       " + att2);

				// sb2 에 누적 저장하기. String으로
				sb2.append(txt + "\t");
				sb2.append(att1 + "\t");
				sb.append(att2 + "\n");

			}

			// 파일로 저장하기.
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			bw.write(sb2.toString());
			bw.flush();

		} catch (Exception e) {

		} finally {
			try {
				br.close();
				bw.close();
				fw.close();

			} catch (Exception e2) {

			}
		}
	}

}