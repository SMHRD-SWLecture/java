package Season2;

public class Ex06배열90도회전 {

	public static void main(String[] args) {
		int matrix[][] = new int[5][5];
		int rotated[][] = new int[5][5];

		// 배열에 값 넣기
		int value = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				matrix[i][j] = value++;
			}
		}

		// 왼쪽으로 90도 회전
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				rotated[4 - j][i] = matrix[i][j];
			}
		}

		// 원본 배열 출력
		System.out.println("원본");
		printMatrix(matrix);

		// 회전된 배열 출력
		System.out.println("\n90도 회전");
		printMatrix(rotated);
	}

	public static void printMatrix(int matrix[][]) {
		for(int row[] : matrix) {
			for(int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
