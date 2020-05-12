package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String drink = " ";
		int dan = 0;
		
		esc: while (true) {
			System.out.print("얼마 줄래 ?");
			int input = sc.nextInt();
			System.out.print("메뉴를 선택하세요. 1. 커피음료(3500) , 2. 이온음료(2500) , 3. 물(1500) , 4. 과일쥬스(4000) 단, 부가세 포함.");
			int menu = sc.nextInt();
			System.out.print("몇잔 드릴까요?");
			int su1 = sc.nextInt();
			su1 = 1;
			if (menu == 1) {
				drink = "커피음료";

				dan = 3500;

			} else if (menu == 2) {
				drink = "이온음료";

				dan = 2500;

			} else if (menu == 3) {
				drink = "물";

				dan = 1500;

			} else if (menu == 4) {
				drink = "과일쥬스";

				dan = 4000;

			}
			int vat = (int) (dan * 1.1);
			int output = (input - (vat*su1));
			System.out.println("입금액: " + input);
			System.out.println("선택한 음료 : " + drink);
			System.out.println("잔돈은 ? : " + output);

			esc2: while (true) {
				System.out.println("계속 구입 하실것인가요? 1.yes 2. no >>");
				int su = sc.nextInt();
				if (su == 1) {
					continue esc;

				} else if (su == 2) {
					break esc;

				} else {
					System.out.println("다시입력하세요.");
					continue esc2;
				}

			}

		}
		System.out.println("감사합니다.");

	}
}
