package 일차원배열;

import java.util.Arrays;
import java.util.Random;

public class Ex06로또추첨 {

	public static void main(String[] args) {
		Random rd = new Random();
		int array[] = new int[5];

		for(int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(10) + 1;
			for(int j=0; j<i; j++) {
				if(array[i] == array[j]) {
					/*
					array[i]의 값을 재할당
					j를 선언한 반복문을 빠져나가면 i를 선언한 반복문에서 i는 1 증가하게 된다.
					그런데 i번째 인덱스 번호의 데이터를 재할당 받기 위해서 i를 1 증가시키지 않고, 인덱스 번호를 유지하도록 해준다.
					*/
					i--;
				}
			}
		}

		System.out.println("====로또타임====");
		System.out.println("이번 주 출력번호는요...!! 두구두구두구!!!!");
		System.out.println(Arrays.toString(array));
		

	}

}
