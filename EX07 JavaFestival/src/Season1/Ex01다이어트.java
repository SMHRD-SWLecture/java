package Season1;

import java.util.Scanner;

public class Ex01다이어트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("현재몸무게 : ");
		int currentWeight = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int targetWeight = sc.nextInt();

		int lossWeight = 0; // 주차별 감량 체중
		int totalLossWeight = 0; // 누적 감량 체중
		
		int i = 1;
		while(currentWeight - totalLossWeight > targetWeight) {
			System.out.print(i + "주차 감량 몸무게 : ");
			lossWeight = sc.nextInt();
			totalLossWeight += lossWeight;
			i++;
		}
		System.out.print((currentWeight - totalLossWeight) + "kg 달성!! 축하합니다!");
	}
}
