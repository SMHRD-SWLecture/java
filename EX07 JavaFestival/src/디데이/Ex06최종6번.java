package 디데이;

public class Ex06최종6번 {

	public static void main(String[] args) {

		int result = 0;

		for(int i = 1; i < 78; i++) {
			result = result +  ((77 - i + 1) * i);
		}
		System.out.println(result);
	}

}
