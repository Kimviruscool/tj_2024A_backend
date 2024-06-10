package DAY01;

public class Step3 { //class s

    public static void main(String[] args) { //main s

        //1.정수 : 자료형
        byte b1 = -128;
        System.out.println("b1 : " +b1);
        byte b2 = 127;
        System.out.println("b2 : " +b2); //soutv + 엔터
        //byte b3 = 200; 불가능 저장가능한 허용범위를 벗어남
        
        // short : -32768 ~ 32767 대략 +-3만정도
        short s1 = 32000; //main e 
        System.out.println("s1 = " + s1);
        short s2 = -32000;
        System.out.println("s2 = " + s2);
        // short s3 = 40000; : 저장 가능한 허용범위를 벗어남 .

        // int : 대략 +- 21억정도 w
        //자바에서 모든 정수값을 기존 int로 받음
        int i1 = 2147483647;
        System.out.println("i1 = " + i1);
        int i2 = -210000000;
        System.out.println("i2 = " + i2);
        // int i3 = 2200000000; : 저장 가능한 허용범위를 벗어남

        // long : 2의 63승 : 대략 21억이상은 자료 뒤에 L/l 을 붙여야함.
        long l1 = 2147480000L;
        System.out.println("l1 = " + l1);

        //문자자료형 , 문자 1개 ''사용 65536개표현가능

        char c1 = 'A';
        System.out.println(c1);
        
        int i3 = 'A';
        System.out.println(i3);

        char c2 = '가';
        System.out.println(c2);

        int i4 = '가';
        System.out.println(i4);

        // char c3 = '안녕'; : 문자열X 불가능 문자만가능

        //String : 기본자료형이 아닌 클래스를 사용하므로 첫글자를 대문자로 String
        //문장은 String 사용
        String str1 = "안녕하세요";
        System.out.println(str1);

        //boolean : 논리자료형 true , false
        boolean bol1 = true;
        boolean bol2 = false;
        System.out.println(bol1);
        System.out.println(bol2);
        //boolean bol4 = t; 허용범위 벗어남

        //실수 자료형
        //double :
        double d1 = 1.12345678901234567890123456789; //소수점 17자리까지만 표현 가능 자바 모든 실수 값을 int로 취급
        System.out.println(d1);
        float f1 = 1.23456789012345678901234567890123456789f; //뒤에다가 F/f 사용해서 구분
        System.out.println(f1);



} //class e
}