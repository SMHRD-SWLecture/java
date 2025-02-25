package Pokemon;

public class Pokemon객체배열 {

	public static void main(String[] args) {

		// 포켓몬 객체 2개 생성
		포켓몬 boruto = new 포켓몬("보루토", "우즈마키", 500, 100000, "나선환, 비뢰신의 술");
		포켓몬 sarada = new 포켓몬("사라다", "우치하", 500, 100000, "화둔, 치도리");

		포켓몬[] bag = new 포켓몬[2];
		System.out.println(bag);

		bag[0] = boruto; // index 0 -> boruto 객체 저장
		bag[1] = sarada; // index 1 -> sarada 객체 저장

		bag[0].setName("보루토");
		bag[1].setName("사라다");

		// 객체의 필드값에 접근하는 방법과 동일
		System.out.println(bag[0].getName());
		System.out.println(bag[1].getName());

		// 배열 + 반복문!
		for(int i = 0; i < bag.length; i++) {
			System.out.println(bag[i].getName() + " " + bag[i].getType() + " " + bag[i].getHp() + " " + bag[i].getAttack() + " " + bag[i].getSkill());
		}

		System.out.println("===== for-each문을 이용하여 출력 =====");
		// 객체배열 bag에서 반복문을 실행 -> 포켓몬 자료형의 변수 p를 이용해서 실행
		// 객체배열 bag에는 객체 즉 여기서는 포켓몬(내가 만든 자료형)이 들어감
		for(포켓몬 p : bag) {
			System.out.println(p.getName() + "\t" + p.getType() + "\t" + p.getHp() + "\t" + p.getAttack() + "\t" + p.getSkill());
		}
	}

}
