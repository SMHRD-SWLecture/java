package Season2;

import java.util.Scanner;

public class Ex08세자리수곱셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();

		// 2번째 숫자(num2)의 각 자릿수 분리
		int one = num2 % 10; // 1의 자리
		int ten = (num2 / 10) % 10;
		int hundred = num2 / 100;

		// 각 자릿수 곱셈 결과 계산
		int result1 = num1 * one; // 472 * 5
		int result2 = num1 * ten; // 472 * 8
		int result3 = num1 * hundred; // 472 * 3

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(num1 * num2);
	}

}
