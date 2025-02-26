package 닌텐도게임기;

public class Main {
	
	// 닌텐도 게임기
	public static void main(String[] args) {

		AnimalForest a = new AnimalForest();
		Zelda z = new Zelda();
		Mario m = new Mario();

		start(a);
		start(z);
		start(m);
	}

	// UpCasting을 통한 방법
	// Gamechip gc = new AnimalForest();
	private static void start(GameChip gc) {
		gc.play();
	}
	
	// 오버로딩을 통한 방법
	// private static void start(Mario m) {
	// 	m.play();
	// }
	// private static void start(AnimalForest a) {
	// 	a.play();
	// }

}
