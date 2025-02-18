package 이차원배열;

import java.util.Arrays;

public class Ex01이차원배열기초 {

	public static void main(String[] args) {
		int numbers [][] = new int[3][3];
		System.out.println(numbers[0][0]); // 실제 데이터에 접근하려면 row, column index 번호를 모두 작성해야 함

		// 1. 이차원 배열 생성하는 법
		int arr [][] = { {1, 2, 3},
						 {4, 5, 6},
						 {7, 8, 9} };

		// 1.1 이차원 배열 출력
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		// 2. 배열을 먼저 선언해주고 각각 데이터를 할당
		int num = 0;
		for(int i = 0; i  <numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				numbers[i][j] = num++;
			}

		}
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println(Arrays.toString(numbers[2]));

	}

}
