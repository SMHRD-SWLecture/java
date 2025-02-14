package ex01while문;

public class Ex01while문기초 {

	public static void main(String[] args) {
		// 반복문 : 어떤 조건에 만족할때까지 또는 특정 횟수만큼 실행 문장을 반복하는 구조!
		// while문, for문

		// 1) while문 : 반복 횟수가 정확하게 정해져 있지 않은 경우에 사용
		/* while(조건식) {
		 * 		조건식의 결과가 true인 경우, 실행할 문장(code)
		 * 		실행문장;
		 * 	}
		 */

		 // Hello Wordl! 5번 출력하는 코드를 작성해보자!
		 // 한줄코드 복사 : option + space + 방향기 [맥북용]
		 int num = 0;
		 while(num < 5) {
			System.out.println("Hello World!");
			// 반복을 해서 출력을 할때마다 반복횟수를 저장하는 num을 1씩 증가를 해줘야 한다.
			
			// num = num + 1;
			num++;
			
		 }

	}

}
