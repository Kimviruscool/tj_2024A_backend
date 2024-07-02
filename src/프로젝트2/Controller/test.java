package 프로젝트2.Controller;

import java.util.Random;
import java.util.Scanner;

class 캐릭터{
    int hp ;
    int de = 10;
}

class 몬스터 {
    int hp ;
}
public class test {
    public static void main(String[] args) {

        캐릭터 c1 = new 캐릭터();
        c1.hp = 100 ;

        몬스터 m1 = new 몬스터();
        m1.hp = 100;


        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("공격???? 엔터 : 턴 변경 ");
            scan.next();
            System.out.println("내가 공격 했습니다.");
            new aaa().공격( c1 , m1 );
            System.out.println( c1.hp );
            System.out.println("공격 받았습니다.");
            new aaa().피해( m1 , c1 );
            System.out.println( m1.hp );
        }


    }

}
