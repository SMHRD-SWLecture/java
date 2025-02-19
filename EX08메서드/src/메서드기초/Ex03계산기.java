package 메서드기초;

import java.util.Scanner;

public class Ex03계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();

		char op = '-';
		System.out.println(cal(num1, num2, op));
	}

	public static int cal(int num1, int num2, char op) {
		switch(op) {
			case '+' :
				return num1 + num2;
			case '-' :
				return (num1 >= num2) ? num1 - num2 : num2 - num1;
			case '*' :
				return num1 * num2;
			case '/' :
				return num1 / num2;
			default:
				return 0;
		}
	}

}
