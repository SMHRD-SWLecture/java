package 디데이;

import java.util.Scanner;

public class Ex19최종19번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("단수입력 : ");
		int dan = sc.nextInt();

		System.out.println("어느 수까지 출력 : ");
		int num = sc.nextInt();

		System.out.println("2단");
		for(int i = 1; i < num + 1; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
	}

}
