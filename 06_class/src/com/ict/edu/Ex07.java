package com.ict.edu;

public class Ex07 {
	// 인스턴스라서 객체가 생성되기 전까지 사용할 수 없다.
	private String name = "커피우유";
	private int su = 100;
	private int price = 1100;

	// 호출할때 사용된다 . 지금은 객체가 만들어지지 않아서 사용이 안
	public String getName() {
		return name;
	}

	public void setName(String k) {
		// 전역변수와 지역변수 이름 같을 때.
		// 전역변수에 this를 붙인다.
		// 이유는 전역변수와 지역변수의 이름이 같으면
		// 무조건 우선순위는 지역변수이므로 지역변수만 사용하게 된다.
		// 지역변수는 해당메소드를 호출할때 생성된다.
		// this는 전역변수 뒤에 붙는다.
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
