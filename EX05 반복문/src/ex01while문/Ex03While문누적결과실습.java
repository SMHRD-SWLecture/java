package ex01while문;

import java.util.Scanner;

public class Ex03While문누적결과실습 {

	public static void main(String[] args) {
		/* 
		 *  숫자를 입력받아서 변수 sum에 누적하는 프로그램
		 *  -1이 입력되면 프로그램 종료
		 */

		 Scanner sc = new Scanner(System.in);
		 int sum = 0;

		 while(true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			sum += num;
			System.out.println("누적 결과 : " + sum);

			if(num == -1) {
				break;
			}
		 }

	}

}
