package 메서드기초;

public class Ex01메서드기초 {

	public static void main(String[] args) {
		System.out.println(sum(3,7));
		System.out.println(sum(4,6));
	}
	public static int sum(int num1, int num2) {
		// sum 메서드 중괄호 안 쪽 : 실행하고 싶은 작업 코드
		int result = num1 + num2;
		
		// return 키워드 다음으로는 결과 값!
		// return 키워드 실행 이후, 바로 메서드 작업 종료!
		return result;
	}

}
