package ex01산술연산자;

public class Ex01연산자실습 {

	public static void main(String[] args) {
		// 연산자 : 프로그램 코드를 작성할 때, 변수나 값의 연산을 위해 사용되는 부호
		// 산술 연산자 -> + - * / %

		int num1 = 3;
		int num2 = 4;
		// 코드 한 줄 복사하는 단축기 : ctrl + alt + 방향기 [맥용은 모름...]
		System.out.println(num1 + num2); // 3+4=7
		System.out.println(num1 - num2); // 3+4=-1
		System.out.println(num1 * num2); // 3*4=12
		System.out.println(num1 / num2); // 3/4=0
		System.out.println(num1 % num2); // 3%4=3

		int num3 = 4;
		int num4 = 2;
		System.out.println(num3 + num4); // 6
		System.out.println(num3 - num4); // 2
		System.out.println(num3 * num4); // 8
		System.out.println(num3 / num4); // 2
		System.out.println(num3 % num4); // 0

		// 실수와 정수 연산
		float weight = 20.143f;
		System.out.println(weight + num4); // 22.143
		System.out.println(weight - num4); // 18.143
		System.out.println(weight * num4); // 40.386
		System.out.println(weight / num4); // 10.0715
		System.out.println(weight % num4); // 

	}

}
