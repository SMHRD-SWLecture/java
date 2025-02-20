package Season3;

public class Ex01가운데글자구하기 {

	public static void main(String[] args) {
		/*
		 * getMiddle Method
		 * -> 짝수인 경우(ex. test) : es 반환
		 * -> 홀수인 경우(ex. power) : w 반환
		 */

		 System.out.println(getMiddle("banana"));
	}

	public static String getMiddle(String word) {
		// split() : 매개변수에 있는 데이터를 배열에 담아 알파벳 하나하나로 분리해줌
		// -> 문자열 자르는 역할
		String arr[] = word.split("");

		String result = null;

		// 문자열의 글자수가 짝수인지 홀수인지 판단
		if(arr.length % 2 == 0) {
			// 글자의 개수 -> 짝수
			// test -> arr[1], arr[2]
			result = arr[arr.length / 2 - 1] + arr[arr.length / 2];
		}
		else {
			result = arr[arr.length / 2];

		}
		return result;
	}

}
