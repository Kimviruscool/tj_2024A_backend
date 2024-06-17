package 과제.LEVEL2;

import java.util.Random;
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

        int total = korean+eng+math;
        float pg = (korean+eng+math)/3;

        boolean x3 = total % 3 == 0;
        boolean x8 = total % 8 == 0;

        String hj = total % 2 == 0 ? "짝수" : "홀수";
        String result1 = total == 65 ? "합격" : "불합격";


        System.out.println("----------------------------------------------------------------- \n국어    영어    수학    합계    평균    3배수    8배수    홀짝    결과");
        System.out.printf("%d     %d     %d     %d    %.0f    %b     %b     %s     %s \n", korean , eng, math, total , pg, x3, x8 , hj, result1);

        //2-4

        int random = new Random().nextInt(3);

        if (random == 1){System.out.printf("가위");}
        else if(random ==  2){System.out.printf("바위");}
        else if(random == 3){System.out.printf("보");}

        System.out.println("가위 바위 보 선택 : "); String player = scanner.next();

        String computer = "";
        if (random == 0){computer = "가위";}
        else if(random ==  1){computer = "바위";}
        else if(random == 2){computer = "보";}

        System.out.printf("comran ) %s \n", computer);

        if (player.equals("가위")){
            if (computer.equals("보")){System.out.println("result player 승리");}
            else if(computer.equals("바위")){System.out.println("result com 승리");}
            else {System.out.println("비겼습니다.");}
        }

        if (player.equals("바위")){
            if (computer.equals("가위")){System.out.println("result player 승리");}
            else if(computer.equals("보")){System.out.println("result com 승리");}
            else {System.out.println("비겼습니다.");}
        }

        if (player.equals("보")){
            if (computer.equals("바위")){System.out.println("result player 승리");}
            else if(computer.equals("가위")){System.out.println("result com 승리");}
            else {System.out.println("비겼습니다.");}
        }




    } // me
}
