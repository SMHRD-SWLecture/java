package 디데이;

import java.util.Random;

public class Ex18최종18번 {

	public static void main(String[] args) {
		Random rd = new Random();
		int array[] = new int[6];

		for(int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(10) + 1;
			for(int j=0; j<i; j++) {
				if(array[i] == array[j]) {
					i--;
				}
			}
		}

		for(int i = 0; i < array.length; i++) {
			System.out.print("행운의 숫자 : ");
			System.out.print(array[i] + "\n");

		}
	}

}
