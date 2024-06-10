package DAY03; //현재 클래스 파일 위치한 패키지

import java.util.Scanner;

public class Step1 { //cs
    public static void main(String[] args) { //ms

        //System.out : 시스템출력 , console : 출력창
        //System.in : 시스템입력 , 키보드

        //[1] 입력 함수 , JS: prompt()
        //입력 객체 만들기
            //1. new Scanner();             Scanner 클래스 : 입력에 관련된 객체 생성
            //2. new Scanner(System.in);    System.in 입력장치는 키보드
            //3. Scanner Scan = new Scanner(System.in); | Scanner 타입으로 변수에 생셩된 입력객체를 저장한다.
            //4. 입력객체의 메소드를 이용한 입력값 받아오기.
        /*
            1. .next() : 키보드입력받은 바이트/잘 를 문자열(String) 타입으로 반환
            2. .nextaLine() : next()동일하되
                next() : 입력 문자열에 띄어쓰기가 존재하면 짤림
                nextLine() : 띄어쓰기 포함된 문자열도 입력받기 가능
                    - nextLine()위에 입력관련 메소드가 존재하면 하나로 취급
                    -개행[엔터] 기준으로 마침 처리,next()+ nextLine() : 하나로 취급
                    -해결 방안
                    의미없는 NextLine을 두 메소드 사이에 추가한다.

        */
        Scanner scan = new Scanner(System.in);

        //1.
        //scan.next(); //1. 입력
        String str1 = scan.next();  //2. 저장 //띄어쓰기X
        System.out.println(str1);   //3. 출력

        //2.
        scan.nextLine(); //의미 없는 입력메소드
        String str2 = scan.nextLine(); //띄어쓰기포함
        System.out.println(str2);

        //3. 논리
        Boolean b1 = scan.nextBoolean();
        System.out.println(b1);

        //4. 바이트 : 허용범위내 입력 , 허용범위 외 입력시 오류
        byte bt1 = scan.nextByte();
        System.out.println(bt1);

        short sh1 = scan.nextShort();
        System.out.println(sh1);

        int in1 = scan.nextInt();
        System.out.println(in1);

        long long1 = scan.nextLong();
        System.out.println(long1);

        float float1 = scan.nextFloat();
        System.out.println(float1);

        double double1 = scan.nextDouble();
        System.out.println(double1);


    } //me
} //ce
