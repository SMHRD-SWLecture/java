package 뮤직플레이어실습2;

import java.util.Scanner;

public class MusicMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MusicController con = new MusicController();

		int num = 0;
		Music m = null;
		
		while(num != 5) {
			System.out.print("[1]노래재생 [2]다음곡 [3]이전곡 [4]정지 [5]종료 >> ");
			num = sc.nextInt();

			switch(num) {
				case 1 :
					System.out.println("===== 노래 재생 =====");
					m = con.play();
					printSong(m);
					break;

				case 2 :
					System.out.println("===== 다음 곡 재생 =====");
					m = con.next();
					if(m != null){
						printSong(m);
					}
					else {
						System.out.println("다음 곡이 없습니다.");
					}
					break;

				case 3 :
					System.out.println("===== 이전 곡 재생 =====");
					m = con.pre();

					if(m != null){
						printSong(m);
					}
					else {
						System.out.println("이전 곡이 없습니다.");
					}
					break;

				case 4 :
					System.out.println("===== 정지 =====");
					con.stop();
					break;

				case 5 :
					System.out.println("프로그램을 종료합니다.");
					con.stop();
					break;
			}
		}
		sc.close();
	}
	
	// 노래 정보 출력하는 Method
	private static void printSong(Music m) {
		System.out.println("노래 제목 \t 가수");
		System.out.println(m.getTitle() + "\t" + m.getSinger());
	}
}