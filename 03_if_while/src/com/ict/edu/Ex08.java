package com.ict.edu;

public class Ex08 {
	public static void main(String[] args) {
		// 중첩 while 문 : while문 안에 while문
		// 다중 for문과 같다.
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i=" + i + ", j = " + j);

			}

		}
		System.out.println();

		int k1 = 1;
		while (k1 < 4) {

			int k2 = 1;
			while (k2 < 6) {
				System.out.println("k1=" + k1 + ", k2 = " + k2);

				k2++;
			}
			k1++;
		}

		// 구구단
		int k3 = 2;
		while (k3 < 10) {
			int k4 = 1;
			while (k4 < 10) {
				System.out.println(k3 + "*" + k4 + "=" + k3 * k4);
				k4++;
			}
			k3++;
		}
		System.out.println("=========================================================================");
		int k5 = 2;
		while (k5 < 10) {
			int k6 = 1;
			while (k6 < 10) {
				System.out.print(k5 + "*" + k6 + "=" + k5 * k6 + " ");
				k6++;
			}
			System.out.println();
			k5++;
		}
		System.out.println("=========================================================================");
		int k7 = 1;
		while (k7 < 10) {
			int k8 = 2;
			while (k8 < 10) {
				System.out.print(k7 + "*" + k8 + "=" + k7 * k8 + " ");
				k8++;
			}
			System.out.println();
			k7++;
		}

	}

}
