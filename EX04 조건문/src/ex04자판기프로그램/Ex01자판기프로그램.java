package ex04자판기프로그램;

import java.util.Scanner;

public class Ex01자판기프로그램 {

	public static void main(String[] args) {
		// 자판기 프로그램

		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();

		System.out.println("====== 메뉴 ======");
		System.out.println("[1] 후라이드 치킨(10,000원) [2] 양념치킨(11,000원) [3] 간장치킨(9,000원)");

		System.out.print("메뉴를 고르세요 : ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1 :
			System.out.println("후라이드 치킨");
			System.out.println("잔돈 : " + (money - 10000) + "원");
			break;
		case 2 :
			System.out.println("양념치킨");
			System.out.println("잔돈 : " + (money - 11000) + "원");
			break;
		case 3 :
			System.out.println("간장치킨");
			System.out.println("잔돈 : " + (money - 9000) + "원");
			break;
		default :
			System.out.println("구매할 수 없는 메뉴입니다.");
		}


	}

}
