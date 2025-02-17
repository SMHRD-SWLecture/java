package 일차원배열;

import java.util.Random;

public class Ex03배열실습 {

	public static void main(String[] args) {
		Random rd = new Random();

		int arr[] = new int[5];
		int cnt = 0; // 홀수 개수 저장

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;
		}

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 != 0) {
				cnt++;
			}
		}

		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println(" ");
		System.out.println(cnt);


	}

}
