package 이차원배열;

public class Ex03이차원배열실습2 {

	public static void main(String[] args) {
		// 1. 이차원 배열 생성
		int arr[][] = new int[5][5];
		int num = 21;

		// 2. 배열 안의 데이터 값을 넣는 작업
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[j][i] = num++;
			}
		}
		// 2. 이차원 배열 값 출력
		for(int k = 0; k < arr.length; k++) {
			for(int l = 0; l < arr.length; l++) {
				System.out.print(arr[k][l] + " ");
			}
			System.out.println();
		}
	}

}
