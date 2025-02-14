package ex02for문;

import java.util.Scanner;

public class Ex07구구단레벨업 {

	public static void main(String[] args) {
		int dan = 0;
		int num = 0; // 출력할 구구단 개수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		dan = sc.nextInt();
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
	
	}

}
