package com.ict.edu;

public class Ex07 {
	// �ν��Ͻ��� ��ü�� �����Ǳ� ������ ����� �� ����.
	private String name = "Ŀ�ǿ���";
	private int su = 100;
	private int price = 1100;

	// ȣ���Ҷ� ���ȴ� . ������ ��ü�� ��������� �ʾƼ� ����� ��
	public String getName() {
		return name;
	}

	public void setName(String k) {
		// ���������� �������� �̸� ���� ��.
		// ���������� this�� ���δ�.
		// ������ ���������� ���������� �̸��� ������
		// ������ �켱������ ���������̹Ƿ� ���������� ����ϰ� �ȴ�.
		// ���������� �ش�޼ҵ带 ȣ���Ҷ� �����ȴ�.
		// this�� �������� �ڿ� �ٴ´�.
		this.name =k;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
