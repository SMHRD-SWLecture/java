package ex02다중if문;

import java.util.Scanner;

public class Ex02홀짝판별 {

	public static void main(String[] args) {
		// 정수형 변수 num을 선언하고 값을 입력 받으세요.
		// num이 짝수인 경우 -> "짝수입니다."
		// num이 홀수인 경우 -> "홀수입니다."
		// num이 0인 경우 -> "0입니다."
		
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// 0을 2로 나눴을 때 나머지가 0이므로 0인 경우를 먼저 판별
		if(num == 0){
			System.out.println("0");
		}
		else if(num % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	}

}
