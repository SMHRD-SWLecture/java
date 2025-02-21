package 디데이;

import java.util.Scanner;

public class Ex12최종12번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 N 입력 : ");
		int N = sc.nextInt();

		int arr[][] = new int[N][N];

		int value = 1;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				arr[i][j] = value++;
			}
		}

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}

	}

}
