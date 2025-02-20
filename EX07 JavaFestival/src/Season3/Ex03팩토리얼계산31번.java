package Season3;

import java.util.Scanner;

public class Ex03팩토리얼계산31번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int N = sc.nextInt();

		int result = 1;

		for(int i = 1; i < N + 1; i++) {
			result *= i; // result = result * i
		}
		System.out.print("출력 : " + result);
	}

}
