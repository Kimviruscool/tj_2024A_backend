package 프로젝트2.View;

import java.util.Scanner;

public class MenuView {

    public static MenuView mView = new MenuView();

    public Scanner scan = new Scanner(System.in);

    //0 접속 성공 초기화면
    public void index2(){ //is
        while(true){ //ws
            System.out.println("1. 캐릭터정보 2.던전 3.상점 4.종료");
            int ch = scan.nextInt();

            if(ch == 1){}
            else if(ch == 2){}
            else if(ch == 3){}
            else if(ch == 4){break;}
            else {System.out.println("없는 기능 입니다.");}
        } //we
    } //ie

    //1. 캐릭터 정보 함수
    //2. 던전 메뉴 이동 함수
    //3. 상점 이동 함수
}
