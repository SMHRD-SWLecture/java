package Puppy;

public class Puppy {
    /*
     * 강아지를 만드는 설계도(템플릿)
     * 1. 데이터 값이 들어가는 필드
     * - 이름(name), 털 색깔(color), 나이(age)
     * 
     * 2. 메서드
     * - 잠을 잔다, 밥을 먹는다, 걷는다
    */

    String name;
    String color;
    int age;

    public void sleep() {
        System.out.println("잠을 잔다");
    }
    public void eat() {
        System.out.println("밥을 먹는다");
    }
    public void walk() {
        System.out.println("걷는다");
    }
}
