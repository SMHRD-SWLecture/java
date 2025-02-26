package 상속실습;

public class SmartPhone extends Phone {

    // 자식 클래스, 서브클래스

    @Override // Annotation : 기능을 가지고 있을 수 있는 주석
    public void send() {
        System.out.println("카카오톡 메시지");
    }

    public void wifi() {
        System.out.println("wifi");
    }
}
