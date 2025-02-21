package 디데이;

import java.util.Scanner;

public class Ex02최종2번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("일한 시간을 입력하세요 : ");
		int hour = sc.nextInt();
		double money = 0; // 알바비

		if(hour > 8) {
			money = 40000 + (hour - 8) * (5000 * 1.5);
			System.out.println("총 임금은 " + money + "원 입니다.");
		}
		else {
			money = 40000;
			System.out.println("총 임금은 " + money + "원 입니다.");
		}

	}

}
