package Season1;

import java.util.Scanner;

public class Ex09반올림 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		// 반올림 계산
		int round = (num / 10) * 10;
		if(num % 10 >=5 ) {
			round += 10;
		}
		System.out.println("반올림 수 : " + round);
	}

}
