package DAY16.controller;

import DAY16.model.dao.MemberDAo;
import DAY16.model.dto.MemberDTO;

import java.util.ArrayList;

public class MemberController {
    //0.
    public static MemberController mcontrol = new MemberController();

    //1. 회원 화면 함수
    public boolean signup(MemberDTO memberDTO){
        System.out.println("MemberController.signup");
        boolean result = MemberDAo.mdao.signup(memberDTO);
        return result;
    }//se //매개변수 : 아이디 , 비밀번호 , 이름 , 전화번호  리턴값 : 성공여부 bool
    //2. 로그인 화면 함수
    public boolean login(MemberDTO memberDTO){
        return MemberDAo.mdao.login(memberDTO);
    } //le //매개변수 : 아이디 , 비밀번호 리턴값 : 성공여부 bool
    //3. 아이디찾기 화면 함수
    public ArrayList<String> findID(String mname, String mphone){
        System.out.println("MemberController.findID");
        ArrayList<String> result = MemberDAo.mdao.findID(mname,mphone);
        return result;
    } //fie //매개변수 : 이름 , 전화번호 리턴값 : 아이디
    //4. 비밀번호찾기 화면 함수
    public String findPWD(MemberDTO memberDTO){
        return MemberDAo.mdao.findPWD(memberDTO);
    } //fpe //매개변수 : 아이디 , 이름 , 전화번호 리턴값 : 비밀번호

}
