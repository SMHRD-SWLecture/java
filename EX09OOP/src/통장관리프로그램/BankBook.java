package 통장관리프로그램;

public class BankBook {
    // 1. 필드
    // 정수 데이터를 저장하는 money -> 잔액

    private int money; // 정보은닉(캡슐화)

    // 2. Method
    /*
     * (1) 입금하다 --> deposit
     * - 접근제한자 public
     * - 리턴타입 X
     * - 매개변수로 정수형 데이터 1개를 받아오기
     * - 필드에 있는 잔액에 매개변수로 받아온 데이터를 누적
     * 
     * (2) 출금하다 --> withdraw
     * - 접근제한자 public
     * - 리턴타입 X
     * - 매개변수로 정수형 데이터 1개를 받아오기
     * - 필드에 있는 잔액에서 매개변수로 받아온 데이터를 빼면서 누적
     * 
     * (3) 잔액보기 --> showMoney
     * - 접근제한자 public
     * - 리턴타입 String
     * - 매개변수로 X
     * - 현재 잔액을 리턴 ex) 5000원
    */

    // 필드명과 동일하게 매개변수를 선언하는 걸 추천
    public void deposit(int money) {
        this.money += money;
    }
    public void withdraw(int money) {
        this.money -= money;
    }
    public String showMoney() {
        return money + "원";
    }

}
