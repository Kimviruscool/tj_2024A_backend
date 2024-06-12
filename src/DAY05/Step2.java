//package DAY05;
//
//public class Step2 { //cs
//
//    public static void main(String[] args) { //ms
//
//        //조건문
//        // 판단의 흐름 제어
//
//        //반복문
//        //동일한 실행을 특정조건에 맞게 반복실행(편하려고)
//
//        //1.
//        int num = 1;
//        num += 2;
//        num += 3;
//        num += 4;
//        num += 5;
//        num += 6;
//        num += 7;
//        num += 8;
//        num += 9;
//        num += 10;
//
//        System.out.println("1부터 10까지의 합은 "+num+" 입니다. ");
//
//        int num2 = 1;
//        for(int i = 2 ; i <= 10; i++){ num2 = num2 +i;}
//        System.out.println(num2);
//
//        /*
//            초기값
//        whilie(조건문){
//            실행문;
//            증감식;
//        }
//
//        for(초기값;조건문;증감식){실행문}
//        */
//
//
//        int num3 = 1;
//        int i = 2;
//
//        while (i <= 10){
//            num3 = num3 + i;
//            i++;
//        }
//        System.out.println(num3);
//
//        //무한반복 : 24시간 서비스를 제공할때 끊임없이 돌아가야하는 경우
////        while (true){System.out.println(">>loop<<");}
////        for(;;){System.out.println(">>loop<<");}
//
//        //do while문
//          int num4 = 1;
//          int sum2 = 0;
//
//          do{ sum2 += num4;num4++;}
//          while (num4 <= 10);
//
//        System.out.println("1부터 10까지의 합은" +sum2+ "입니다."); //55
//        //for문
//        sum2= 0;
//        for(int num5 =1; num5 <= 10; num5++){sum2 += num5;}
//        System.out.println(sum2);
//
//        //관례
//            //while : 무한루프 구현할때 while(true){}
//            //do-while : 반드시 한번 이상 수행해야할 때
//            //for : 일반적이다.
//
//        //for문 중첩 p.117
//        for(int dan = 2; dan <= 9 ; dan++){
//            System.out.println("dan = " +dan);
//            for (int times = 1; times <= 9; times++){
//                System.out.println(dan + "X" + times +  "=" + dan*times);
//            }
//        }
//
//        //외부for문 사설
//        for(int dan = 2; dan <= 9 ; dan++){ //os
////            System.out.println("dan = " +dan);
//        //내부 for문
//        for (int times = 1; times <= 9; times++){ //is
//            System.out.printf("%2d * %2d = %2d\n", dan,times,dan*times);
//            } //ie
//        } //oe
//
//        //continue : 반복문 안에서 continue문을 만나면 이후의 문장은 수행하지 않고 for문의 증감식으로 이동
//        //특정 조건에서는 수행하지 않고 건너뛰어야 할때
//        int total = 0;
//        for(int num5 = 1; num5 < 100; num5++){
//            if(num5 % 2 == 0)
//                continue;
//            total += num5;
//        }
//        System.out.println("1부터 100까지의 홀수의 합은" + total + "입니다.");
//
//        //break
//        //예제 : 1부터 1씩증가 하면서 누적합계가 100초과하면 STOP
//        int sum3 = 0;
//        int num5 = 0;
////        for(num5 = 0; sum3 <= 100; num5 ++){
////            sum3 += num5;
////            if(sum3 >= 100)
////                break;
////        }
////        System.out.println("num :" + num5);
////        System.out.println("sum : " + sum3);
//
//        sum3 = 0;
//        for(num5 = 0 ; ; num5++){
//            sum3 += num5;
//            if(sum3 > 100) break;
//        }
//        System.out.println(sum3);
//
//        int num10 = 10;
//        int num02 = 2;
//        char operator = '+';
//
//        switch (operator){
//            case '+' : System.out.println(num10 + num02 + "입니다."); break;
//            case '-' : System.out.println(num10 - num02 + "입니다."); break;
//            case '*' : System.out.println(num10 * num02 + "입니다."); break;
//            case '/' : System.out.println(num10 / num02 + "입니다."); break;
//            default: System.out.println("실행할 수 없습니다.");
//        }
//
////        if(operator == '+'){ System.out.println(num10 + num02 + "입니다.");}
////        else if(operator == '-'){System.out.println(num10 - num02 + "입니다.");}
////        else if(operator == '*'){System.out.println(num10 * num02 + "입니다.");}
////        else if(operator == '/'){System.out.println(num10 / num02 + "입니다.");}
////        else{System.out.println("실행할 수 없습니다.");}
//
//
//        for(int dan1 = 2; dan1 <= 9; dan1++){
//            if(dan1 % 2 == 1)
//                continue;
//            for(int times1 = 1; times1 < 9; times1++){
//                System.out.println(dan1 + "x" + times1 + "=" + dan1*times1 + "입니다");
//            }
//        }
//
//        for(int dan2 = 2; dan2 <=  9; dan2++) {
//            for (int times2 = 1; times2 <= 9; times2++) {
//                if(dan2 <= times2 ){break;}
//                System.out.println(dan2 + "x" + times2 + "=" + dan2 * times2 + "입니다");
//            }
//        }
//        }
//
//    } //me
//
//}//ce
