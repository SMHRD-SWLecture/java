package OOP기초;

public class Main {

	public static void main(String[] args) {
		/*
		 * 객체 지향 프로그래밍(Object Oriented Programming, OOP)
		 * : 프로그램을 객체라는 기본 단위로 나누고 이들의 상호작용을 서술하는 방식
		 * 객체 : 나만의 자료형(내가 만드는 새로운 자료형)
		 * 
		 * 클래스 2개
		 * - 객체를 만드는 설계도(클래스)
		 * - 객체를 사용하는 공간(메인 클래스)
		 * 
		 * 설계도를 이용하여 객체 만드는 법
		 * 설계도의 이름 객체명 = new 설계도의 이름();
		*/
		Person p1 = new Person();
		System.out.println(p1);

		p1.address = "광주광역시 남구 송하동";
		p1.name = "서보경";
		p1.age = 20;
		System.out.println(p1.address);
		System.out.println(p1.name);
		System.out.println(p1.age);
	}

}
