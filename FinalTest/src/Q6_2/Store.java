package Q6_2;

// Store -> 추상클래스
public abstract class Store {

    public String name; // 가게 상호 이름 저장
    public String event; // 가게 종목 저장
    public double price; // 가게 평점 중 가격점수를 저장

    public abstract double grade();
}
