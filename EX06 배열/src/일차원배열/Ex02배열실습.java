package 일차원배열;

import java.util.Random;

public class Ex02배열실습 {

	public static void main(String[] args) {
		Random rd = new Random();

		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 array 선언
		int array[] = new int[5];

		// 2. 배열 안의 모든 데이터를 랜덤한 값으로 변경 (1~100까지의 수)
		for(int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(100)+1;
		}

		// 3. 배열 안의 모든 데이터를 출력
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
