package Season3;

import java.util.Scanner;

public class Ex07최종15번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("n 입력 : ");
		int n = sc.nextInt();

		Sequence(n);
	}

	public static void Sequence(int n) {
		int term = 1; // 첫 번재 항
		System.out.print(term + " "); // 첫 번재 항 출력

		for(int i = 1; i < n; i++) {
			term += i; // i만큼 증가
			System.out.print(term + " ");
		}
	}

}
