package 학생정보관리프로그램;

public class StudentMain {

	public static void main(String[] args) {
		Student st1 = new Student("선영표", "20250225", 20);
		Student st2 = new Student("김운비", "20250224", 20);

		st2.setJavaScore(100);
		st1.setDbScore(100);

		System.out.println("=== 학생 정보 ===");
		System.out.println("이름 \t 학번 \t 나이 \t 자바점수 \t DB점수 \t");
		System.out.print(st1.getName() + "\t");
		System.out.print(st1.getNumber() + "\t");
		System.out.print(st1.getAge() + "\t");
		System.out.print(st1.getJavaScore() + "\t");
		System.out.print(st1.getDbScore() + "\t");

		System.out.print(st2.getName() + "\t");
		System.out.print(st2.getNumber() + "\t");
		System.out.print(st2.getAge() + "\t");
		System.out.print(st2.getJavaScore() + "\t");
		System.out.print(st2.getDbScore() + "\t");
	}

}
