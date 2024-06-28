package DAY16;
//DAY 16 패키지(파일)
import DAY16.view.MemberView;
//가져오기 DAY16패키지 VIEW패키지에 MemberView class
public class Appstart {
    //공용 클래스 설정 Appstart 클래스 생성
    //멤버변수
    //생성자
    //메소드
    public static void main(String[] args) {
        MemberView.mview.index();
    }
    //반환하지 않는 공용 메소드 main 생성
    //(시작점 지점 문자열 [] 인수저장선언){MemberView클래스에 mview 변수속 index 호출/사용 }
    //시작시 MemberView클래스에 mview 변수속 index 호출/사용 해서 실행
}
