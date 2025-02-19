package 이차원배열;

public class Ex04스네이크예제 {

	public static void main(String[] args) {
		// 행의 인덱스 번호가 홀수인 경우 : 왼쪽으로 갈 수록 1씩 증가
		// 행의 인덱스 번호가 짝수인 경우 : 오른쪽으로 갈 수록 1씩 증가

		int arr[][] = new int[5][5];
		int num = 21;

		for(int i = 0; i < 5; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < 5; j++) {
					arr[i][j] = num++;
				}
			}
			else {
				for(int k = 4; k >= 0 ; k--) {
					arr[i][k] = num++;
				}
			}
		}

		for(int l = 0; l < 5; l++) {
			for(int m = 0; m < 5; m++) {
				System.out.print(arr[l][m] + " ");
			}
			System.out.println();
		}
	}
	
}
