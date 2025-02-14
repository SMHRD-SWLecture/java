package ex01while문;

import java.util.Random;
import java.util.Scanner;

public class Ex06플러스게임 {

	public static void main(String[] args) {
		// 랜덤으로 2개의 수를 출력하여 2개의 정수를 더한 값을 맞추는 게임
		// 랜덤 사용법
		// 랜덤한 수를 출력할 수 있는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		while(true) {
			// 랜덤한 수를 가져와서 변수에 저장!
			int num1 = rd.nextInt(10); // 5=> 0~4, 10 => 0~9
			int num2 = rd.nextInt(10); //2번째 랜덤 숫자
			int sum = num1 + num2; // 정답을 저장할 변수

			System.out.print(num1 + "+" + num2 + "=");
			int ans = sc.nextInt(); // 사용자가 정답을 입력

			if(ans == sum) {
				System.out.println("성공성공");
			}
			else {
				System.out.println("실패 ㅠ_ㅠ");
			}
		}


	}

}
