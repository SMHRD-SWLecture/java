package Season1;

import java.util.Scanner;

public class Ex08AB숫자입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		int b = 1;

		while(true) {
			System.out.print("A 입력 >> ");
			a = sc.nextInt();
			System.out.print("B 입력 >> ");
			b = sc.nextInt();

			if(a == 0 && b == 0) {
				break;
			}

			System.out.println("결과 >> " + (a - b));
		}
	}

}
