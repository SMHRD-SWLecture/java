package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Update {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;

		Scanner sc = new Scanner(System.in);

		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();

		// 해당 정보와 일치하는 데이터의 
		// (수정하고 싶은 데이터) 이름, 나이, 점수를 수정 --> 사용자로부터 입력

		System.out.print("수정할 이름 입력 : ");
		String uName = sc.next();
		System.out.print("수정할 나이 입력 : ");
		int uAge = sc.nextInt();
		System.out.print("수정할 점수 입력 : ");
		int uScore = sc.nextInt();
		
		try {
			// 1. 드라이버 로딩 --> 어떤 DB 쓸 건지 정하기
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. DB 연결
			String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
			String user = "smhrd_kyb";
			String password = "smhrd1";
			
			conn = DriverManager.getConnection(url, user, password);

			// 3. SQL 구문 준비
			String sql = "UPDATE CLOUDMEMBER SET NAME = ?, AGE = ?, SCORE = ? WHERE ID = ? AND PW = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, uName);
			psmt.setInt(2, uAge);
			psmt.setInt(3, uScore);
			psmt.setString(4, id);
			psmt.setString(5, pw);

			// 4. 실행하기
			int row = psmt.executeUpdate();
			if(row > 0)
				System.out.println("수정 성공!");
			else
				System.out.println("수정 실패...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(psmt != null)
					psmt.close();
				if(conn != null)
					conn.close();
				
			} catch (SQLException e) {
				System.out.println("자원 반납 시 문제 발생");
			}
		}
	}

}
