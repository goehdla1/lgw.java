package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입금액 : ?");
		int input = sc.nextInt();
		System.out.print("메뉴를 선택하세요. 1. 커피음료(3500) , 2. 이온음료(2500) , 3. 물(1500) , 4. 과일쥬스(4000) ");
		int menu = sc.nextInt();
		int dan = 0;
		String drink = " ";
		if (menu == 1) {
			drink = "커피음료";
			dan = 3500;
		}else if (menu == 2) {
			drink = "이온음료";
			dan = 2500;
			
		}else if (menu == 3) {
			drink = "물";
			dan = 1500;
			
		}else if (menu == 4) {
			drink = "과일쥬스";
					dan = 4000;
			
		}
		int output = input - 
				int vat = (dan*1.1);
		
		
		System.out.println("입금액: " + input);
		System.out.println("선택한 음료 : " + menu);
		System.out.println("잔돈은 ? : " + );
	}
}
