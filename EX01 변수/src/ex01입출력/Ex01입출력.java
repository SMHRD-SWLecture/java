package ex01입출력;

public class Ex01입출력 {
	
	public static void main(String[] args) {
		// 글씨 키우기 : command + shift + 더하기
		// 초록색 글씨 : 주석 (코드 실행에 영향을 끼치지 않는 일종의 메모장)
		
		System.out.println("출력하고 싶은 내용 작성");
		// println : 다음 실행 문장부터 개행이 됨
		
		System.out.print("Hello World 123");
		// command + S : 저장하는 단축기
		// 언제나 코드를 작성하고 나서 "저장 필수" -> 실행 버튼 클릭
		// 출력문 단축기 : syso + ctrl + space + enter!
		
		System.out.println("안녕하세요~ 반갑습니다!");
		
		// 변수(variable)
		// : 데이터를 담아둘 수 있는 공간(메모리 공간, 저장 공간)
		// compiler : 프로그래밍 언어 -> 기계어로 변환
		// box라는 변수(저장공간)에 3이라는 정수를 저장!
		// int : 정수 저장 시 사용
		
		int box; // 변수 선언 시 사용
		box = 3; // 변수에 값을 저장(-> 값을 할당)
		// = : 대입 연산자 (값을 저장하는 역할)
		System.out.println(box); // 변수 안에 있는 값 출력!
		
		// int box = 3; -> 변수 이름 중복 불가!
		// 정수형 box2라는 변수(저장 공간)에 3이라는 정수를 넣음(저장)
		int box2 = 3;
		
		// final + 변수 -> 상수(값이 변경될 수 없음)
		final int BOX3 = 5;
		box2 = 6;
		System.out.println(box2); // 변수에 값을 재할당(데이터를 저장) 가능
		// BOX3 = 2;
		// 할당 : assign
		
		
		
	}
	
}
