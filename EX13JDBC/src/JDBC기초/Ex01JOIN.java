package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex01JOIN {

	public static void main(String[] args) {
		// JDBC 인터페이스 사용 방법

		// 사용자에게 데터ㄹ 입력 받아 회원가입 실행
		Scanner sc = new Scanner(System.in);
		System.out.print(" ID 입력 : ");
		String id = sc.next();
		System.out.print(" PW 입력 : ");
		String pw = sc.next();
		
		// 1. 드라이버 로딩
		try {
			// try 구문 : 예외가 발생할 수도 있지만 일단 시도해보는 구간
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// -> 반드시 프로젝트에서 jar 파일 추가해야 함!

			// 2. DB 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// @localhost -> 컴퓨터의 ip 주소
			// 1521 -> oracle 포트 번호
			
			String user = "hr";
			String password = "hr";
			
			// DB 연결 작업
			Connection conn = DriverManager.getConnection(url, user, password);
			// DB와 연결 성공 여부에 대한 정보는 어디에?
			// -> Connection 자료형(Interface)의 객체 conn에 담겨 있음

			if(conn != null) {
				System.out.println("연결 성공!!");
			}
			else {
				System.out.println("연결 실패...");
			}

			// 3. Query(SQL 구문) 전송
			String sql = "INSERT INTO CLOUDMEMBER VALUES(?, ?, ?, ?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
		}

		// catch 구문 : 예외가 발생했을 때, 어떤 로직을 수행할지 작성
		// 매개변수 -> 어떤 예외 상황을 잡아줄 건지 기술하는 구간
		catch (Exception e) {
			// 변경 전 : ClassNotFoundException e | SQLException e
			// 변경 후 : Exception e
			// -> 모든 예외 클래스는 Exception을 상속받음
			// -> Exception e = new ClassNotFoundException();
			// 업캐스팅이 되는 개념!

			e.printStackTrace();
			// 에러 발생 시, 어떤 오류인지 출력
			// 개발할 때만 사용하고 배포할 때는 삭제!
		}
		sc.close();
	}

}
