package ex01산술연산자;

public class Ex02나누기연산자실습 {

	public static void main(String[] args) {
		// 변수 num 값 중에서 백의 자리 미만을 버리는 코드
		// : 만약 변수 num의 값이 456이라면 400이 된다
		
		int num = 456;
		System.out.println(num/100 * 100);
		System.out.println(num - num%100);
		System.out.println(num/100 + "00");
		
		System.out.println(3+"4"+5);
		System.out.println(3+4+"5");
		System.out.println("3"+4+5);
		// 문자 + 숫자 -> 문자 문자!
		// * 일반적인 숫자 연산 결과값이 나오지 않음!
		
		
	}

}
