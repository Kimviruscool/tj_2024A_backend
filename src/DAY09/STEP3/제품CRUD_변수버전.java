package DAY09.STEP3;

import java.util.Scanner;

public class 제품CRUD_변수버전 {
    public static void main(String[] args) { //MS

        Scanner scanner = new Scanner(System.in);

        //제품 메모리 설계
        String a1;
        String a2;
        int a3;

        String b1;
        String b2;
        int b3;

        String c1;
        String c2;
        int c3;

        while (true){
            System.out.println("1.등록(C) 2.출력(R) 3.수정(U) 4.삭제(D) 선택 : "); int ch = scanner.nextInt();
            if (ch == 1){}
            else if (ch == 2){}
            else if (ch == 3){}
            else if (ch == 4){}
            else if (ch == 5){System.out.println("[안내] 프로그램을 종료합니다."); break;}
            else {System.out.println("다시 선택하시오");}
        }

    } //ME
}
