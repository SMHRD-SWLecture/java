package 월급계산프로그램;

public class Main {
	
	public static void main(String[] args) {
		// 객체 생성, 실행, 확인하는 공간

		TempEmployee temp = new TempEmployee("SMHRD001", "박문수", 3000);
		RegularEmployee regular = new RegularEmployee("SMHRD002", "홍길동", 4000, 400);
		PartTimeEmployee partTime = new PartTimeEmployee("SMHRD003", "장영민", 100, 10);
		
		System.out.println(temp.print());
		System.out.println(temp.getMoneyPay());
		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay());
		System.out.println(partTime.print());
		System.out.println(partTime.getMoneyPay());
	}

}
