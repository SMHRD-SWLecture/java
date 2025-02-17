package 일차원배열;

public class Ex01배열기초 {

	public static void main(String[] args) {
		// 정수형 데이터 5개를 저장할 수 있는 배열 array 생성
		int[] array = new int[5];
		System.out.println(array[0]); // Reference Variable 주소값이 나옴!

		for(int i = 0; i < array.length; i++) {
			array[i] = 4;
		}
		
		// 배열에 들어있는 데이터를 출력하는 코드 
		for (int i = 0; i < array.length; i++) {
		   System.out.print(array[i]+" ");
		}

		// 배열에서 많이 볼 수 있는 예외상황
		// ArrayIndexOutOfBoundsException 
		// : 배열의 인덱스번호가 범위를 벗어났을 때, 발생하는 예외상황

		// for (int i = 0; i < 6; i++) {
		//    System.out.print(array[i]+" ");
		// }
	}

}
