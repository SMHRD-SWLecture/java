package Season3;

public class Ex11보너스6번 {

	public static void main(String[] args) {
		int base = 3;
		int n = 4;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
	}

	public static int powerN(int base, int n) {
		int result = 1;
		for(int i = 1; i < n + 1; i++) {
			result *= base;
		}
		return result;
		
	}

}
