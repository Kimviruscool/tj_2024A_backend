package DAY16.view;
//DAY16속 view 패키지/폴더
import DAY16.controller.MemberController;
//DAY16속 controller 패키지 안 MemberController클래스 호출
import DAY16.model.dto.MemberDTO;
//DAY16에 model 패키지 안 dto 패키지 안 MemberDTO클래스 호출
import java.util.ArrayList;
//java패키지.util패키지안 ArrayList클래스 호출
import java.util.InputMismatchException;
//java패키지 안 util 패키지 안 InputMismatchException라는 예외처리 클래스 호출
import java.util.Scanner;
//java 패키지 안 util 패키지안 scanner 클래스 호출
public class MemberView { //cs
    //공용 사용될 MemberVeiw 클래스 생성
    // 해당 클래스의 함수들을 다른 클래스에서 호출 할수 있도록 static 변수에 객체
    // 전역 객체 > 모든 곳에서 호출 가능한 객체 1개 생성

    public static MemberView mview = new MemberView();
    //private MeberView(){} // 생성자에 private한다 : 다른 클래스에서 new를 못한다. 안전성보장
    //싱글톤 : 프로그램내 전역으로 하나의 객체를 생성
    //언제 : 주로 전역에서 공유할때 사용

    //static 선언시점 : 프로그램 시작시, static 초기화/사라짐 시점 : 종료시
    //메소드를 실행하기 위해서는 객체 필요 static 메소드가 아닌이상
    // - 멤버변수는 객체 마다 할당 , 메소드는 객체마다 실행되지만 코드(기능하는 방법) 는 공유
    // - 객체 마다 메소드가 실행

    //멤버변수 : 입력객체
    Scanner scan = new Scanner(System.in);
    //Scanner 클래스를 사용하기위해 scan 객체 생성

    //0 초기화면 함수 생성
    public void index() {

        while (true) {
            //반복문 생성
            System.out.println("1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기 : ");
            //시스템 콘솔 출력창 선언
            try {
                //예외 처리 발생시 잡아줄 try영역 지정
                int ch = scan.nextInt();
                //내가 scan을 통해 입력한 값을 int타입에 ch변수로 지정
                if (ch == 1) {
                    signup();
                }
                //만약 ch 가 1이면 회원가입 함수 사용
                else if (ch == 2) {
                    login();
                }
                //그게아니고 만약 2이면 로그인 함수 사용
                else if (ch == 3) {
                    findID();
                }
                //그게아니고 만약 3이면 아이디 찾기 함수 사용
                else if (ch == 4) {
                    findPWD();
                }
                //그게아니고 만약 4면 비밀번호 찾기 함수 사용
                else {
                    System.out.println("없는 기능 번호입니다.");
                }
                //그것도아니면 시스템출력으로 없는 기능 번호입니다 . 출력
            } //try end
            catch (InputMismatchException e) {
                //예외처리가 try구역 에서 발생시 catch로 잡기
                // InputMismatchException이라는 예외처리를 e라는 변수로 지정
                System.out.println("잘못된 입력이 있습니다 . 초기메뉴로" + e);
                //어떠한 문제의 예외처리가 발생했는지 시스템 출력 "e" 꼭 사용
                scan = new Scanner(System.in);
                //확인후 scan의 기존값 초기화
            } //c end
        } // w end
    } //m end

    //1. 회원 화면 함수
    public void signup() { //ss
        //회원가입 함수 선언
        System.out.println("회원가입 페이지");
        //시스템 출력 회원가입 페이지
        //1. 입력
        System.out.println("아이디 입력 : ");
        String mID = scan.next();
        //안내 출력문 이후 scan을 통한 문자열 값을 입력받아 문자열 mID에 저장
        System.out.println("비밀번호 입력 : ");
        String mPWD = scan.next();
        //안내 출력문 이후 scan을 통한 문자열 값을 입력받아 문자열 mPWD 저장
        System.out.println("이름 입력 : ");
        String mName = scan.next();
        //안내 출력문 이후 scan을 통한 문자열 값을 입력받아
        System.out.println("전화번호 입력 : ");
        String mPhone = scan.next();
        //안내 출력문 이후 scan을 통한 문자열 값을 입력받아 mphone에 저장

        //2. 유효성검사
        //3. 객체화
        MemberDTO memberDTO = new MemberDTO(mID, mPWD, mName, mPhone);
        //MemberDTO클래스를 사용할 memberDTO객체를 생성 이때 값을 MID,MPWD,MNAME,MPHONE을 넣음
        //4. Controll에게 전달
        boolean result = MemberController.mcontrol.signup(memberDTO);
        //memberDTO의 매개변수 값을 저장한 MemberController에mcontrol에signup기능을
        //boolean 타입의 result 변수로 저장
        if (result) {
            System.out.println("회원가입 성공");
        }
        //만약 result값이 참/true이면 회원가입 성공 안내 출력
        else {
            System.out.println("회원가입 실패");
        }
        //아니면 회원가입 실패 안내 출력
    }//se
    // 매개변수 : 아이디 , 비밀번호 , 이름 , 전화번호  리턴값 : 성공여부 bool

