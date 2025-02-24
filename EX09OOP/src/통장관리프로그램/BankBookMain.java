package 통장관리프로그램;

public class BankBookMain {

	public static void main(String[] args) {
		// 실행하는 공간

		// 1. BankBook 객체 b1 생성
		BankBook b1 = new BankBook();

		// 2. b1에 1000원 입금
		b1.deposit(1000);

		// 3. b1의 잔액을 출력
		System.out.println(b1.showMoney());

		// 4. b1에 2000원 출금
		b1.withdraw(2000);

		// 5. b1의 잔액을 출력
		System.out.println(b1.showMoney());

		// 7. b1에 3000원 출금
		b1.withdraw(3000);

		// 8. b1의 잔액을 출력
		System.out.println(b1.showMoney());

		/*
		 * 
		*/
	}

}
