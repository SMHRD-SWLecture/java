package ex01기본데이터타입;

public class Ex05강제형변환 {

	public static void main(String[] args) {
		// 강제 형변환(명시적 형변환)
		// : 상대적으로 적은 크기의 데이터 자료형 -> 큰 크기의 데이터 자료형 변환
		// -> 데이터의 손실이 있음을 명시해줘야 한다!
		// double : 8byte, int : 4byte

		double weight = 40.56;
		int weight2 = (int)weight;
		System.out.println(weight);
		System.out.println(weight2);

	}

}
