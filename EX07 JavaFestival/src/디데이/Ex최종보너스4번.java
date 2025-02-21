package 디데이;

import java.util.Scanner;

public class Ex최종보너스4번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] star = new int[5]; // 사용자가 입력하는 별의 개수

		for(int i = 0; i < 5; i++) {
			System.out.print(i + "번째 별의 수 : ");
			star[i] = sc.nextInt();
		}

		System.out.print(star[0] + ":");
		for(int i = 0; i < star[0]; i++) {
			System.out.print("*");
		}

		System.out.println();

		System.out.print(star[1] + ":");
		for(int i = 0; i < star[1]; i++) {
			System.out.print("*");
		}

		System.out.println();

		System.out.print(star[2] + ":");
		for(int i = 0; i < star[2]; i++) {
			System.out.print("*");
		}

		System.out.println();

		System.out.print(star[3] + ":");
		for(int i = 0; i < star[3]; i++) {
			System.out.print("*");
		}

		System.out.println();

		System.out.print(star[4] + ":");
		for(int i = 0; i < star[4]; i++) {
			System.out.print("*");
		}
	}

}
