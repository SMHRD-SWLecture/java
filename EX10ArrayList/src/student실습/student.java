package student실습;

public class student {
    // 1. 필드
    private String name;
    private int age;

    // 2. 메서드
    // 기본생성사, 매개변수 있는 생성자
    public student() {

    }
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter / Setter Method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
    
}
