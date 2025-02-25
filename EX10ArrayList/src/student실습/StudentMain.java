package student실습;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		// ArrayList<자료형> 변수명 = new ArrayList<자료형>();

		// 정수형 배열 만드는 법
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Student 자료형(내가 만든 자료형, 레퍼런스 자료형)으로 ArrayList
		ArrayList<student> sList = new ArrayList<student>();

		// 데이터 추가
		// - 객체 생성
		student s1 = new student("서보경", 20);
		// - 생성한 객체를 ArrayList의 데이터로 추가!
		sList.add(s1);

		sList.add(new student("선영표", 30));
		System.out.println(sList.get(0));
		System.out.println(sList.get(0).getName() + sList.get(0).getAge());
		System.out.println(sList.get(1).getName() + sList.get(1).getAge());

		// 짝궁 이름, 나이를 넣은 객체를 sList에 넣어서 출력
		sList.add(new student("기융", 30));
		System.out.println(sList.get(2).getName() + sList.get(2).getAge());
	}

}
