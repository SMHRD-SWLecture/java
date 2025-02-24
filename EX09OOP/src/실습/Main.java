package 실습;

public class Main {

	public static void main(String[] args) {
		Car Maserati = new Car();
		Maserati.type = "스포츠카";
		Maserati.brand = "maserati";
		Maserati.color = "blue";
		Maserati.age = 2;

		Car Tesla = new Car("세단", "Tesla", "red", 1);

		System.out.println(Maserati.brand);
		System.out.println(Maserati.type);
		System.out.println(Tesla.brand);
		System.out.println(Tesla.type);
	}
}
