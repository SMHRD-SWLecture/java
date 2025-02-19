package Season2;

import java.util.Scanner;

public class Ex09점수계산지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력받기
		System.out.println("==== 채점하기 ====");

		int score = 0; // 총 점수
		int num = 0; // 연속된 'O'의 개수

		// 채점 결과 입력
		String result = sc.nextLine();

		// 채점 로직
		for(int i = 0; i < result.length(); i++) {
			if(result.charAt(i) == 'O' || result.charAt(i) == 'o') {
				num++;
				score += num;
			}
			else {
				score = 0; // 'X'가 나오면 점수 초기화
			}
		}

		// 결과 출력
		System.out.println(score);
	}

}
