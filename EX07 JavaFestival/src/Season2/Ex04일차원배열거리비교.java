package Season2;

public class Ex04일차원배열거리비교 {

	public static void main(String[] args) {
		int point[] = {92, 32, 52, 9, 81, 2, 68};

		int min = Integer.MAX_VALUE;
		int index1 = -1, index2 = -1;

		for(int i = 0; i < point.length; i++) {
			for(int j = i + 1; j < point.length; j++) {
				// 두 수의 거리 계산
				int distance = Math.abs(point[i] - point[j]);

				// 더 작은 거리 발견 시 업데이트
				if(distance < min) {
					min = distance;
					index1 = i;
					index2 = j;
				}
			}
		}

		// 결과 출력
		System.out.println("result = [" + index1 + ", " + index2 + "]");
	}

}
