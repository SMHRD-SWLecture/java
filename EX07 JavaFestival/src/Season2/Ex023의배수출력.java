package Season2;

import java.util.Scanner;

public class Ex023의배수출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numbers[] = new int[10];

		// 3의 배수를 저장할 문자열
		String multiples = "";

		for(int i = 0; i < 10; i++) {
			System.out.print((i+1) + "번째 정수 입력 >> ");
			numbers[i] = sc.nextInt();
		}

		System.out.print("3의 배수 : ");
		for(int i = 0; i < 10; i++) {
			if(numbers[i] % 3 == 0) {
				System.out.print(numbers[i] + " ");
			}
		}
	}

}
