package ex05추가문제;

import java.util.Scanner;

public class Ex01시분초구하기 {

	public static void main(String[] args) {
		// 초를 입력 받아서 시,분,초 형태로 출력하세요.
		// 1. 입력 받는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		// 2. 문구 출력
		System.out.print("초 입력 : ");
		// 3. 입력 받아서 변수 totalSecond에 저장
		int totalSecond = sc.nextInt();

		// 3723초를 직접 손으로 작성해서 나눠보기
		// 4. 시, 분, 초 나누기
		// 시간 : totalSecond / 3600
		// 분 : totalSecond /60 %60
		// 초 : totalSecond % 60
	}

}
