package Season1;

import java.util.Scanner;

public class Ex02알바시급계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");

		int workTime = sc.nextInt(); // 근무 시간
		int overTime = workTime - 8; // 초과 근무 시간
		double money = 0; // 시급

		if(workTime > 8) {
			money = 8 * 5000 + overTime * (5000 * 1.5);
		} 
		else {
			money = workTime * 5000;
		}
		System.out.print("총 임금은" + money + "원 입니다.");
	}

}
