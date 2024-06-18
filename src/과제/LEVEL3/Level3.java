package 과제.LEVEL3;

import java.util.Random;
import java.util.Scanner;

public class Level3 { //cs
    public static void main(String[] args) { //ms

        //3-1
        System.out.println("--------------- for 없이 출력 10회 --------------------");
        System.out.println("안녕하세요1");
        System.out.println("안녕하세요2");
        System.out.println("안녕하세요3");
        System.out.println("안녕하세요4");
        System.out.println("안녕하세요5");
        System.out.println("안녕하세요6");
        System.out.println("안녕하세요7");
        System.out.println("안녕하세요8");
        System.out.println("안녕하세요9");
        System.out.println("안녕하세요10");
        System.out.println("--------------- for 사용해서 출력 10회 --------------------");

        for (int i = 1; i <= 10 ; i ++){
            System.out.println("안녕하세요" + i);
        }

        //3-2
        Scanner scanner = new Scanner(System.in);

        for (int i = 1;; i++){
            System.out.println(i + "회 입력 : "); String data = scanner.next();
            if (data.equals("end")){break;}
        }

        //3-3
        //뒤에 숫자4개를 날리고 "만원추가"

        int july1 = 3532100;
        int july2 = 9123700;
        int july3 = 5183400;
        int july4 = 11738700;




        //3-4
        int sum = 0;

        while (true){
            System.out.println("\ninput : "); int input = scanner.nextInt();
            sum += input;
            for (int i = 0; i < sum; i++){
                System.out.print("■ ");
                }
            if (sum == 0 ){break;}
        }

        //3-5
        String autoNumber = "";

        for (int i = 0; i < 6; i++){
            int random = new Random().nextInt(10);
            autoNumber += random;
        }
        System.out.println("본인확인 인증번호 : " + autoNumber);

        } //me
} //ce
