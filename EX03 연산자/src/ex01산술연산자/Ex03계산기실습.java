package ex01산술연산자;

import java.util.Scanner;

public class Ex03계산기실습 {

	public static void main(String[] args) {
		System.out.print("연산할 정수 2개를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("더하기 : " + (num1+num2));
		System.out.println("뺄셈 : " + (num1-num2));
		System.out.println("곱 : " + (num1*num2));
		System.out.println("몫 : " + (num1/num2));
		System.out.println("나머지 : " + (num1%num2));

	}

}
