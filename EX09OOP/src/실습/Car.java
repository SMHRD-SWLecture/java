package 실습;

public class Car {
    // 1. 필드
    String type;
    String brand;
    String color;
    int age;

    // 매개변수 없는 생성자 == 기본 생성자
    public Car() {

    }

    // 매개변수 있는 생성자
    public Car(String type, String brand, String color, int age) {
        // 필드의 값을 초기화 해는 코드
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.age = age;
    }

    // 2. 메서드
    public void stop() {
        System.out.println("멈춘다");
    }
    public void drive() {
        System.out.println("운전하다");
    }
}
