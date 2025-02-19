package Season2;

import java.util.Scanner;

public class Ex07작은수만출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("N 입력 >> ");
		int N = sc.nextInt();
		System.out.print("X 입력 >> ");
		int X = sc.nextInt();

		int numbers[] = new int[N];

		for(int i = 0; i < N; i++) {
			System.out.print((i + 1) + "번째 정수 입력 >> ");
			numbers[i] = sc.nextInt();
		}

		System.out.print("결과 >> ");
		for(int i = 0; i < N; i++) {
			if(numbers[i] < X) {
				System.out.print(numbers[i] + " ");
			}
		}
	}

}
