package ex04삼항연산자;

public class Ex01삼항연산자 {

	public static void main(String[] args) {
		// 삼항연산자(간단한 제어처리)
		// (조건) ? (실행문 1) : (실행문2)
		// 1. 조건이 참인 경우 -> 실행문1 실행
		// 2. 조건이 거짓인 경우 -> 실행문2 실행
		
		boolean isRainy = false;
		System.out.println(isRainy ? "비가 온다" : "비가 오지 않는다");
	}
}
