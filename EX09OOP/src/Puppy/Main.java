package Puppy;

public class Main {

	public static void main(String[] args) {
		// 설계도를 바탕으로 객체 p1 생성
		// 객체 생성 후, 값(데이터, 필드) 입력

		Puppy p1 = new Puppy();

		p1.name = "우유";
		p1.color = "흰색";
		p1.age = 2;

		System.out.println(p1.name);
		System.out.println(p1.color);
		System.out.println(p1.age);
		p1.sleep();
		p1.eat();
		System.out.println(p1);

		Puppy p2 = new Puppy();
		System.out.println(p2);
		System.out.println(p2.name);
		System.out.println(p2.age);
	}

}
