package DAY16.model.dto;
//DAY16에 모델패키지에 dto클래스 생성
public class ReplyDTO { //이동객체
    //D T O : 저장 D : data T : transfer object
    // MVC패턴에서의 역할 : 각 구역별 데이터 변수들을 묶어서 이동하는 객체
    // 1.멤버변수는 PRIVATE 2. 생성자 : 빈생성자 , 풀생성자 +n개 추가 3. getter & setter 사용 + toString()

    //공개형 클래스 replydto생성
    private String rcontent;
    private String rdatet;
    private int mno;
    private int bno;
    private int rno;

    //-작성자 아이디
    private String mid;
    public String getMid() {return mid;}
    public void setMid(String mid) {this.mid = mid;}

    //생성자
    public ReplyDTO(){}

    public ReplyDTO(String rcontent, String rdatet, int mno, int bno ,int rno) {
        this.rcontent = rcontent;
        this.rdatet = rdatet;
        this.mno = mno;
        this.bno = bno;
        this.rno = rno;
    }

    //메소드
    //1. toString
    @Override
    public String toString() {
        return "ReplyDTO{" +
                "rcontent='" + rcontent + '\'' +
                ", rdatet='" + rdatet + '\'' +
                ", mno=" + mno +
                ", bno=" + bno +
                ", rno=" + rno +
                '}';
    }
    //2. getter & setter

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent;
    }

    public String getRdatet() {
        return rdatet;
    }

    public void setRdatet(String rdatet) {
        this.rdatet = rdatet;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }
}
