package Q6_2;

public class Salon extends Store {

    public double technology; // 기술 점수 저장
    public double kindness; // 친절 점수 저장

    public Salon(String name, String event, double technology, double kindness, double price) {
        this.name = name;
        this.event = event;
        this.price = price;
        this.technology = technology;
        this.kindness = kindness;
    }

    @Override
    public double grade() {
        return Math.round((((technology + kindness + price) / 3) * 100)) / 100.0;
    }
}
