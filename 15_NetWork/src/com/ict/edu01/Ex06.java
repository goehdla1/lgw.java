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

// �Ľ� : �Ľ��� � ������(����,html ��) ����
//		  ���� ���ϴ� �����͸� Ư�� �����̳� ������ ������ �����ϴ� ���� ���Ѵ�.
// XML : eXtensible Markup Language = > Ȯ�� �� �� �ִ� ǥ�� ���
// 		    ����ڰ� �±׸� ���� ����� �� �ִ�.
// 		    �����±�  <�Ӽ�='��' �Ӽ�='��'> , �ؽ�Ʈ , ���±� </����>

// XML �Ľ�  : xml�� ���� �� �����͸� ���ϴ� �����͸� ����, �����ϴ� ���
// - DOM (Document Object Modeling)��� : ���������� �±׸� �ؼ��ϰ� ǥ���ϴ� ���.

// JSON : (���̽�)�� �Ӽ� -�� �� �Ǵ� "Ű-�� ��" ���� �̷����
// 	������ ������Ʈ�� �����ϱ� ���� �ΰ��� ���� �� �ִ�
// �ؽ�Ʈ�� ����ϴ� ������ ǥ�� �����̴�.
// �񵿱� ������/���� ���(AJAX)�� ���� , �аԴ� XML�� ��ü�ϴ� �ֿ� ������ �����̴�.

public class Ex06 {
	public static void main(String[] args) {
		BufferedReader br = null;

		// ���Ϸ� ����.
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "�����ּ�.txt";
		File file = new File(pathname);

		FileWriter fw = null; // �����ݾ�?
		BufferedWriter bw = null; // �����ؾ���

		try {
			URL url = new URL("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");

			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));

			String msg = null; // �������ؾߵȴ�.
			StringBuffer sb = new StringBuffer(); // �����ϱ� ���� ����.
			while ((msg = br.readLine()) != null) {
				System.out.println(msg);
				sb.append(msg + "\n");
			}
			System.out.println("===========================================================================");

			// json ���� �б� : json�� �д� �ܺζ��̺귯�� �����ϱ�.
			// �ش�������Ʈ���� ���콺 ������ - Build path
			JSONParser parser = new JSONParser();
			JSONObject obj1 = (JSONObject) parser.parse(sb.toString());
			JSONObject obj2 = (JSONObject) obj1.get("SeoulLibraryTime");
			JSONArray j_arr = (JSONArray) obj2.get("row");

			StringBuffer sb2 = new StringBuffer();

			// ��°�� �̴¹��.
			/*for (Object k : j_arr) {
				JSONObject jobj = (JSONObject) k;
				String name = (String) jobj.get("LBRRY_NAME");
				String phone = (String) jobj.get("TEL_NO");
				String addr = (String) jobj.get("ADRES");
				System.out.println(name + "\t" + phone + "\t" + addr + "\n"); // ���°�.
				

			}*/

			for (int i = 0; i < j_arr.size(); i++) {
				// {} �ϳ��� JSONObject ��� �Ѵ�.
				JSONObject obj3 = (JSONObject) j_arr.get(i);
				String name = (String) obj3.get("LBRRY_NAME");
				String phone = (String) obj3.get("TEL_NO");
				String addr = (String) obj3.get("ADRES");

				sb2.append(name + "\t" + phone + "\t" + addr + "\n"); // ���Ͽ� �ִ°�.
				System.out.println(name + "\t" + phone + "\t" + addr + "\n"); // ���°�.

			}

			// ���Ϸ� �����ϱ�.
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