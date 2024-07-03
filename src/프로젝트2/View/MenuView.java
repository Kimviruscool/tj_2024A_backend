package 프로젝트2.View;

import DAY16.controller.MemberController;
import 프로젝트2.Controller.CharacterController;
import 프로젝트2.Controller.MenuController;
import 프로젝트2.Model.Dto.CharacterDTO;
import 프로젝트2.Model.Dto.SkillDto;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuView {

    public static MenuView mView = new MenuView();

    public Scanner scan = new Scanner(System.in);

    //0 접속 성공 초기화면
    public void index2(){ //is
        while(true){ //ws
            System.out.println("1. 캐릭터정보 2.던전 3.스킬정보 4.종료");
            int ch = scan.nextInt();

            if(ch == 1){charinfo();}
            else if(ch == 2){godungeon();}
            else if(ch == 3){skillinfo();}
            else if(ch == 4){break;}
            else {System.out.println("없는 기능 입니다.");}
        } //we
    } //ie

    //1. 캐릭터 정보 함수
    public void charinfo(){
        ArrayList<CharacterDTO> result = MenuController.MController.charinfo();

        if (result.isEmpty()){
            System.out.println("없는 정보입니다.");
        }else {
            System.out.println("닉네임  HP");
            result.forEach(charinfo ->{
                System.out.printf("%s %d \n" ,charinfo.getCnickname(), charinfo.getChp() );
            });
        }
    }
    //2. 던전 메뉴 이동 함수
    public void godungeon(){

    }
    //3. 스킬정보 함수
    public void skillinfo(){
        ArrayList<SkillDto> result = MenuController.MController.skillinfo();

        if (result.isEmpty()){
            System.out.println("스킬이 없습니다.");
        }else {
            System.out.println();
            result.forEach();
        }
    }
}
