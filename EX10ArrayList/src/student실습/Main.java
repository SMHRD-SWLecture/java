package student실습;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		// 데이터 추가
		list.add("선영표");
		list.add("김자영");
		list.add("김운비");

		// 특정 위치에 데이터 추가
		// 기존 데이터가 삭제되는 것이 아니라 뒤 index 번호로 밀려남
		list.add(1, "서보경");

		// 데이터 삭제
		list.remove(0);

		// 배열의 크기
		System.out.println(list.size());

		// 모든 데이터 삭제
		list.clear();
		System.out.println("clear 메서드 사용 후, list의 크기 : " + list.size());

		// 데이터 가져오기
		// System.out.println(list.get(0));
		// System.out.println(list.get(1));
		// System.out.println(list.get(2));
	}



}
