package 뮤직플레이어실습2;

public class Music {
    /*
     * VO(Value Object) : 값을 표현하는 객체
     * 뮤직플레이어 안에서 음악 데이터 1개를 표현할 수 있는 객체
    */

    // 1. 필드 작성
    private String title; // 노래제목
    private String singer; // 가수
    private String path; // 노래 저장 경로

    // 2. Method 작성

    // 모든 매개변수를 데이터로 받아와서 필드 값을 초기화시키는 생성자
    public Music(String title, String singer, String path) {
        this.title = title;
        this.singer = singer;
        this.path = path;
    }

    // 모든 필드의 getter 메소드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
    


}
