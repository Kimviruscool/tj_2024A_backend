package DAY16.model.dto;
//DAY16패키지에 모델패키지에 dto선언
public class MemberDTO { //이동객체 //Data Transform
    //공개형 클래스인 MEMBERDTO선언
    //1. 멤버변수 -- DB필드와 동일 private 권장
    private String mid;
    //잠금형 문자열 MID 멤버변수 선언
    private String mpwd;
    //잠금형 문자열 mpwd 멤버변수 선언
    private String mname;
    //잠금형 문자열 mname선언
    private String mphone;
    //잠금형 문자열 mphone 선언
    private String mdate;
    //잠금형 문자열 mdate 선언
    private int mno;
    //잠금형 int 형 mno선언

    //2. 생성자 기본,풀생성자
    public MemberDTO(){}
    //공개형 기본생성자 선언
    public MemberDTO(String mid, int mno, String mpwd, String mname, String mphone, String mdate) {
    //공개형 생성자 전체 사용 선언(문자열 , MID 정수형 mon 문자열 mpwd 문자열 mname 문자열 mphone 문자열 mdate)
        this.mid = mid;
        //클래스의 멤버변수 mid에 매개변수 mid값 저장
        this.mno = mno;
        //클래스의 멤버변수 mno에 매개변수 mno값 저장
        this.mpwd = mpwd;
        //클래스의 멤버변수 mpwd에 매개변수 mpwd값 저장
        this.mname = mname;
        //클래스의 멤버변수 mname에 매개변수 mname값 저장
        this.mphone = mphone;
        //클래스의 멤버변수 mphone에 매개변수 mphone값 저장
        this.mdate = mdate;
        //클래스의 멤버변수 mdate에 매개변수 mdate값 저장
    }
    //--회원가입용 생성자 따로 생성

    //오버로드
    public MemberDTO(String mid, String mpwd, String mname, String mphone) {
        //공개형 생성자 MemberDTO생성(문자열 mid 문자열 mpwd 문자열 mname 문자열 mphone) 필요한 형태의 생성자선언
        this.mid = mid;
        //클래스의 멤버변수 mid에 매개변수 mid값 저장
        this.mpwd = mpwd;
        //클래스의 멤버변수 mpwd에 매개변수 mpwd값 저장
        this.mname = mname;
        //클래스의 멤버변수 mname에 매개변수 mname값 저장
        this.mphone = mphone;
        //클래스의 멤버변수 mphone에 매개변수 mphone값 저장
    }

    //3. 메소드 : 1.getter/setter 2.toString()


    @Override
    //오버라이드 : 값 덮어쓰기 , 재정의
    public String toString() {
        //공개된 문자열 타입 toString을 생성 , 선언
        return "MemberDTO{" +                   //주소값을 출력하는 tostring메서드 선언후 그값을 반환
                "mid='" + mid + '\'' +          //mid 는 각 객체의 mid값을 출력
                ", mpwd='" + mpwd + '\'' +      //mpdw는 각 객체의 mpwd값 출력
                ", mname='" + mname + '\'' +    //mname은 각 객체의 mname값 출력
                ", mphone='" + mphone + '\'' +  //mphone은 각 객체의 mphone값 출력
                ", mdate='" + mdate + '\'' +    //mdate는 각 객체의 mdate값 출력
                ", mno=" + mno +                //mno는 각 객체의 mno값 출력
                '}'; //메서드 end
    }
    //멤버변수가 private이기 때문에 각 멤버변수의 getter , setter 선언

    public String getMid() {
        return mid;
    }
    //공개형 문자열 getmid를 선언해서 mid값을 가져옴
    public void setMid(String mid) {
        this.mid = mid;
    }
    //반환하지 않는 공개형 setmid 선언해서 매개변수 mid에 입력받은 값을 멤버변수 mid에 다시저장

    public String getMpwd() {
        return mpwd;
    }
    //공개형 문자열 getMpwd 선언해서 pwd값을 가져옴
    public void setMpwd(String mpwd) {
        this.mpwd = mpwd;
    }
    //반환하지 않는 공개형 setmpwd를 선언해서 매개변수 mpdw에 입력받은 값을 멤버변수 mpdw에 다시저장

    public String getMname() {
        return mname;
    }
    //공개형 문자열 getMname를 선언해서 Mname값을 가져옴
    public void setMname(String mname) {
        this.mname = mname;
    }
    //반환하지 않는 공개형 setMname 선언해서 매개변수 mname 입력받은 값을 멤버변수 mname 다시저장

    public String getMphone() {
        return mphone;
    }
    //공개형 문자열 getMphone를 선언해서 Mphone값을 가져옴
    public void setMphone(String mphone) {
        this.mphone = mphone;
    }
    //반환하지 않는 공개형 setMphone 선언해서 매개변수 mphone 입력받은 값을 멤버변수 mphone 다시저장

    public String getMdate() {
        return mdate;
    }
    //공개형 문자열 getMdate를 선언해서 Mdate값을 가져옴
    public void setMdate(String mdate) {
        this.mdate = mdate;
    }
    //반환하지 않는 공개형 setMdate 선언해서 매개변수 mdate 입력받은 값을 멤버변수 mdate 다시저장

    public int getMno() {
        return mno;
    }
    //공개형 문자열 getMno를 선언해서 Mno값을 가져옴
    public void setMno(int mno) {
        this.mno = mno;
    }
}    //반환하지 않는 공개형 setMno 선언해서 매개변수 mno 입력받은 값을 멤버변수 mno 다시저장
