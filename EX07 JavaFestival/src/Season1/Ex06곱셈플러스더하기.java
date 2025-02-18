package Season1;

public class Ex06곱셈플러스더하기 {

	public static void main(String[] args) {
		int multiple = 0;
		int sum = 0;

		for(int i = 1; i <= 77; i++) {
			multiple = (78 - i) * i;
			sum += multiple;
		}
		System.out.println(sum);

	}

}
