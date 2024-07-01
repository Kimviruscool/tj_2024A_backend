package DAY16.model.dto;
//패키지 DAY16.모델패키지 dto클래스 선언
public class BoardDTO {
//공개형 클래스 boardDTO
    //1. 멤버변수
    private String btitle;
    private String bcontent;
    private String bdate;
    private String binfo;
    private int bno;
    private int mno;

    //2. 생성자
    public BoardDTO(){}

    public BoardDTO(String btitle, String bcontent, String bdate, String binfo, int bno, int mno) {
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bdate = bdate;
        this.binfo = binfo;
        this.bno = bno;
        this.mno = mno;
    }
    //3. 메소드
        //1. setter , getter

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getBinfo() {
        return binfo;
    }

    public void setBinfo(String binfo) {
        this.binfo = binfo;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    //2. Tostring

    @Override
    public String toString() {
        return "BoardDTO{" +
                "btitle='" + btitle + '\'' +
                ", bcontent='" + bcontent + '\'' +
                ", bdate='" + bdate + '\'' +
                ", binfo='" + binfo + '\'' +
                ", bno=" + bno +
                ", mno=" + mno +
                '}';
    }
}
