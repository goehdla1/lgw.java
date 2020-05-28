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

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
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

// JSON : (제이슨)은 속성 -값 쌍 또는 "키-값 쌍" 으로 이루어진
// 	데이터 오브젝트를 전달하기 위해 인간이 읽을 수 있는
// 텍스트를 사용하는 개방형 표준 포맷이다.
// 비동기 브라우저/서버 통신(AJAX)을 위해 , 넓게는 XML을 대체하는 주요 데이터 포맷이다.

public class Ex06 {
	public static void main(String[] args) {
		BufferedReader br = null;

		// 파일로 저장.
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "병원주소.txt";
		File file = new File(pathname);

		FileWriter fw = null; // 글자잖아?
		BufferedWriter bw = null; // 가속해야지

		try {
			URL url = new URL("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");

			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));

			String msg = null; // 저장은해야된다.
			StringBuffer sb = new StringBuffer(); // 저장하기 위해 쓴다.
			while ((msg = br.readLine()) != null) {
				System.out.println(msg);
				sb.append(msg + "\n");
			}
			System.out.println("===========================================================================");

			// json 파일 읽기 : json을 읽는 외부라이브러리 연결하기.
			// 해당프로젝트에서 마우스 오른쪽 - Build path
			JSONParser parser = new JSONParser();
			JSONObject obj1 = (JSONObject) parser.parse(sb.toString());
			JSONObject obj2 = (JSONObject) obj1.get("SeoulLibraryTime");
			JSONArray j_arr = (JSONArray) obj2.get("row");

			StringBuffer sb2 = new StringBuffer();

			// 통째로 뽑는방법.
			/*for (Object k : j_arr) {
				JSONObject jobj = (JSONObject) k;
				String name = (String) jobj.get("LBRRY_NAME");
				String phone = (String) jobj.get("TEL_NO");
				String addr = (String) jobj.get("ADRES");
				System.out.println(name + "\t" + phone + "\t" + addr + "\n"); // 보는것.
				

			}*/

			for (int i = 0; i < j_arr.size(); i++) {
				// {} 하나를 JSONObject 라고 한다.
				JSONObject obj3 = (JSONObject) j_arr.get(i);
				String name = (String) obj3.get("LBRRY_NAME");
				String phone = (String) obj3.get("TEL_NO");
				String addr = (String) obj3.get("ADRES");

				sb2.append(name + "\t" + phone + "\t" + addr + "\n"); // 파일에 넣는것.
				System.out.println(name + "\t" + phone + "\t" + addr + "\n"); // 보는것.

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