package com.ict.edu;

public class Ex04 {
	private int sum = 0;
	private double avg = 0;
	private String hak = "";
	private int rank = 1;
	private String name = "";

	public void name(String name) {
	}

	public void sum(int kor, int eng, int math) {
		sum = kor + eng + math;

		avg();
	}

	public void avg() {
		avg = (int) (sum / 3.0 * 10) / 10.0;

		hak();
	}

	public void hak() {
		if (avg >= 90) {
			hak = "A";

		} else if (avg >= 80) {
			hak = "B";

		} else if (avg >= 70) {
			hak = "C";

		} else {
			hak = "F";
		}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
