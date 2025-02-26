package 상속실습;

public class Main {

	public static void main(String[] args) {
		Phone p = new Phone();
		SmartPhone sp = new SmartPhone();

		p.call();
		p.send();

		sp.call();
		sp.send();
		sp.wifi();
	}

}
