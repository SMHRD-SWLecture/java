package 디데이;

import java.util.Scanner;

public class Ex14최종14번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N입력 : ");
		int N = sc.nextInt();
		
		int[][] matrix = new int[5][5];
		
		int value = 1;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				matrix[i][j] = value++;
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
