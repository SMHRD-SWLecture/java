package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01JOIN {

	public static void main(String[] args) {
		// JDBC 인터페이스 사용 방법

		// 사용자에게 데이터를 입력 받아 회원가입 실행
		Scanner sc = new Scanner(System.in);

		
		// 자원을 반납하기 위해서 try문 바깥쪽에 선언!
		PreparedStatement psmt = null;
		Connection conn = null;

		
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();

		// 1. 드라이버 로딩
		try {
			// try 구문 : 예외가 발생할 수도 있지만 일단 시도해보는 구간
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// -> 반드시 프로젝트에서 jar 파일 추가해야 함!


			// 2. DB 연결
			String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
			String user = "smhrd_kyb";
			String password = "smhrd1";
			
			// DB 연결 작업
			conn = DriverManager.getConnection(url, user, password);
			// DB와 연결 성공 여부에 대한 정보는 어디에?
			// -> Connection 자료형(Interface)의 객체 conn에 담겨 있음

			if(conn != null) {
				System.out.println("연결 성공!!");
			}
			else {
				System.out.println("연결 실패...");
			}


			// 3. Query(SQL 구문) 전송
			String sql = "INSERT INTO CLOUDMEMBER VALUES(?, ?, ?, ?, ?)";
			
			// SQL문을 전송시키는 작업
			psmt = conn.prepareStatement(sql);
			// -> 전송하기 전에 SQL문을 담아서 전송할 수 있는 형식으로 변경

			// ? 인자 채우는 작업(반드시!! 실행 전에 진행될 것!)
			// psmt.setString(몇 번째 물음표에 넣을지, 넣을 변수 / 데이터)
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			psmt.setInt(5, score);


			// 4. SQL 구문 실행
			int row = psmt.executeUpdate();
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
		finally {
			try {
				if(psmt != null) {
					psmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		sc.close();
	}

}
