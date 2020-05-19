package ict.com.edu10;

public class Calc implements Div {
	public static void main(String[] args) {

	}

	@Override
	public double mul(double s1, double s2) {

		return s1 * s2;
	}

	@Override
	public double minus(double s1, double s2) {

		return s1 - s2;
	}

	@Override
	public double plus(double s1, double s2) {

		return s1 + s2;
	}

	@Override
	public double div(double s1, double s2) {

		return s1 / s2;
	}
}
