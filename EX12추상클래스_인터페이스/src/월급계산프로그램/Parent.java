package 월급계산프로그램;

public abstract class Parent {
    // 공통적으로 가지고 있는 필드
    public String empno;
    public String name;
    public int pay;

    public Parent(String empno, String name, int pay) {
        this.empno = empno;
        this.name = name;
        this.pay = pay;
    }

    public abstract int getMoneyPay();
    // 로직 구현 부분은 각각 다르게 정의하므로 추상 메소드로 변환
    public abstract String print();
}
