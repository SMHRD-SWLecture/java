package 메서드기초;

import java.util.Scanner;

public class Ex04완전수구하기 {

	public static void main(String[] args) {
		// 완전수란?
		// 자기자신을 제외한 나머지 약수의 합이 자기 자신과 같다면 완전수
		// ex)  6 = 1 + 2 + 3 (약수 : 1 2 3 6)

		Scanner sc = new Scanner(System.in);

		// System.out.print("num1 입력 : ");
		// int num1 = sc.nextInt();
		// System.out.print("num2 입력 : ");
		// int num2 = sc.nextInt();

		// boolean divisor = isDivisor(num1, num2);
		// System.out.println(divisor);

		// System.out.println(getSum(44));
		System.out.print("완전수를 입력하시오 : ");
		int num3 = sc.nextInt();
		System.out.println(isPerferect(num3));
	}

	public static boolean isDivisor(int num1, int num2) {
		if(num1 % num2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static int getSum(int num3) {
		int sum = 0;

		for(int i = 1; i < num3; i++) {
			if(num3 % i == 0) {
				sum += i;
			}
		}
		return sum;
	} // getSum method가 끝나는 지점

	// 3. isPerferect 함수 : 완전수인지 물어봐서 리턴값을 통해서 완전수인지를 판단
	private static boolean isPerferect(int num3) {
		if(num3 == getSum(num3)) {
			return true;
		}
		else {
			return false;
		}
	}
}
