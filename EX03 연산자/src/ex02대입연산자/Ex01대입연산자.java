package ex02대입연산자;

public class Ex01대입연산자 {

	public static void main(String[] args) {
		// 대입연산자 : = (equal) -> 연산의 결과를 담을 때 사용
		int a = 3;
		int b = 1 + a;
		
		// 실생활에서의 = : 같다

		// 복합 대입연산자
		// += : 변수에 데이터를 할당하면서 동시에 산술 연산까지 진행
		a = a + 3;
		a += 3;
		System.out.println(a); // 9

		int num1 = 10;
		num1 -= 2+3;
		// num1 = num1 - (2+3)
		System.out.print(num1);
		num1 -= 2+3*4;
		// num1 = num1 - 2+3*4
		System.out.print(num1);

	}

}
