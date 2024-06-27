package DAY16.view;

import DAY16.controller.MemberController;
import DAY16.model.dto.MemberDTO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MemberView {

    // 해당 클래스의 함수들을 다른 클래스에서 호출 할수 있도록 static 변수에 객체
    public static MemberView mview = new MemberView();

    //멤버변수 : 입력객체
    Scanner scan = new Scanner(System.in);

    //0초기화면 함수
    public void index(){
        while(true){
            System.out.println("1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기 : ");
            try {
                int ch = scan.nextInt();
                if(ch == 1){signup();}
                else if (ch == 2){login();}
                else if (ch == 3){findID();}
                else if (ch == 4){findPWD();}
                else {System.out.println("없는 기능 번호입니다.");}
                }
                catch (InputMismatchException e){
                System.out.println("잘못된 입력이 있습니다 . 초기메뉴로" + e);
                scan = new Scanner(System.in);
            } //c end
        } // w end
    } //m end

    //1. 회원 화면 함수
    public void signup(){
        System.out.println("회원가입 페이지");
        //1. 입력
        System.out.println("아이디 입력 : "); String mID = scan.next();
        System.out.println("비밀번호 입력 : "); String mPWD = scan.next();
        System.out.println("이름 입력 : "); String mName = scan.next();
        System.out.println("전화번호 입력 : "); String mPhone = scan.next();
        //2. 유효성검사
        //3. 객체화
        MemberDTO memberDTO = new MemberDTO(mID, mPWD, mName, mPhone);
        //4. Controll에게 전달
        boolean result = MemberController.mcontrol.signup(memberDTO);

        if (result){System.out.println("회원가입 성공");}
        else {System.out.println("회원가입 실패");}

    }//se //매개변수 : 아이디 , 비밀번호 , 이름 , 전화번호  리턴값 : 성공여부 bool
    //2. 로그인 화면 함수
    public void login(){} //le //매개변수 : 아이디 , 비밀번호 리턴값 : 성공여부 bool
    //3. 아이디찾기 화면 함수
    public void findID(){} //fie //매개변수 : 이름 , 전화번호 리턴값 : 아이디
    //4. 비밀번호찾기 화면 함수
    public void findPWD(){} //fpe //매개변수 : 아이디 , 이름 , 전화번호 리턴값 : 비밀번호
}
