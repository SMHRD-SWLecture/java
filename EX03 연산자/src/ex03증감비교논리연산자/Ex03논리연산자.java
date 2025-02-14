package ex03증감비교논리연산자;

public class Ex03논리연산자 {

	public static void main(String[] args) {
		// 논리연산자 : 논리 결과를 판단할 때 사용
		System.out.println(!true);
		
		// and 연산자 : &&
		// or 연산자 : ||
		System.out.println(true);
		System.out.println("and 연산자");
		// 연산자를 기준으로 왼쪽, 오른쪽 모두 true에만 결과값이 true가 나온
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);

		System.out.println("or 연산자");
		// 연산자를 기준으로 왼쪽, 오른쪽 한 곳이라도 true가 있으면 true가 나온다
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println(false || false);
	}

}
