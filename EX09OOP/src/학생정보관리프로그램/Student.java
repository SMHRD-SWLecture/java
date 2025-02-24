package 학생정보관리프로그램;

public class Student {
    private String name;
    private String number;
    private int age;
    private int javaScore;
    private int dbScore;

    // 이름, 학번, 나이를 매개변수로 받아서 필드에 있는 데이터를 초기화
    public Student(String name, String number, int age) {
        this.name = name;
        this.number = number;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public int getAge() {
        return age;
    }
    public int getJavaScore() {
        return javaScore;
    }
    public int getDbScore() {
        return dbScore;
    }

    /**
     * 자바점수를 수정할 수 있는 메소드
     */
    public int setJavaScore(int javaScore) {
        this.javaScore = javaScore;
        return this.javaScore;
    }
    /**
     * DB점수를 수정할 수 있는 메소드
     */
    public int setDbScore(int dbScore) {
        this.dbScore = dbScore;
        return this.dbScore;
    }
}
