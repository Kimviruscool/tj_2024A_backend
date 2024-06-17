package 과제.LEVEL1;

import java.util.Scanner;

public class LEVEL {

    public static void main(String[] args) {

        //1-1
        boolean a1 = true;
        byte a2 = 100;
        char a3 = 'A';
        short a4 = 30000;
        int a5 = 2000000000;
        long a6 = 4000000000L;
        float a7 = 3.1231232f;
        double a8 = 3.123123123;

        System.out.println(">> Level1_1 answer >>");
        System.out.println("boolean : " + a1);
        System.out.println("byte : " + a2);
        System.out.println("char : " + a3);
        System.out.println("short : " + a4);
        System.out.println("int : " + a5);
        System.out.println("long : " + a6);
        System.out.println("float : " + a7);
        System.out.println("double : " + a8);

        //1-2
        System.out.printf(">> Level1_2 answer >>");
        System.out.println("type     value                            range");
        System.out.println("-----------------------------------------------");
        System.out.printf("boolean     %b                  true or false\n" , a1);
        System.out.printf("byte       %d                       -128 ~ 127 \n", a2);
        System.out.printf("char       %c               0~6535 [character 1] \n", a3);
        System.out.printf("short      %d                 -32768 ~ 32767 \n", a4);
        System.out.printf("int        %d            -+2000 million \n", a5);
        System.out.printf("long       %d     -+2000 million Excess \n", a6);
        System.out.printf("float      %.3f               8 decimal places \n", a7);
        System.out.printf("double     %.8f         17 decimal places \n", a8);

        //1-3
        Scanner scanner = new Scanner(System.in);
//        System.out.println(">> Level1_3 answer >>");
//        System.out.print("input boolean : "); scanner.nextBoolean();
//        System.out.print("input byte : "); scanner.nextByte();
//        System.out.print("input char : "); scanner.next();
//        System.out.print("input short : "); scanner.nextShort();
//        System.out.print("input int : "); scanner.nextInt();
//        System.out.print("input long : "); scanner.nextLong();
//        System.out.print("input float : "); scanner.nextFloat();
//        System.out.print("input double : "); scanner.nextDouble();
//        System.out.println("input boolean : true");
//        System.out.println("input byte : 100");
//        System.out.println("input char : 'B' ");
//        System.out.println("input short : 30000");
//        System.out.println("input int : 200000000");
//        System.out.println("input long : 200000000");
//        System.out.println("input float : 3.12312312");
//        System.out.println("input double : 3.123123123123");

        //1-4
        System.out.println(">> Level1_4 answer >>");
        System.out.print("         ,r'\"7\nr`-_   ,'  ,/\n \\. \". L_r'\n   `~\\/\n      |\n      | \n");

        //1-5
        System.out.println(">> Level1_5 answer >>");
        byte b1 = 100;
        short b2 = 30000;
        int b3 = 200000000;
        long b4 = 40000000000l;
        float b5 = 3.12312316894531259875698756f;

        System.out.println(">> Level1_5 answer >>");
        System.out.println("byte -> short : "+ (short)b1);
        System.out.println("short -> int : " + ((int)b2));
        System.out.println("int -> long : " + (long)b3);
        System.out.println("long -> float : " + (float)b4);
        System.out.println("float -> double : " + (double)b5);

        //1-6
        short c1 = 48;
        int c2 = -27648;
        long c3 = 13452946336l;
        float c4 = 3f;
        double c5 = 3.1231232;

        System.out.println(">> Level1_6 answer >>");
        System.out.println("byte <- short : "+ (byte)c1);
        System.out.println("short <- int : "+ (short)c2);
        System.out.println("int <- long : "+ (int)c3);
        System.out.println("long <- float : " + (long)c4);
        System.out.println("float <- double : " + (float)c5);

        //1-7

//        System.out.println(">> Level1_7 answer >>");
//        System.out.println("회원명 String : " ); String name = scanner.next();
//        System.out.println("상태 boolean : "); boolean bl = scanner.nextBoolean();
//        System.out.println("회원번호 byte : "); byte num = scanner.nextByte();
//        System.out.println("성별 Char : "); char sex = scanner.next().charAt(0);
//        System.out.println("나이 short : "); short age = scanner.nextShort();
//        System.out.println("포인트 int : "); int point = scanner.nextInt();
//        System.out.println("예금액 long : "); long money = scanner.nextLong();
//        System.out.println("키 float : "); float height = scanner.nextFloat();
//        System.out.println("몸무게 double : "); double weight = scanner.nextDouble();
//
//        System.out.println("==========회원 개인정보==========");
//        System.out.println("|         회원명:" + name + "      |");
//        System.out.println("|         회원명:" + b1 + "        |");
//        System.out.println("|         회원명:" + num + "       |");
//        System.out.println("|         회원명:" + sex + "       |");
//        System.out.println("|         회원명:" + age + "       |");
//        System.out.println("|         회원명:" + point + "     |");
//        System.out.println("|         회원명:" + money + "     |");
//        System.out.println("|         회원명:" + height + "    |");
//        System.out.println("|         회원명:" + weight + "    |");
//        System.out.println("=================================");

        //1-8
        System.out.println(">> Level1_8 answer >>");
//

          String header = "\n==========방문록==========\n번호 \t 작성자 \t 방문록\n";
          String boardList = "";
          String footer = "============================";
          String output = "";

        System.out.printf("[1]작성자 : ");output += scanner.next();
        System.out.printf("[1]방문록 : ");boardList += scanner.next();
        int number = 1;

        System.out.println(header);
        System.out.printf("%d       %s    %s \n", number,output,boardList);
        System.out.println(footer);

        System.out.printf("[2]작성자 : ");output += scanner.next();
        System.out.printf("[2]방문록 : ");boardList += scanner.next();

        System.out.println(header);
        System.out.printf("%d       %s    %s \n", number,output,boardList);
        System.out.printf("%d       %s    %s \n", number,output,boardList);
        System.out.println(footer);

        System.out.printf("[3]작성자 : ");output += scanner.next();
        System.out.printf("[3]방문록 : ");boardList += scanner.next();

        System.out.println(header);
        System.out.printf("%d       %s    %s \n", number,output,boardList);
        System.out.printf("%d       %s    %s \n", number,output,boardList);
        System.out.printf("%d       %s    %s \n", number,output,boardList);
        System.out.println(footer);

        System.out.printf("[4]작성자 : ");output += scanner.next();
        System.out.printf("[4]방문록 : ");boardList += scanner.next();

        System.out.println(header);
        System.out.printf("%d       %s    %s \n", number,output,boardList);
        System.out.printf("%d       %s    %s \n", number,output,boardList);
        System.out.printf("%d       %s    %s \n", number,output,boardList);
        System.out.printf("%d       %s    %s \n", number,output,boardList);
        System.out.println(footer);

        System.out.printf("[5]작성자 : ");output += scanner.next();
        System.out.printf("[5]방문록 : ");boardList += scanner.next();

        System.out.println(header);
        System.out.printf("%d       %s    %s \n", number,output,boardList);
        System.out.printf("%d       %s    %s \n", number,output,boardList);
        System.out.printf("%d       %s    %s \n", number,output,boardList);
        System.out.printf("%d       %s    %s \n", number,output,boardList);
        System.out.printf("%d       %s    %s \n", number,output,boardList);
        System.out.println(footer);
    }
}
