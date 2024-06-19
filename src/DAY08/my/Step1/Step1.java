package DAY08.Step1;

import java.util.Arrays;

public class Step1 {
    public static void main(String[] args) {

        //1. int형 10개를 저장할 수 있는 배열 선언과 동시에 초기화
        int[] num = new int[]{1,2,3,4,5,6,7,8,9,10};
            // - [1][2][3][4][5][6][7][8][9][10]

        //Arrays.toString(배열변수) : 현재 배열내 요소들을 출력
        System.out.println(Arrays.toString(num));

        int[] num2 = new int[10];
            // - [0][0][0][0][0][0][0][0][0][0]

        System.out.println(Arrays.toString(num2));

        int num3;
//        System.out.println(num3);

        //지역변수 맴버변수차이점
        //함수안에서 쓰는것 : 지역변수
            //초기값 : x 개발자가 선언시 값을 대입 안했을때 쓰레기 값이 들어감
        //class 안에서 객체에 속성을 넣어줄때 : 맴버변수
            //개발자가 선언시 값을 대입 안했을때 자동 초기값 들어감
            //-정수 : 0 , 실수 0.0, 논리 : false , 객체 : null

        //[배열내 요소 하나씩 출력]
        int sum = 0;
        for (int i = 0; i < num.length ; i++){
            System.out.println(num[i]);
            sum += num[i];
        }
        System.out.println("203p 하단 1분복습 결과 : " + sum);

        //p.206 문자 여러개를 저장하는 문자 배열 만들기 ==>  문자열만들기
        //String 클래스 이해 도움
        char[] alphabets = new char[26];
        char ch = 'A';

        for (int i = 0 ; i < alphabets.length; i++){
            alphabets[i] = ch;
            ch++;
        }
        System.out.println(Arrays.toString(alphabets));

        for (int i = 0; i < alphabets.length; i++){
            System.out.println(alphabets[i] + "," + (int)alphabets[i]);
        }

    }
        }

