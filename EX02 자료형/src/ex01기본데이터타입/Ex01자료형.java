package ex01기본데이터타입;

public class Ex01자료형 {

	public static void main(String[] args) {
		// 자료형(data type) : 데이터의 종류를 정의
		// 1. 기본데이터 타입(기초 데이터타입)
		// 2. 참조데이터 타입(reference)

		// 1) 논리형(Boolean type)
		// : 참과 거짓을 저장하는 데이터 타입(자료형)
		// 키워드 : boolean, 크기 : 1byte, 범위 : true, false
		boolean isRainy = false;
		boolean isSnow = true;
		System.out.println(isRainy);

		// 2) 문자형(Character type)
		// : 문자 1개를 저장하는 자료형
		// 키워트 : char, 크기 : 2byte, 범위 : 0 ~ 65535(unicode 문자범위)
		char grade = 'A';

		// 3) 정수형(Integer type)
		// : 소수점이 없는 숫자
		// 	(1) byte
		//	키워드 : byte, 크기 : 1byte, 범위 : -128 ~ 127
		byte age = 21;
		// 	byte age1 = 130; -> byte의 범위를 벗어난 수

		//	(2) short
		//	키워드 : short, 크기 : 2byte, 범위 : -32,768 ~ 32,767
		short launchMenuPrice = 10000;

		//	(3) int
		//	: 정수형의 가장 기본 데이터 자료형으로 설정
		//	-> 정수를 입력하면 compiler가 기본 정수형인 int로 인식
		//	키워드 : int, 크기 : 4byte, 범위 : -2,147,483,648 ~ 2,147,483,647
		int lottoWinningAmount = 1000000000;

		//	(4) long
		//	키워드 : long, 크기 : 8byte, 범위 : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		long globalPopular = 8_000_000_000L; // _ : ,와 같은 역할 / 맨 뒤에 L필수

		// 4) 실수형(Floating Point type)
		//	(1) float
		//	키워드 : float, 크기 : 4byte
		float weight = 40.1f; // 맨 뒤에 f필수

		// 	(2) double
		//	: 실수 데이터 타입의 기본 자료형으로 설정
		// 	키워드 : double, 크기 : 8byte
		double pi = 3.141592;

	}

}
