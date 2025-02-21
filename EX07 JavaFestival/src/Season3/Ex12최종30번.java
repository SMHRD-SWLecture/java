package Season3;

import java.util.Scanner;

public class Ex12최종30번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력 >> ");
		String input = sc.nextLine().toLowerCase().replace(" ", "");

		// 1. 알파벳 빈도수를 저장할 수 있는 정수형 24칸짜리 배열 result 생성
		int result[] = new int[26];

		for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') result[c - 'a']++; // 알파벳만 처리
        }

		// 결과값 출력
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c + " : " + result[c - 'a']);
        }
	}

}
