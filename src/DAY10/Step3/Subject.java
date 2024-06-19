package DAY10.Step3;

public class Subject {
    private String name; //비공개 문자열 name변수 생성
    private int scorePoint; //비공개 정수 scorePoint변수 생성


    //getter and setter
    public String getName() { //공개 문자열 변수명생성
        return name; //값을 name에 반환
    }

    public void setName(String name) { //공개형 반환값x 불러오기변수(문자열 name)
        this.name = name; //멤버변수name 에 지역변수 name대입
    }

    public int getScorePoint() {
        return scorePoint;
    }

    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }
}
