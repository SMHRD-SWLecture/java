package Season3;

import java.util.Scanner;

public class Ex04대시숫자문제25번 {
	public static final int COUNT[] = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 자리 0을 제외한 숫자를 입력해주세요 >> ");
		String number = sc.next();

		int totalDash = countDash(number); // Method 호출하여 대시 개수 계산

		System.out.println("대시('-')의 총합 >> " + totalDash);
	}

	// 숫자 문자열의 대시 개수를 계산하는 Method
	public static int countDash(String number) {
		int total = 0;
		for(char digit : number.toCharArray()) {
			total += COUNT[digit - '0'];
		}
		return total;
	}

}
