package 월급계산프로그램;

public class PartTimeEmployee extends Parent {

    // Field
    private int workDay; // 근무일수

    // Method
    public PartTimeEmployee(String empno, String name, int pay, int workDay) {
        super(empno, name, pay);
        this.workDay = workDay;
    }

    public int getMoneyPay() {
        return pay * workDay;
    }
    public String print() {
        return empno + " : " + name + " : " + getMoneyPay();
    }

}
