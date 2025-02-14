package ex01while문;

import java.util.Scanner;

public class Ex05다이어트관리프로그램 {

	public static void main(String[] args) {
		int currentWeight = 0;
		int targetWeight = 0;
		int week = 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("현재 체중 : ");
		currentWeight = sc.nextInt();
		System.out.print("목표 체중 : ");
		targetWeight = sc.nextInt();

		while(true) {
			System.out.print(week + "주차 감량 몸무게 : ");
			int weightLoss = sc.nextInt();
			currentWeight -= weightLoss;
			week++;

			if(currentWeight <= targetWeight) {
				System.out.println(currentWeight + "kg달성!! 축하합니다!!");
				break;
			}
		}
	}

}
