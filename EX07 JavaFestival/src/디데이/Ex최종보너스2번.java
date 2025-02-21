package 디데이;

public class Ex최종보너스2번 {

	public static void main(String[] args) {
		System.out.println(getMiddle("power"));
	}

	public static String getMiddle(String word) {
		String arr[] = word.split("");

		String result = null;

		// 문자열의 글자수가 짝수인지 홀수인지 판단
		if(arr.length % 2 == 0) {
			result = arr[arr.length / 2 - 1] + arr[arr.length / 2];
		}
		else {
			result = arr[arr.length / 2];

		}
		return result;
	}

}
