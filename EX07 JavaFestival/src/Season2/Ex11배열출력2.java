package Season2;

import java.util.Scanner;

public class Ex11배열출력2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 N을 입력하세요 : ");
		int N = sc.nextInt();

		int arr[][] = new int[N][N];
		int num = 1;

		for(int i = 0; i < N; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < N; j++) {
					arr[i][j] = num++;
				}
			}
			else {
				for(int k = N-1; k >= 0 ; k--) {
					arr[i][k] = num++;
				}
			}
		}

		for(int l = 0; l < N; l++) {
			for(int m = 0; m < N; m++) {
				System.out.print(arr[l][m] + " ");
			}
			System.out.println();
		}
	}

}
