package ex01기본데이터타입;

import java.util.Scanner;

public class Ex02자료형실습 {

	public static void main(String[] args) {
		// 입력 실습2 (Scanner)
		// 1. 입력 받을 수 있게 해주는 도구(Scanner) 가져오기(import)
		Scanner sc = new Scanner(System.in);
		
		// 단축기 : 코드 한줄 이동하는 단축기 : option + 방향기(상하좌우)
		
		// 2. 도구를 가져와서 사용하기 -> 입력 받는 작업 + 입력 받은 데이터를 변수에 저장
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();
		System.out.println("첫 번째 입력 받은 숫자 : "+num);
		
		// 입력문2(출력문구 오른쪽에서 데이터 입력 받게 하는 작업)
		System.out.print("두 번째 숫자를 입력해주세요");
		// System.out.print : 해당 코드를 실행하고 나서 커서가 그 행에 머문다
		// System.out.println : 해당 코드를 실행하고 나서 개행된다(커서가 다음 행으로 이동)
		int num2 = sc.nextInt();
		System.out.println("두 번째 입력 받은 숫자 : "+num2);
	}

}
