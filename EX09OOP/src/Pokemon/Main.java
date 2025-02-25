package Pokemon;

public class Main {

	public static void main(String[] args) {
		// 객체 생성
		// 클래스 이름 객체 이름 = new 클래스이름()
		포켓몬 pica = new 포켓몬();

		// setter 메서드 사용 이유 : private으로 선언한 필드 접근하기 위함
		// private으로 선언한 필드는 .을 통해서 접근 불가!
		pica.setName("피카피카");
		pica.setType("피카츄");
		pica.setAttack(500);
		pica.setHp(500);
		pica.setSkill("피카츄! 전광석화");

		System.out.println(pica.getName() + " " + pica.getType() + " " + "공격력 : " + pica.getAttack() + " " + pica.getSkill());

		포켓몬 naruto = new 포켓몬("사스케", "우치하 사스케", 100000000, 100000000, "치도리, 아마테라스");
		
		System.out.println(naruto.getName() + " " + naruto.getType() + " " + "공격력 : " + naruto.getAttack() + " " + naruto.getSkill());

		
	}
}
