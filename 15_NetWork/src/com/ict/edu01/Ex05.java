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

// �Ľ� : �Ľ��� � ������(����,html ��) ����
//		  ���� ���ϴ� �����͸� Ư�� �����̳� ������ ������ �����ϴ� ���� ���Ѵ�.
// XML : eXtensible Markup Language = > Ȯ�� �� �� �ִ� ǥ�� ���
// 		    ����ڰ� �±׸� ���� ����� �� �ִ�.
// 		    �����±�  <�Ӽ�='��' �Ӽ�='��'> , �ؽ�Ʈ , ���±� </����>

// XML �Ľ�  : xml�� ���� �� �����͸� ���ϴ� �����͸� ����, �����ϴ� ���
// - DOM (Document Object Modeling)��� : ���������� �±׸� �ؼ��ϰ� ǥ���ϴ� ���.

public class Ex05 {
	public static void main(String[] args) {
		BufferedReader br = null;

		// ���Ϸ� ����.
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "���ó���1.txt";
		File file = new File(pathname);

		FileWriter fw = null; // �����ݾ�?
		BufferedWriter bw = null; // �����ؾ���

		try {
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
			String msg = null; // �������ؾߵȴ�.
			StringBuffer sb = new StringBuffer(); // �����ϱ� ���� ����.
			while ((msg = br.readLine()) != null) {
				sb.append(msg + "\n");

			}
			InputSource is = new InputSource(new StringReader(sb.toString()));
			// sb�� �����ϴ� ������ �о�� �ȴ�.
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // �߻��̳�,�������̽��� new �� �Ⱦ���. // ���丮����
																					// ������ �����.
			DocumentBuilder builder = factory.newDocumentBuilder(); // ���丮�� �̿��ؼ� ������ �����.
			Document document = builder.parse(is); // ������ �̿��ؼ� document�� �����.

			// ���� ������ ���� ����
			StringBuffer sb2 = new StringBuffer(); //

			// ���ϴ� �±�(local)�� ã�� :
			NodeList locals = document.getElementsByTagName("local"); // list�� �迭�̶�� ��������. = > �� ������ �Ľ��̶�� �Ѵ�.

			for (int i = 0; i < locals.getLength(); i++) {
				// �±�(element) �ؽ�Ʈ ���ϱ�
				String txt = locals.item(i).getFirstChild().getNodeValue(); // �����̴�. �ܿ�.
				System.out.print(txt + "\t");
				// �±�(element) �Ӽ�(attribute)
				String att1 = ((Element) (locals.item(i))).getAttribute("desc");
				String att2 = ((Element) (locals.item(i))).getAttribute("ta");
				System.out.println(att1 + "       " + att2);

				// sb2 �� ���� �����ϱ�. String����
				sb2.append(txt + "\t");
				sb2.append(att1 + "\t");
				sb.append(att2 + "\n");

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