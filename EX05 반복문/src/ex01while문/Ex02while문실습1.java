package ex01while문;

import java.util.Scanner;

public class Ex02while문실습1 {

	public static void main(String[] args) {
		// 입력 받은 숫자가 10보다 작을때만 계속 정수를 입력받는다.
		// 10보다 큰 수를 입력하면 "종료되었습니다"를 출력

		Scanner sc = new Scanner(System.in); // 반복 필요 X
		while(true) {
			System.out.println("정수 입력 :");
			int num1 = sc.nextInt();

			if(num1 > 10) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}

}
