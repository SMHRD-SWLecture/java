package 월급계산프로그램;

public class TempEmployee extends Parent{

    // Method
    public TempEmployee(String empno, String name, int pay) {
        // 부모 클래스에서 정의한 생성자 사용!
        super(empno, name, pay);
    }

    public int getMoneyPay() {
        return pay / 12;
    }
    public String print() {
        return empno + " : " + name + " : " + pay; 
    }
}
