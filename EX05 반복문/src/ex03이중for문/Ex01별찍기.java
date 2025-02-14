package ex03이중for문;

public class Ex01별찍기 {

	public static void main(String[] args) {
		// for(int i=1; i<6; i++) {
		// 	System.out.print("*");
		// }

		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

// Question
// 1. Java의 다른 기타 파일들은 꼭 필요한 건지?
// 2. 필요없다면 애초에 안 만들어지게 하거나, 삭제할 수 있는 방법은 없는지
// 3. Github에 올릴 때 기타 파일들을 ignore 하면 나중에 pull 해서 사용할 때 문제 생기는거 아닌가?