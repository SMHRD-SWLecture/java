package Season3;

import java.util.Scanner;

public class Ex10최종20번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		// 10진수 num을 2진수 문자열로 변환
		System.out.println(Integer.toBinaryString(num));
	}

}
