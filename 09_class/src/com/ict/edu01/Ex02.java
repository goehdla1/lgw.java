package com.ict.edu01;

enum Type {
	WALKING, RUNNING, TRACKING, HIKING // static final 이다.
}

public class Ex02 {
	public String name;
	public int size;
	public Type type;

	public static void main(String[] args) {

		// System.out.println(name);

		Ex02 shose = new Ex02();
		shose.name = "나이키";
		shose.size = 270;
		shose.type = Type.HIKING;

		System.out.println("신발 이름 : " + shose.name);
		System.out.println("신발 사이즈 : " + shose.size);
		System.out.println("신발 종류 : " + shose.type);

	}

}
