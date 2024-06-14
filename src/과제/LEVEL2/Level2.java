package 과제.LEVEL2;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) { //ms

        //2-1
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("음악 재생 중 종료버튼[x] : ");
            char btn = scanner.next().charAt(0);

            if (btn == 'X' || btn == 'x'){break;}
        }

        //2-2
        System.out.println("숫자 입력 : ");int result = scanner.nextInt();
        if(result == 1){
            System.out.println("회원가입 성공");
        }else if(result == 2){
            System.out.println("사용중인 아이디");
        }else  if(result == 3){
            System.out.println("입력이 안된 정보가 있습니다.");
        }else {
            System.out.println("데이터베이스 오류");}

        //2-3
        int korean = 89;
        int eng = 49;
        int math = 72;



    } // me
}