    //2. 로그인 화면 함수
    public void login() {
        //ls
        //로그인 함수 선언
        System.out.println("로그인 페이지");
        //로그인 안내 출력
        //1. 입력
        System.out.println("아이디 입력 : ");
        String mID = scan.next();
        //아이디 입력 안내 출력후 mID에 입력값 저장
        System.out.println("비밀번호 입력 : ");
        String mPWD = scan.next();
        //아이디 입력 안내 출력후 mPWD에 입력값 저장
        MemberDTO memberDTO = new MemberDTO();
        //MemberDTO클래스를 사용하기위해 memberDTO객체를 생성
        memberDTO.setMid(mID);
        memberDTO.setMpwd(mPWD);
        //memberDTO객체의 setMid를 하여 (mID호출) * MemberDTO에서 private이기때문에 set,get사용
        //memberDTO객체의 setMpwd를 하여 (mPWD호출) * private이기때문에 set사용
        boolean result = MemberController.mcontrol.login(memberDTO);
        //memberDTO 값을 담고있는 MemberController클래스에mcontrol객체의login 기능의 값을
        //boolean 타입의 result 변수로 저장
        if (result) {
            System.out.println("로그인 성공");
            //만약에 result의 값이 참이면 {로그인 성공 메세지 호출}
            BoardView.bview.index2();
        }
        //로그인 성공화면으로 이동
        else {
            System.out.println("로그인 실패");
        }
        //아니면 로그인 실패 안내 메세지 출력
    } //le //매개변수 : 아이디 , 비밀번호 리턴값 : 성공여부 bool

    //3. 아이디찾기 화면 함수
    public void findID() {//fs
        //findID 아이디 찾기 함수 생성
        System.out.println("아이디 찾기 페이지");
        //아이디 찾기 안내문 출력
        System.out.println("[아이디찾기] 이름 입력 : ");
        String mname = scan.next();
        //아이디 찾기 안내문 출력후 문자열 mname에 scan을 통해 입력 이름의 값을 저장
        System.out.println("[아이디찾기] 전화번호 입력 : ");
        String mphone = scan.next();
        //아이디 찾기 안내문 출력 후 문자열 mphone에 scan을 통해 입력된 전화번호의 값을 저장
        ArrayList<String> result = MemberController.mcontrol.findID(mname, mphone);
        //MemberController에mcontrol에findID에 매개변수를 받아서 반환된 값을 
        //문자열이 담기는 배열에 있는 result에 값을 대입
        for (int i = 0; i < result.size(); i++) { //fs
            //반복문 i의 값을 0으로 지정하여 result배열 갯수만큼 하나씩 추가하며 반복문 반복
            System.out.println(result.get(i));
            //result의 찾은 i번째의 값을 출력
        } //fe


    } //fie //매개변수 : 이름 , 전화번호 리턴값 : 아이디

    //4. 비밀번호찾기 화면 함수
    public void findPWD() { //fps
        //findPWD 비밀번호 찾기 함수 선언
        System.out.println("비밀번호 찾기 페이지");
        //비밀번호 찾기 페이지 안내문 출력
        System.out.println("[비밀번호찾기] 아이디 입력 : ");
        String mid = scan.next();
        //비밀번호 찾기 안내메세지 출력후 mid에 입력받은 아이디 값을 저장
        System.out.println("[비밀번호찾기] 연락처 입력 : ");
        String mphone = scan.next();
        //비밀번호 찾기 안내 메세지 출력후 mphone에 입력받은 전화번호 값을 저장
        MemberDTO memberDTO = new MemberDTO();
        //MemberDTO를 사용하기위한 memberDTO 객체 생성
        memberDTO.setMid(mid);
        memberDTO.setMphone(mphone);
        //member객체의 mid을 호출 //memberDTO의mhpone의 값을 호출
        //둘다 MDTO에서 private 상태이기 때문에 getter엔 setter사용
        String result = MemberController.mcontrol.findPWD(memberDTO);
        //MemberController에mcontrol에findPWD에 매개변수를 받아서 반환된 값을
        //문자열 resulst변수에 저장
        if (result != null) {
            System.out.println("회원의 비밀번호 : " + result);
        }
        //만약 result의 값이 null이아니라면 찾는 비밀번호를 안내하는 메세지 출력
        else {
            System.out.println("동일한 회원정보가 없습니다.");
        }
        //그게아니면 ? 동일한 회원정보가 없다고 안내문 출력

    } //fpe //매개변수 : 아이디 , 이름 , 전화번호 리턴값 : 비밀번호
}//ce