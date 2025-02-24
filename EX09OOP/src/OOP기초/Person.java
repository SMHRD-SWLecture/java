package OOP기초;

public class Person {
    // Person 클래스 : 설계도
    // -> Person이라는 객체를 만드는 설계도

    // 1. Field(속성) -> Data
    // 사람의 공통적인 특성만을 작성! -> 특정한 값 저장 X
    // 속성을 넣어줄 수 있는 공간만을 만들어줌!

    // 이름
    String name;
    // 나이
    int age;
    // 주소
    String address;

    // 2. Method(행동) -> Logic
    // 객체의 공통된 행동들 작성 -> 사람의 공통된 행동들 작성
    public void eat() {
        System.out.println("냥냥 밥을 먹는다.");
    }
    public void study() {
        System.out.println("열심히 공부를 한다.");
    }
    public void sleep() {
        System.out.println("쿨쿨 잠을 잔다.");
    }  
}
