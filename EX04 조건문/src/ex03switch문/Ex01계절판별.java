package ex03switch문;

import java.util.Scanner;

public class Ex01계절판별 {

	public static void main(String[] args) {
		// switch문 : 변수의 값에 따라서 문장을 실행하는 제어문
		/* 여러 줄 주석 가능
		 * switch(변수) {
		 * case 값1 :
		 * 		실행 문장;
		 * 		break; -> 조건식을 빠져나갈 수 있다!
		 * default :
		 * 		// if문에서의 else와 같은 역할!
		 * 		실행 문장;
		 * 		break;
		 * }
		 */
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("월을 입력 : ");
		 int month = sc.nextInt();

		switch(month) {
		case 1,2,12:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3,4,5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6,7,8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9,10,11:
			System.out.println(month + "월은 가을입니다.");
			break;
		default:
			System.out.println("잘못 입력했습니다.");
			break;
		
		// case 2:
		// 	System.out.println(month + "월은 겨울입니다.");
		// 	break;
		// case 4:
		// 	System.out.println(month + "월은 봄입니다.");
		// 	break;
		// case 5:
		// 	System.out.println(month + "월은 봄입니다.");
		// 	break;
		// case 7:
		// 	System.out.println(month + "월은 여름입니다.");
		// 	break;
		// case 8:
		// 	System.out.println(month + "월은 여름입니다.");
		// 	break;
		// case 10:
		// 	System.out.println(month + "월은 가을입니다.");
		// 	break;
		// case 11:
		// 	System.out.println(month + "월은 가을입니다.");
		// 	break;
		// case 12:
		// 	System.out.println(month + "월은 겨울입니다.");
		// 	break;
		}
	}

}
