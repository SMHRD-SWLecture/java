package ex01입출력;

import java.util.Scanner; 
// 도구를 가져올 때는 반드시 어디서 가져오는지 import 구문 작성!

public class Ex02입출력실습2 {

	public static void main(String[] args) {
		// 글씨 크기 조정 : command shift + 
		// 코드 작성하는 공간!! 중괄호 밖에 작성하면 실행 안 됨!
		
		// 변수를 선언/할당하는 실습
		// 1) 정수형 변수 minute를 선언하고 60이라는 데이터를 할당해보세요!
		int minute = 60;
		
		// 2) 출력 -> 하단의 console창에 나오게 하는 작업
		System.out.println(minute);
		
		// 3) 변수명 작성 규칙
		// 1. 숫자로 시작 불가
		// syntax error : 문법 오류(구문 오류)
		// 2. 키워드(예약어) 사용 불가 : package, final, int 등
		// 3. 대소문자 구분
		// 4. 특수문자 : _와 $만 사용 가능
		
		// 4) java 개발자에게 권장되는 규칙(코딩 컨벤션)
		// 1. 변수 시작은 소문자로 시작!
		// 2. 2개 이상의 단어가 합쳐진 경우 -> 두 번째 글자의 첫 글자는 대문자! [camelCase(카멜식 기법)]
		
		// 입력 실습
		// console창에서 출력만 하는게 아니라 입력을 받는 기능
		// 입력을 받을 수 있는 도구 가져오기! (import 필수!) -> 맥에서는 .찍으면 뜸
		
		// Scanner라는 도구를 가져와서 사용하는 한줄 공식!
		Scanner sc = new Scanner(System.in); // 도구를 가져오는 공식
		
		// 문자열의 자료형 : String
		// 문자열 변수명 = 도구(sc)를 이용해서 입력 받는 구문
		String name = sc.next();
		System.out.println(name);
	}

}
