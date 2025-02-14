package ex03switch문;

import java.util.Scanner;

public class Ex02Switch문실습 {

	public static void main(String[] args) {
		// java 14버전 이후부터 가능한 문법
		Scanner sc = new Scanner(System.in);
		System.out.print("동물 이름을 입력하세오 -> ");
		// next : 공백(스페이지)이 생기면 입력 중단 -> 단어 1개
		// nextLine : 엔터 기준으로 입력 중단 -> 단어 1개 이상, 문장
		String name = sc.nextLine();

		switch (name) {
		case "ant" -> System.out.println("개미");
		case "bee" -> System.out.println("벌");
		case "cat" -> System.out.println("고양이");
		}


	}

}
