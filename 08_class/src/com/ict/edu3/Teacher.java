package com.ict.edu3;

public class Teacher extends Person {

	private String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSupject() {
		return subject;
	}

	public void setSupject(String supject) {
		this.subject = supject;
	}

	public void print() {
		super.print();
		System.out.println("°ú¸ñ :" + subject);
	}
}
