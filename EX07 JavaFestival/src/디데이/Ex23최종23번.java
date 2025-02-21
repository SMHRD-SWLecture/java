package 디데이;

public class Ex23최종23번 {

	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		int[][] rotated = new int[5][5];

		int value = 1;

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				matrix[i][j] = value++;
			}
		}

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				rotated[4-j][i] = matrix[i][j];
			}
		}

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(rotated[i][j] + " ");
			}
			System.out.println();
		}


	}

}
