package Season3;

import java.util.HashMap;
import java.util.Map;

public class Ex06최종13번 {

	public static void main(String[] args) {
		String score = "A,A,B,C,D,A,C,D,D,D,F";

		Map<Character, Integer> count = new HashMap<>();

		// 성적을 ','기준으로 나누고 개수 세기
		for(String grade : score.split(",")) {
			char g = grade.charAt(0);
			count.put(g, count.getOrDefault(g, 0) + 1);
		}

		// 결과 출력
		for(char key : count.keySet()) {
			System.out.println(key + " : " + count.get(key) + "명");
		}
	}

}
