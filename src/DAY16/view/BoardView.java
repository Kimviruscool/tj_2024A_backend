package DAY16.view;
//DAY16패키지 view패키지 안내
import DAY16.controller.MemberController;
//DAY16에 controller 패키지에 MemberController 호출
import java.util.Scanner;
//java패키지에 util패키지에 Scanner 호출
public class BoardView { //cs
    //BoardView 클래스 생성
    //0.
    public static BoardView bview = new BoardView();
    //모두 사용한 패키지로 Boradview클래스에 bview로 객채 생성
    public Scanner scan = new Scanner(System.in);
    //공개형으로 Scanner 패키지에 scan객체 생성

    //0. 로그인 성공시 초기화면
    public void index2(){
    //로그인 성공시 초기화면 구성
        while(true){
            //반복문 선언
            System.out.printf(">>1. 로그아웃 2.회원수정 3.회원탈퇴 4.게시판 : ");
            //각숫자별 기능을 하는 안내문 출력
            int ch = scan.nextInt();
            //입력한 값을 저장할수있게 int타입에 ch변수 선언
            if(ch == 1){logout(); return ;}
            //만약에 ch가 1이면 ? 로그아웃 기능후 반환하여 MemberView 화면으로 이동
            else if(ch == 2){ //2s
                //그게아니고 만약 ch2면?
                if (mUpdate()){
                    //만약 mUpdate에 받아온 값이 참이면
                     logout(); return;}
                //로그아웃 기능 후 MemberView페이지로 이동
            } //2e

            else if(ch == 3){//3s
                //그게아니고 만약에 ch가 3이면?
                if (mDelete()){//만약에 mDelete의 값이 true이면
                    logout(); return;}
                //로그아웃 기능후 MemberView화면으로 이동
            }//4e
            else if(ch == 4){bPrint();}
            //그게아니고 만약 ch4면 ? bPrint기능 실행
            else {System.out.printf("기능 할수 없는 번호입니다.");}
            //그것도 아니면 기능을 할수 없는 번호라고 안내문 출력

        } //while end
    } //main end

    //1. 로그아웃 함수
    public void logout (){ //ls
        //로그아웃 함수 구현 시작
        //회원 컨트롤러에 로그아웃 메소드 호출
        MemberController.mcontrol.logout();
        System.out.println("로그아웃 성공 (초기메뉴로 이동)");
        //로그아웃 성공 후 안내메세지 출력
    } //le
    //2. 회원수정 함수
    public boolean mUpdate (){ //us
        //boolean타입의 회원수정함수선언
        System.out.println("[수정] 수정할 이름 : ");
        //수정할 이름을 입력하는 안내문 출력
        String newname = scan.next();
        //newname에 입력받은 새이름값 저장
        System.out.println("[수정] 수정할 전화번호 : ");
        //수정할 전화번호를 입력받는 안내문 출력후
        String newnum = scan.next();
        //newnum에 입력받을 새 전화번호값 저장

        boolean result = MemberController.mcontrol.mUpdate(newname , newnum);
        //회원컨트롤러에서 newname과 newnum의 매개변수값을 호출하여 그값을 boolean타입의 result변수에 저장
        if (result){System.out.println("수정이 완료되었습니다."); return true;}
        //만약에 result가 참이면 수정완료 메세지 안내후 true/참 값을 반환
        else {System.out.println("수정 실패");return false;}
        //그게 아니면 수정 실패 메세지 안내후 반환값 false/거짓 을 반환
    } //ue
    //3. 회원탈퇴 함수
    public boolean mDelete (){ //mds
        //boolean타입의 회원탈퇴 함수 선언
        System.out.println("[탈퇴] 비밀번호 입력 : ");
        //탈퇴 비밀번호 입력 안내메세지 출력
        String confirmpwd = scan.next();
        //입력받은 비밀번호를 문자열 confirmpwd에 저장

        boolean result = MemberController.mcontrol.mDelete(confirmpwd);
        //회원컨트롤러에서 confirmpwd라는 매개변수값을 호출하여 boolean타입의 result 변수에 저장
        if (result){System.out.println("탈퇴 성공");return true;}
        //만약에 result의 값이 참이면 회원탈퇴 성공메세지 출력후 true값 반환
        else {System.out.println("탈퇴 실패"); return false;}
        //그게아니면 탈퇴실패 메세지 출력후 return 값 false 반환
    }//mde
    //4. 게시판(게시물 전체출력) 함수
    public void bPrint (){}
    //bprint라는 게시판 출력 함수 선언
} //class end
