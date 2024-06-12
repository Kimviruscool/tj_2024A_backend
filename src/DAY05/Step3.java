package DAY05;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) { //ms

        //[1] 입력객체
        Scanner scanner = new Scanner(System.in);
        /*
        //[1] 입력받은 수 만큼 별 출력
        //자바입력받기
        int star1 = scanner.nextInt();
        System.out.println("star1 = " + star1);
        //2. 입력받은 수 만큼 * 출력
        for(int i = 1 ; i <= star1; i++){
            System.out.println("*");
        }
        //=================구분선===================================================

        //[2]입력받은 수 만큼 별 출력하는데 3의 배수마다 줄바꿈 처리하세요
        System.out.print("[2]별 개수 : ");
        int star2 = scanner.nextInt(); //scanner객체 생성은 {}마다 1번 선언
        System.out.println("star2 = " + star2);
        //2 입력 받은 수 만큼 * 출력 만약의 3의 배수이면 줄바꿈처리
        for(int i = 1; i <= star2;i++){
            System.out.print("*");
            if(i % 3 == 0 ){System.out.println();}
        }
        //구분선 =======================================================================

        //[3] 입력받은 수 만큼 별 하나의 변수에 하나씩 추가후 해당 변수 출력
        System.out.println("[3]별 배수:");
        int star3 = scanner.nextInt();
        String starTotal = "";

        for(int i = 1; i < star3 ; i++){
            starTotal += "*";
        }
        System.out.println("starTotal = " + starTotal);
        */
        //[4]입력받은 줄만큼 아래와 같이 출력하시오
        //만일 5를 입력했으면 5줄 모양의 별 출력
        System.out.print("줄수 입력:");
        int inputLine = scanner.nextInt();
        String html = "";
        //현재 줄수는 1부터 입력받은 줄수 까지 1씩 증가
        for (int currentLine = 1; currentLine<=inputLine ; currentLine++){

            for(int star = 1; star<=currentLine; star++){
                html += "*";
            }
            //줄바꿈
            html += "\n";
        }
        //반복문 종료후 html 변수 출력
        System.out.println(html);

        //[5] 역순
        System.out.print("줄수 입력:");
        int iLine = scanner.nextInt();
        String html1 = "";

        for(int cLine = 1; cLine<=iLine ; cLine++){
            //줄마다 공백출력
            for(int blank = 1; blank <= iLine - cLine ; blank++){
                html1 +=" ";
            }
            //줄마다 별출력
            for(int star1 = 1; star1 <= cLine; star1++){
                html1 += "*";
            }
            //줄마다 줄바꿈
            html1 += "\n";
        }
        System.out.println(html1);


        //[6]뒤집기
        System.out.print("줄수 입력 : ");
        int iLine1 = scanner.nextInt();
        String html2 = "";

        for(int cLine1 = 0; cLine1< iLine1; cLine1++){
            //줄마다 별출력
            for(int star2 = 1; star2 <= iLine1 - cLine1; star2++){
                html2 += "*";
            }
            //줄마다 공백출력
            for(int blank1 = 1; blank1 <= iLine1; blank1++){
                html2 += " ";
            }
            //줄마다 줄바꿈
            html2 += "\n";
        }
        System.out.println(html2);

        //[7]뒤집기 역순
        System.out.print("줄수 입력 : ");
        int iLine2 = scanner.nextInt();
        String html3 = "";

        for(int cLine2 = 0; cLine2<iLine2 ; cLine2++){
            //줄마다 공백출력
            for(int blank = 1; blank <= cLine2; blank++){
                html3 += " ";
            }
            //줄마다 별출력
            for(int star1 = 1; star1 <= iLine2 - cLine2 ; star1++){
                html3 +="*";
            }
            //줄마다 줄바꿈
            html3 += "\n";
        }
        System.out.println(html3);


        //[8] 피라미드
        System.out.print("줄수 입력:");
        int iLine3 = scanner.nextInt();
        String html4 = "";

        for(int cLine = 1; cLine<=iLine3 ; cLine++){
            //줄마다 공백출력
            for(int blank = 1; blank <= iLine3 - cLine ; blank++){
                html4 +=" ";
            }
            //줄마다 별출력
            for(int star1 = 1; star1 <= cLine*2-1; star1++){
                html4 += "*";
            }
            //줄마다 줄바꿈
            html4 += "\n";
        }
        System.out.println(html4);

        //[9] 피라미드 뒤집기
        System.out.print("줄수 입력:");
        int iLine4 = scanner.nextInt();
        String html5 = "";

        for(int cLine = 1; cLine<= iLine4; cLine++){
            //줄마다 공백출력
            for(int blank = 1; blank <= iLine4 - cLine ; blank++){
                html5 +=" ";
            }
            //줄마다 별출력
            for(int star1 = 1; star1 <= cLine*2-1; star1++){
                html5 += "*";
            }
            //줄마다 줄바꿈
            html5 += "\n";
        }
        System.out.println(html5);

    } //me
}
