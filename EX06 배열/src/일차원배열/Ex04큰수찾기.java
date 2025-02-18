package 일차원배열;

import java.util.Random;

public class Ex04큰수찾기 {

	public static void main(String[] args) {
		
		// 0. 도구 가져오기 -> Random
		Random rd = new Random();

		// 1. 배열 생성
		int array[] = new int[5];

		// 2. 배열에 랜덤한 값으로 초기화
		// 랜덤한 수의 범위 : 1 ~ 10
		for(int i=0; i < array.length; i++) {
			array[i] = rd.nextInt(10) + 1;
		}

		// 3. 배열에 저장되어 있는 데이터 중에서 가장 큰 값 찾기!
		// 각 index에 담긴 데이터들을 서로 비교
		int max = array[0];

		for(int j=0; j < array.length; j++) {
			if(array[j] > max) {
				max = array[j];
			}
		}

		System.out.print("배열 안에 들어있는 값 : [");
		for(int k=0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
		System.out.println("]");
		System.out.println("가장 큰 값은 " + max + "입니다.");
	}

}
