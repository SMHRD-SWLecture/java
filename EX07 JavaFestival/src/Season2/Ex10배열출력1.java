package Season2;

import java.util.Scanner;

public class Ex10배열출력1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 N을 입력하세요 : ");
		int N = sc.nextInt();

		int matrix[][] = new int[N][N];

		// 값 채우기
		int num = 1;

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				matrix[j][i] = num++;
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
