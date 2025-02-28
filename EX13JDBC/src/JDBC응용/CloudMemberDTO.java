package JDBC응용;

public class CloudMemberDTO {
	// Model -> 프로그램 내에서 필요한 데이터를 표현한 객체
    // * 테이블 단위로 

    // 1. 필드
    private String id;
    private String pw;
    private String name;
    private int age;
    private int score;
    
    // 2. 메소드
    public CloudMemberDTO() {

    }
    public CloudMemberDTO(String id, String pw, String name, int age, int score) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.age = age;
        this.score = score;
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
    

}
