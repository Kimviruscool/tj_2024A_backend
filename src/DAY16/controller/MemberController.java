package DAY16.controller;
//패키지 day16에 controller 패키지 사용
import DAY16.model.dao.MemberDAo;
//day16에 모델패키지에 dao패키지에 memberdao 호출
import DAY16.model.dto.MemberDTO;
//day16에 모델패키지에 dto패키지에 memberdto 호출
import java.util.ArrayList;
//java패키지에 util패키지에 ArrayList 호출
public class MemberController { //cs
    //공개형 클래스 MemberController 생성
    //0.
    public static MemberController mcontrol = new MemberController();
    //공개형 MemberController 을 mcontrol변수로 선언하여 객체 생성
    //1. 회원 화면 함수
    public boolean signup(MemberDTO memberDTO){
        //공개형 boolean타입의 매개변수를 지정한 signup함수 생성

        //아이디 중복검사
        System.out.println("MemberController.signup");
        //시스템 출력 멤버컨트롤러에 회원가입 출력
        boolean result = MemberDAo.mdao.signup(memberDTO);
        //회원가입 매개변수 memberDTO의 값을 boolean타입의 result변수에 저장
        return result;
        //reslt의 값을 반환
    }//se //매개변수 : 아이디 , 비밀번호 , 이름 , 전화번호  리턴값 : 성공여부 bool

    //2-1 로그인 성공한 회원의 번호를 저장하는 멤버변수
    // - 글쓰기 , 댓글, 할때 현재 로그인된 회원을 식별하기 위해서 (서비스 이용시)
    //초기값 0 비로그인상태 , 1~ : 로그인된 회원번호(로그인된상태)
    public int loginMno = 0;
    //loginMno의 값을 정수타입으로 지정후 초기값 0설정
    //2-2로그아웃 함수
    public void logout(){loginMno = 0;}
    //logout 함수 생성후 초기값 0 설정

    //2. 로그인 화면 함수
    public boolean login(MemberDTO memberDTO) { //ls
    //매개변수가 존재하는 login함수를 boolean타입으로 선언
        int result = MemberDAo.mdao.login(memberDTO);
        //로그인 매개변수 memberdto의 값을 int타입 result 에 저장
        if (result != 0) {
            //만약에 result 의 값이 0이 아니면
            loginMno = result;
            //로그인Mno에 result 값 대입
            return true;
            //로그인 성공
        } else {
            //아니면
            loginMno = 0;
            //로그인Mno의 값을 0을 대입
        }

        return false;
        //로그인 실패
    } //le //매개변수 : 아이디 , 비밀번호 리턴값 : 성공여부 bool

    //3. 아이디찾기 화면 함수
    public ArrayList<String> findID(String mname, String mphone){ //fis
        //ArrayList타입의 매개변수를 가진 findID함수 생성
        System.out.println("MemberController.findID");
        //메소드 실행 확인용 출력
        ArrayList<String> result = MemberDAo.mdao.findID(mname,mphone);
        // ArrayList타입의 result 변수 설정 후 매개변수값을받은 findID를 대입 저장
        return result;
        //result 값을 반환
    } //fie //매개변수 : 이름 , 전화번호 리턴값 : 아이디

    //4. 비밀번호찾기 화면 함수
    public String findPWD(MemberDTO memberDTO){ //fps
        //문자열 타입의 매개변수를 가진 findPWD 생성
        return MemberDAo.mdao.findPWD(memberDTO);
        //memberDTO의 매개변수값을 반환
    } //fpe //매개변수 : 아이디 , 이름 , 전화번호 리턴값 : 비밀번호

    //5 . 회원탈퇴 함수
    public boolean mDelete (String confirmpwd){ //mds
        //boolean타입의 매개변수값을 가진 mDelete함수 선언
        return MemberDAo.mdao.mDelete(confirmpwd, loginMno);
        //loginMno와 confirmpwd 매개변수 값을 반환
    } //mde
    //2. 회원수정 함수
    public boolean mUpdate (String newname, String newnum){ //ms
        //boolean타입의 매개변수를 가진 mupdate 함수 선언
        return MemberDAo.mdao.mUpdate(newname , newnum , loginMno);
        //newname과 newnum loginMno를 값을 반환
    } //me
} //ce
