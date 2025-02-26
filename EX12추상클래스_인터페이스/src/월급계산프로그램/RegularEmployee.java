package 월급계산프로그램;

public class RegularEmployee {
    // Field
    private String empno;
    private String name;
    private int pay;
    private int bonus;

    // Method

    // Constructor
    public RegularEmployee(String empno, String name, int pay, int bonus) {
        this.empno = empno;
        this.name = name;
        this.pay = pay; // 연봉
        this.bonus = bonus; // 보너스
    }

    public int getMoneyPay() {
        return (pay + bonus) / 12;
    }

    public String print() {
        return empno + " : " + name + " : " + pay;
    }
    
}
