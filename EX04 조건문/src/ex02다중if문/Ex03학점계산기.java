package ex02다중if문;

import java.util.Scanner;

public class Ex03학점계산기 {

	public static void main(String[] args) {
		// 정수형 변수 totalScore(전체 점수)를 선언하고 값을 입력 받는다.
		// totalScore가 90점 이상 -> A 학점
		// 80점 이상 90점 미만 -> B학점
		// 70점 이상 80점 미만 -> C학점
		// 60점 이상 70점 미만 -> D학점

		System.out.print("전체 점수를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int totalScore = sc.nextInt();

		if(totalScore >= 90) {
			System.out.println("A학점");
		}
		else if(totalScore >= 80) {
			System.out.println("B학점");
		}
		else if(totalScore >= 70) {
			System.out.println("C학점");
		}
		else {
			System.out.println("D학점");
		}
	}

}
