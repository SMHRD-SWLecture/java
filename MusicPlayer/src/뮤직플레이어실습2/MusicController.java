package 뮤직플레이어실습2;

import java.util.ArrayList;

// Controller : 데이터의 흐름 제어
public class MusicController {

    // Field
    private MyMp3Player mp3 = new MyMp3Player();
	private String cp = "/Users/yeongminjang/Desktop/programming/smhrd_java/MusicPlayer/src/player/";
	private ArrayList<Music> musicList = new ArrayList<Music>();
    private int i = 0;
    // 모든 필드는 현재 클래스 안에서만 접근, 사용
		

    // Method
    // 0. 생성자(Constructor) : 무조건 클래스 이름(여기서는 MusicController)과 동일해야 함
    public MusicController() {
        musicList.add(new Music("Magnetic", "아일릿", cp + "Magnetic.mp3"));
        musicList.add(new Music("밤양갱", "비비", cp + "밤양갱.mp3"));
        musicList.add(new Music("첫 만남은 계획처럼 되지 않아", "투어스", cp + "firstmeet.mp3"));
        musicList.add(new Music("한 페이지가 될 수 있게", "데이식스", cp + "한페이지가될수있게.mp3"));
        musicList.add(new Music("Smart", "르세라핌", cp + "Smart.mp3"));
    }

    // 1. 재생하기
    public Music play() {
        stop(); // 아래 쪽에 설계해놓은 stop 메소드
        return exe();
    }

    // 2. 다음 곡 재생
    public Music next() {
        stop();

        if(i < musicList.size() - 1) {
            i++;
            return exe();
        }
        else {
            return null;
        }
    }

    // 3. 이전 곡 재생
    public Music pre() {
        stop();

        if(i > 0) {
            i--;
            return exe();
        }
        else {
            return null;
        }
    }

    // 4. 노래 정지
    public void stop() {
        if(mp3.isPlaying()) {
            mp3.stop();
        }
    }

    // 5. 중복되는 코드 블럭화(노래 재생 + return)
    private Music exe() {
        mp3.play(musicList.get(i).getPath());
        return musicList.get(i);
    }
}
