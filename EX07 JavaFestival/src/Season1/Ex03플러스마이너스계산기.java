package Season1;

public class Ex03플러스마이너스계산기 {

	public static void main(String[] args) {
		int sum = 0;

		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				sum -= i;
				System.out.print("-" + i);
			}
			else {
				sum += i;
				System.out.print("+" + i);
			}
		}
		System.out.println("결과 : " + sum);
	}

}
