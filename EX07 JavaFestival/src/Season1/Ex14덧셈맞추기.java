package Season1;

import java.util.Random;
import java.util.Scanner;

public class Ex14덧셈맞추기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int attempts = 0; // 실패 횟수 카운트
        final int maxAttempts = 5; // 최대 실패 횟수

        while (attempts < maxAttempts) {
            // 랜덤 숫자 2개 생성 (1~10)
            int num1 = rd.nextInt(10) + 1;
            int num2 = rd.nextInt(10) + 1;
            int correctSum = num1 + num2;

            // 문제 출력
            System.out.print(num1 + " + " + num2 + " = ");
            int userAnswer = sc.nextInt(); // 사용자 입력

            // 정답 확인
            if (userAnswer == correctSum) {
                System.out.println("SUCCESS!");
            } else {
                System.out.println("Fail...");
                attempts++; // 실패 횟수 증가
            }

            // 5번 틀리면 게임 종료
            if (attempts == maxAttempts) {
                System.out.println("GAME OVER!");
                break;
            }
		}

	}

}
