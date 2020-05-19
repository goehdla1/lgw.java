package com.ict.edu6;

public class Student extends Person {
	private int id;
	/*
	 * public Student() { // super(); 오류 이유. // super("태권브이",25); // 1. 오류아님. //
	 * person클래스에 기본 생성자 만들어도 오류 아님. }
	 */

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print() {
		System.out.println("이름 :" + super.getName() + ", 나이 :" + getAge() + ", 학번 :" + id);
	}

}
