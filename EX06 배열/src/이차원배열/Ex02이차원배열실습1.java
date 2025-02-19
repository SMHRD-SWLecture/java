package 이차원배열;

public class Ex02이차원배열실습1 {

	public static void main(String[] args) {
		int numbers[][] = new int[3][3];
		int num = 0;

		for(int i = 0; i  < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				numbers[i][j] = num++;
			}
		}

		// 이차원 배열의 값을 출력
		for(int j = 0; j < 3; j++) {
			for(int k = 0; k < 3; k++) {
				System.out.print(numbers[j][k]);
			}
			System.out.println();
		}
	}

}
