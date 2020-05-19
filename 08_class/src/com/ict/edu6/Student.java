package com.ict.edu6;

public class Student extends Person {
	private int id;
	/*
	 * public Student() { // super(); ���� ����. // super("�±Ǻ���",25); // 1. �����ƴ�. //
	 * personŬ������ �⺻ ������ ���� ���� �ƴ�. }
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
		System.out.println("�̸� :" + super.getName() + ", ���� :" + getAge() + ", �й� :" + id);
	}

}
