package 일차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05점수계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];

		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			score[i] = sc.nextInt();
		}

		System.out.print("입력된 점수 : ");
		
		// 배열의 값을 []로 묶어서 출력
		System.out.println(Arrays.toString(score));

		int max = score[0];
		int min = score[0];

		for(int k=0; k < score.length; k++) {
			if(score[k] > max) {
				max = score[k];
			}
			if(score[k] < min) {
				min = score[k];
			}
		}

		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);

		for(int l=0; l < score.length; l++) {
			sum += score[l];
		}

		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (sum / score.length));

	}

}
