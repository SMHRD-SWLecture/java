package 월급계산프로그램;

public class RegularEmployee extends Parent{
    // Field
    private int bonus;

    // Method

    // Constructor
    public RegularEmployee(String empno, String name, int pay, int bonus) {
        // 부모 클래스에서 정의한 매개변수만 담아서 생성자 사용!
        super(empno, name, pay);
        // 자식클래스에서만 사용하는 필드는 this.을 사용해서 초기화
        this.bonus = bonus; // 보너스
    }

    public int getMoneyPay() {
        return (pay + bonus) / 12;
    }
    public String print() {
        return empno + " : " + name + " : " + pay;
    }
    
}
