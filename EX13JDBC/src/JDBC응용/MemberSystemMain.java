package JDBC응용;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberSystemMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();

		String id = null;
		String pw = null;
		String name = null;
		int age = 0;
		int score = 0;

		boolean b = true;
		while(b) {
			System.out.println("===== 회원관리 프로그램 =====");
			System.out.print("[1] 회원가입 [2] 로그인 [3] 회원정보수정 [4] 회원탈퇴 [5] 전체회원조회 [6] 종료 >> ");
			int input = sc.nextInt();

			switch (input) {
				case 1:
					System.out.println("===== 회원가입 =====");

					System.out.print("ID 입력 : ");
					id = sc.next();
					System.out.print("PW 입력 : ");
					pw = sc.next();
					System.out.print("이름 입력 : ");
					name = sc.next();
					System.out.print("나이 입력 : ");
					age = sc.nextInt();
					System.out.print("점수 입력 : ");
					score = sc.nextInt();

					CloudMemberDTO dto = new CloudMemberDTO(id, pw, name, age, score);

					// MemberDAO 안에 있는 join 기능 사용하기
					
					int row = dao.join(dto);
					if(row > 0) {
						System.out.println("회원가입 성공!");
					}
					else {
						System.out.println("회원가입 실패...");
					}
					break;


				case 2:
					System.out.println("===== 로그인 =====");
					
					System.out.print("ID 입력 : ");
					id = sc.next();
					System.out.print("PW 입력 : ");
					pw = sc.next();

					// CloudMemberDTO dto = new CloudMemberDTO();
					// dto.setId(id);
					// dto.setPw(pw);

					CloudMemberDTO resultDto = dao.login(new CloudMemberDTO(id, pw, null, 0, 0));
					if(resultDto != null) {
						System.out.println("<< 조회한 결과 >>");
						System.out.println("이름 \t 아이디 \t 나이 \t 점수");
						System.out.println(resultDto.getName() + "\t" + resultDto.getId() + "\t" + resultDto.getAge() + "\t" + resultDto.getScore());
					}
					else {
						System.out.println("로그인 실패!");
					}
					break;


				case 3:
					System.out.println("===== 회원정보수정 =====");

					Connection conn = null;
					PreparedStatement psmt = null;

					System.out.print("ID 입력 : ");
					id = sc.next();
					System.out.print("PW 입력 : ");
					pw = sc.next();

					System.out.print("수정할 이름 입력 : ");
					String uName = sc.next();
					System.out.print("수정할 나이 입력 : ");
					int uAge = sc.nextInt();
					System.out.print("수정할 점수 입력 : ");
					int uScore = sc.nextInt();
					
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
						String user = "smhrd_kyb";
						String password = "smhrd1";
						
						conn = DriverManager.getConnection(url, user, password);

						String sql = "UPDATE CLOUDMEMBER SET NAME = ?, AGE = ?, SCORE = ? WHERE ID = ? AND PW = ?";

						psmt = conn.prepareStatement(sql);
						psmt.setString(1, uName);
						psmt.setInt(2, uAge);
						psmt.setInt(3, uScore);
						psmt.setString(4, id);
						psmt.setString(5, pw);

						row = psmt.executeUpdate();
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
					break;


				case 4:
					System.out.println("===== 회원탈퇴 =====");
					break;
				case 5:
					System.out.println("===== 전체회원조회 =====");
					break;
				case 6:
					System.out.println("프로그램을 종료합니다");
					b = false;
					break;
				}
		}

	}

}
