package 메서드기초;

public class Ex02메서드예제 {

	public static void main(String[] args) {
		add(3, 5);
		sub(3, 5);
		mul(3, 5);
		div(3, 5);
	}

	public static void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}

	public static void sub(int num1, int num2) {
		int result = num1 - num2;
		System.out.println(result);
	}

	public static void mul(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(result);
	}

	public static void div(int num1, int num2) {
		int result = num1 / num2;
		System.out.println(result);
	}
}
