package Season2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05오름차순정렬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numbers[] = new int[5];

		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 수 입력 : ");
			numbers[i] = sc.nextInt();
		}

		// 오름차순 정렬
		Arrays.sort(numbers);

		// 정렬된 결과 출력
		System.out.println("정렬 후");
		for(int i = 0; i < 5; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
