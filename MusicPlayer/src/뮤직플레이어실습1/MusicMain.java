package 뮤직플레이어실습1;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MyMp3Player mp3 = new MyMp3Player();

		// 파일이 저장되어 있는 공통 경로 설정
		String cp = "/Users/yeongminjang/Desktop/programming/smhrd_java/MusicPlayer/src/player/";

		// 실행하는 공간
		/*
		 * 라이브러리
		 * : 사용할 수 있는 도구들(객체들)의 모음집
		 * 
		 * 외부 라이브러리를 가져와서 사용할 때 주의할 점
		 * --> 가져오는 라이브러리와 내과 코드를 작성하고 있는 프로젝트 간의 버전이 일치하는지 확인
		 * 
		 * java에서 라이브러리 == jar
		 * 외부 라이브러리 가져오는 방법
		 * 프로젝트 선택 -> 마우스 우클릭 -> Build Path -> Configure Build Path -> Add Jars
		 * 
		 * Add External Jars를 활용해서 외부(워크페이스 바깥쪽)에 있는 라이브러리를 가져와서 사용하는 것도 가능
		 * -> 파일을 옮기거나 삭제해버렸을 때 문제가 발생할 수 있음
		 */
	
		// // MP3Player 클래스 사용해보기
		// // 1. 객체 생성(도구 꺼내오기)
		
		// // 2. 노래 재생
		mp3.play("/Users/yeongminjang/Desktop/programming/smhrd_java/MusicPlayer/src/player/Magnetic.mp3");

		// 3. 노래가 재생 중인지 여부를 판단
		if(mp3.isPlaying()) {
		// 4. 노래를 멈추기
			System.out.println(mp3.isPlaying() + "check");
		 	mp3.stop();
		}

		// 1. 여러 개의 노래를 저장할 수 있는 가변 배열 musicList 생성
		ArrayList<Music> musicList = new ArrayList<Music>();
		
		// 2. musicList 안에 음악 데이터 1개 추가
		// - 제목 : Magnetic / 가수 : 아일릿 / 경로 : 실제 경로
		// Music m = new Music("Magnetic", "아일릿", cp + "Magnetic.mp3");
		musicList.add(new Music("Magnetic", "아일릿", cp + "Magnetic.mp3"));
		musicList.add(new Music("밤양갱", "비비", cp + "밤양갱.mp3"));
		musicList.add(new Music("첫 만남은 계획처럼 되지 않아", "투어스", cp + "firstmeet.mp3"));
		musicList.add(new Music("한 페이지가 될 수 있게", "데이식스", cp + "한페이지가될수있게.mp3"));
		musicList.add(new Music("Smart", "르세라핌", cp + "Smart.mp3"));

		System.out.println(musicList.get(0).getTitle());

		int num = 0;
		int i = 0; // musicList의 인덱스

		while(num != 5) {
			System.out.print("[1]노래재생 [2]다음곡 [3]이전곡 [4]정지 [5]종료 >> ");
			num = sc.nextInt();

			switch(num) {
				case 1 :
					System.out.println("===== 노래 재생 =====");
					if(mp3.isPlaying()) {
						mp3.stop();
					}

					mp3.play(musicList.get(i).getPath());
					System.out.println("노래 제목 \t 가수");
					System.out.println(musicList.get(i).getTitle() + "\t" + musicList.get(i).getSinger());
					break;


				case 2 :
					System.out.println("===== 다음 곡 재생 =====");
					if(mp3.isPlaying()) {
						mp3.stop();
					}

					if(i < musicList.size() - 1) {
						i++;
						mp3.play(musicList.get(i).getPath());
						System.out.println("노래 제목" + "\t" + "가수");
						System.out.println(musicList.get(i).getTitle() + "\t" + musicList.get(i).getSinger());
					}
					else {
						System.out.println("다음 곡이 없습니다.");
					}
					break;

				
				case 3 :
					System.out.println("===== 이전 곡 재생 =====");
					if(mp3.isPlaying()) {
						mp3.stop();
					}

					if(i > 0) {
						i--;
						mp3.play(musicList.get(i).getPath());
						System.out.println("노래 제목" + "\t" + "가수");
						System.out.println(musicList.get(i).getTitle() + "\t" + musicList.get(i).getSinger());
					}
					else {
						System.out.println("이전 곡이 없습니다.");
					}
					break;

					
				case 4 :
					System.out.println("===== 정지 =====");
					if(mp3.isPlaying()) {
						mp3.stop();
					}
					break;
				case 5 :
					System.out.println("프로그램을 종료합니다.");
					mp3.stop();
					break;
			}
		}
	}

}
