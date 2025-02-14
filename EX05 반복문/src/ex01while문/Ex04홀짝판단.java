package ex01while문;

import java.util.Scanner;

public class Ex04홀짝판단 {

	public static void main(String[] args) {
		// 숫자를 입력받아 홀수와 짝수가 각각 몇 개 입력되었는지 출력되는 프로그램 작성
		// -1을 입력한 경우 프로그램 종료

		Scanner sc = new Scanner(System.in);
		int sum_odd = 0; // 홀수 개수 저장
		int sum_even = 0; // 짝수 개수 저장

		while(true) {
			System.out.print("숫자입력 :");
			int num = sc.nextInt(); // 입력받은 수

			if(num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
			else if(num % 2 == 0) {
				sum_even += 1;
				System.out.println("짝수개수 : " + sum_even);
				System.out.println("홀수개수 : " + sum_odd);
			}
			else {
				sum_odd += 1;
				System.out.println("짝수개수 : " + sum_even);
				System.out.println("홀수개수 : " + sum_odd);
			}
		}
	}

}
