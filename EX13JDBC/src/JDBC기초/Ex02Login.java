package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02Login {

	public static void main(String[] args) {

		// Login 실습
		// JDBC 연결 순서

		Scanner sc = new Scanner(System.in);
		// 1. 드라이버 로딩
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. DB 연결
			// (1) 연결할 준비물 - url, 계정, 비밀번호
			String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
			String user = "smhrd_kyb";
			String password = "smhrd1";

			// (2) 연결 -> Connection conn
			conn = DriverManager.getConnection(url, user, password);

			// 3. SQL 구문 작성
			// 로그인 : 내가 입력한 정보(ID, PW)가 DB에 있는 정보와 일치하는지 판단 필요!
			if(conn != null) {
				System.out.println("연결 성공!!");
			}
			else {
				System.out.println("연결 실패...");
			}
	
			// 3. SQL 구문 작성
			String sql = "SELECT ID, NAME, AGE, SCORE FROM CLOUDMEMBER WHERE ID = ? AND PW = ?";
	
			// 3-1. SQL 구문 준비
			psmt = conn.prepareStatement(sql);
	
			// 3-2. ?인자 채우기
			psmt.setString(1, id);
			psmt.setString(2, pw);
	
			// 4. SQL 구문 실행
			rs = psmt.executeQuery();
	
			if(rs.next()) {
				String resultId = rs.getString("id");
				String resultName = rs.getString("name");
				int resultAge = rs.getInt("age");
				int resultScore = rs.getInt("score");

				System.out.println("<< 조회한 결과 >>");
				System.out.println("이름 \t 아이디 \t 나이 \t 점수");
				System.out.println(resultName + "\t" + resultId + "\t" + resultAge + "\t" + resultScore);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 5. 자원 반납 -> close()
		// 열어준 순서의 역순으로 반납
		// 반납 순서 : rs -> psmt -> conn
		finally {
			try {
				if(rs != null)
					rs.close();
				// 조건문, 반복문 -> 안쪽에 들어가는 코드가 1줄이면 {} 생략 가능
				if(psmt != null)
					psmt.close();
				if(conn != null)
					conn.close();
			}
			catch (SQLException e) {
				System.out.println("자원 반납 시 문제 발생");
			}
		}
		sc.close();
	}

}
