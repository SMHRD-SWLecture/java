package Season2;

import java.util.Random;

public class Ex01배열기초 {

	public static void main(String[] args) {
		Random rd = new Random();

		int arr[] = new int[8];

		// 2. 배열에 랜덤한 값으로 초기화
		// 랜덤한 수의 범위 : 1 ~ 100
		for(int i=0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;
		}
		
		// 배열의 모든 값 출력
		System.out.print("배열에 있는 모든 값 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// 최댓값, 최솟값 초기화
		int max = arr[0];
		int min = arr[0];

		for(int j = 0; j < arr.length; j++) {
			if(arr[j] > max) {
				max = arr[j];
			}
			if(arr[j] < min) {
				min = arr[j];
			}
		}
		
		System.out.println(" ");
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}
