package com.ict.edu03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream�� DataOutputStream

// �⺻�ڷ����� �ְ� ���� �� ���
// ** �ݵ�� �Է¼����� ��� ������ ����� �Ѵ�.
// �⺻ �����ڰ� ��� BufferedInputStream �� BufferedOutputStream ó��
// ȥ�ڼ��� ��� ���ϰ� ���� FileInputStream , FileOutputStream �� Ȱ���Ѵ�.

public class Ex01 {
	public static void main(String[] args) {
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io04.txt";

		File file = new File(pathName);

		FileOutputStream fos = null;
		DataOutputStream dos = null;

		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);

			// ���� : writeXXX() : XXX�� �⺻ �ڷ����� ���Ѵ�.
			dos.writeByte(126);
			dos.writeShort(5422);
			dos.writeInt(124);
			dos.writeLong(123L);
			dos.writeFloat(34.14F);
			dos.writeDouble(57.1);
			dos.writeBoolean(true);
			dos.writeChar('a');
			dos.flush();

			// �б� : readXXX : XXX�� �⺻ �ڷ����� ���Ѵ�.
			// ���⿡�� �� ������ �б� ������ ���ƾ� �Ѵ�. (��,����� ���ƾ� �Ѵٴ� ��)
			// ������ Ʋ������ ��� ���� �޶�����.
			System.out.println(dis.readByte());
			System.out.println(dis.readShort());
			System.out.println(dis.readInt());
			System.out.println(dis.readLong());
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());

		} catch (Exception e) {

		} finally {
			try {
				if (dos != null)
					dos.close();
				if (fos != null)
					fos.close();
				if (dis != null)
					dis.close();
				if (fis != null)
					fis.close();

			} catch (Exception e2) {

			}
		}

	}

}
