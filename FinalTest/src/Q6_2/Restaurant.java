package Q6_2;

public class Restaurant extends Store {

    public double service; // 서비스 점수 저장
    public double flavor; // 맛 점수 저장
    public double clean; // 청결 점수 저장
    
    public Restaurant(String name, String event, double service, double flavor, double clean, double price) {
        this.name = name;
        this.event = event;
        this.price = price;
        this.service = service;
        this.flavor = flavor;
        this.clean = clean;
    }

    @Override
    public double grade() {
        return Math.round((((service + flavor + clean + price) / 4) * 100)) / 100.0;
    }
}
