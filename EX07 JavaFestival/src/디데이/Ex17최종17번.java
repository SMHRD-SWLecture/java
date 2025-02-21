package 디데이;

import java.util.Scanner;

public class Ex17최종17번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];

		for(int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번째 정수 입력 >> ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("3의 배수 : ");
		for(int i = 0; i < 10; i++) {
			if(arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		

	}

}
