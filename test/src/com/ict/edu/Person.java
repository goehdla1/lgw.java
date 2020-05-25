package com.ict.edu;

public class Person {

	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int rank = 1;
	String res = "";

	public void sum(int kor, int eng, int math) {
		sum = kor + eng + math;
		avg();
	}

	public void avg() {
		avg = (int) (sum / 3.0 * 10) * 10.0;
		hak();
	}

	public void hak() {
		if (avg >= 90) {

			res = "A";

		} else if (avg >= 80) {
			res = "B";

		} else if (avg >= 70) {
			res = "C";

		} else {
			res = "F";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

}
