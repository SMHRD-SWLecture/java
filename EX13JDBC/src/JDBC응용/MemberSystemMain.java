package JDBC응용;

import java.util.ArrayList;
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

					row = dao.update(new CloudMemberDTO(id, pw, uName, uAge, uScore));
					
					if(row > 0) {
						System.out.println("수정 성공!");
					}
					else {
						System.out.println("수정 실패...");
					}
					break;


				case 4:
					System.out.println("===== 회원탈퇴 =====");
					// ID와 PW를 입력받아 MemberDAO의 delete Method 활용
					// MemberDAO의 return값은 int형 row!!

					System.out.print("ID 입력 : ");
					id = sc.next();
					System.out.print("PW 입력 : ");
					pw = sc.next();

					row = dao.delete(new CloudMemberDTO(id, pw, null, 0, 0));

					if(row > 0) {
						System.out.println("탈퇴 성공!");
					}
					else {
						System.out.println("탈퇴 실패...");
					}

					break;


				case 5:
					System.out.println("===== 전체회원조회 =====");
					System.out.println("ID \t PW \t NAME \t AGE \t SCORE");

					// DAO의 selectAll Method 활용
					// Return Type은 ??
					ArrayList<CloudMemberDTO> list = dao.selectAll();
					for(CloudMemberDTO member : list) {
						System.out.println(member.getId() + "\t" + member.getPw() + "\t" + member.getName() + "\t" + member.getAge() + "\t" + member.getScore());
					}
					
					break;


				case 6:
					System.out.println("프로그램을 종료합니다");
					b = false;
					break;
				}
		}

	}

}
