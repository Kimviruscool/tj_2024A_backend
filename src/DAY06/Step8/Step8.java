package DAY06.Step8;

import java.util.Scanner;

public class Step8 { //cs
    public static void main(String[] args) { //ms

        계산기 c = new 계산기(); //객체 생성
        int result = c.sumMethod1(3 , 5); //객체내 함수 호출 호출시 3, 5
        System.out.println(result);

        int result2 = c.sumMethod2();
        System.out.println(result2);

        //함수호출
        c.sumMethod3();

        //함수호출
        c.sumMethod4(3 , 5);
    } //me
} //ce
