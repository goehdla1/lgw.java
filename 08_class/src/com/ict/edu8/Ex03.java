package com.ict.edu8;

// �������̽� ���
// 1. �Ϲ� Ŭ���갡 ��� ������ �ݵ�� �������̵� �ؾ� �ȴ�.
class Ex03 implements Ex01 {
	@Override
	public void play() {

	}

	@Override
	public void sound() {

	}

}

// 2. �߻� Ŭ������ ��� ������ �������̵� �� �ʿ䰡 ����.
abstract class Ex04 implements Ex01 {
	int k1 = 10; // �ν��Ͻ� ����

	public abstract void leftSound();
}

abstract class Ex05 implements Ex01 {
	int k1 = 10; // �ν��Ͻ� ����
}

// 3. �������̽��� ����� ������ �������̵� �� �ʿ䰡 ����.
interface Ex06 extends Ex01 {
	int k1 = 10; // => static final
}

// 2,3���� ���߿��� �Ϲ�Ŭ������ ��ӹ����� ��� �������̵� �ؾ��Ѵ�.
// Ex01 �������̵�
class Ex07 extends Ex05 {

	@Override
	public void play() {

	}

	@Override
	public void sound() {

	}

}

// Ex01 , Ex04 �������̵�
class Ex08 extends Ex04 {

	@Override
	public void play() {

	}

	@Override
	public void sound() {

	}

	@Override
	public void leftSound() {

	}
}
