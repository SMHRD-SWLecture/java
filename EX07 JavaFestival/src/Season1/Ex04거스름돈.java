package Season1;

import java.util.Scanner;

public class Ex04거스름돈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 금액 입력 : ");
		int price = sc.nextInt(); // 입력받을 금액 & 최대 1만원, 최소 100원

		int man = price / 10000;
		int ochun = price % 10000 / 5000;
		int thousand = price % 10000 % 5000 / 1000;
		int obek = price % 10000 % 5000 % 1000 / 500;
		int hundred = price % 10000 % 5000 % 1000 % 500 / 100;

		System.out.println("10,000원 : " + man + "개");
		System.out.println("5,000원 : " + ochun + "개");
		System.out.println("1,000원 : " + thousand + "개");
		System.out.println("500원 : " + obek + "개");
		System.out.println("100원 : " + hundred + "개");
	}
}
