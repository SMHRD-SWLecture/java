package Pokemon;

public class 포켓몬 {
    /*
     * 객체 지향 프로그래밍( Object Oriented Programming, oop)
        : 프로그램을 객체 단위로 나눠서 프로그래밍

        객체, 클래스( 객체를 생성하기 위한 설계도)

        클래스
        1) 필드(데이터) --> 객체가 가지는 공통적인 특성
            * 특정한 값을 입력하지 않고 해당 자료형의 데이터가 들어갈 수 있는 공간만 생성!!
        2) 메서드 --> 객체의 공통된 행위!

        (객체를 생성하는 법)
        >>
        클래스의 이름(설계도의 이름) 객체명 = new 클래스의 이름( );
        Person p1 = new Person( );

        * 생성자 : 객체를 생성하는 생성자
        1) 생성자의 이름은 해당 클래스의 이름과 동일하다(대소문자 구분)
        2) 리턴값 X
        3) 개발자가 기본 생성자를 작성하지 않으면 -> 컴파일러가 자동으로 
            생성해준다! -> 개발자 눈에는 보이지 않는다!
            * 매개변수가 있는 생성자를 만드는 경우 -> 기본 생성자를 명시해줘야한다!!

        4) 매개변수가 있는 생성자
            객체 생성과 더불어서 필드 값 초기화를 코드 한줄로 진행가능!! 
        (main클래스) 
        Person p2 = new Person("양정민", 20, "광주광역시 남구");
        (Person 클래스) * 매개변수가 있는 생성자 생성
        Public Person(String name, int age, String address){
            상단의 필드 = main클래스에서 받아온 데이터
            this.name = name;
            this.age = age;
            this.address = address;
        }
        5) 기본 생성자를 이용해서 필드 값 초기화
            Person p1 = new Person();
            p1.age = 10;
            p1. name="주현빈";

        6) private 선언한 필드에 접근하는 방법
            private int age;
            private String name;
            // getter, setter 메서드를 만들어서 접근한다!!

        7) 매개변수 <-> 전달인자
        메서드가 생성되는 클래스 <-> 메서드를 사용할때의 데이터
        데이터의 자료형, 순서, 개수 동일해야한다.
        public static int sum(int a, double b, String c)
            --> sum(1, 5.13 , "3")
    */

    // 1. 필드
    // name(이름), hp(생명력), atk(공격력), type(공격 타입), skill(공격 타입)
	// private : 다른 클래스에서 접근할 때는 메서드를 통해서 접근(getter / setter)
	private String name;
    private int hp;
    private int attack;
    private String type;
    private String skill;

    public 포켓몬() {

    }

    public 포켓몬(String name, String type, int hp, int attack, String skill) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.type = type;
        this.skill = skill;
    }

    // 2. 메서드
    // attack(공격한다), evole(진화한다), getter, setter
    // getter/setter -> alt shift s
    public void attack() {
        System.out.println("으라차차 공격한다");
    }
    public void evolve() {
        System.out.println("뿅 진화한다");
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
}
