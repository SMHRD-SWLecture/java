package Season3;

import java.util.Scanner;

public class Ex08최종16번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		String num = sc.next();

		int sum = 0;
		for(char digit : num.toCharArray()) {
			sum += digit - '0'; // 문자 -> 숫자로 변환하여 합산
		}

		System.out.println("합은 " + sum + "입니다.");
	}

}
