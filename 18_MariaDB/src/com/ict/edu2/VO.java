package com.ict.edu2;

// VO(Value Object) : 관계 데이터 베이스의 레코드(행)에 대응되는 자바 클래스이다.
//					     관계 데이터 베이스의 컬럼명과 같은 이름의 변수를 만들어서 사용
public class VO {
	private String idx , id , pw , name , age , reg ;
	
	
	public VO() {
		
	}


	public VO(String idx, String id, String pw, String name, String age, String reg) {
		super();
		this.idx = idx;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.reg = reg;
	}


	public String getIdx() {
		return idx;
	}


	public void setIdx(String idx) {
		this.idx = idx;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getReg() {
		return reg;
	}


	public void setReg(String reg) {
		this.reg = reg;
	}


}
