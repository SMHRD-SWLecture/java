package Season1;

import java.util.Scanner;

public class Ex07별찍기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 : ");
		int row = sc.nextInt();

		for(int i = 1 ; i <= row; i++) {
			for(int j = row; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
