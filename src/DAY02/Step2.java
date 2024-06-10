package DAY02;

public class Step2 {
    public static void main(String[] args) {
        //형변환 : 자료형 변경

        //묵시적 형변환 (자동 형변환) :
        // 1. 메모리 크기가 작은거부터 큰 순으로 단 실수는 표현범위가크기때문에 long뒤에 있다
        // 2. 데이터 손실이 없다.
         //byte > short,char> int > long > float > double
        byte byteValue = 10; //byte 상자에 byteValue 라는 이름으로 변수에 10을 대입/저장. (1byte)
        int intValue = byteValue; // byte > int : 묵시적 형변환 (1바이트) > (4바이트)
        char charValue = '가'; //char (2바이트) 상자에 charValue 이라는 이름으로 변수 '가' 대입/저장
        intValue = charValue; //char(2byte) > int(4byte) : 묵시적 형변환 가능
        intValue = 50;
        long longValue = intValue; // int(4byte) > long(8byte) : 묵시적 형변환
        System.out.println(longValue);

        longValue = 100L;
        float floatValue = longValue; //long(8byte) > float(4byte) : 묵시적 형변환 가능하다 (부동소수점의 표현 단위가 더 정밀해서 변환 가능)
        System.out.println(floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println(doubleValue); //float(4byte) > double(8byte) : 묵시적 형변환 가능

        //연산중에 묵시적 형변환
        //1. byte , short => int
        // 2. int,int => int
        // 3. long,int => long
        // 4. float,float => float
        // 5. float, double => double

        byte b1 = 10;
        byte b2 = 20;
        int result1 = b1 + b2; //result1 자료형은 int이다.
        System.out.println(result1);

        byte b3 = 10;
        long l1 = 100L;
        long result2 = b3+l1; //result 자료형은 long이 된다.
        System.out.println(result2);

        char c1 = 'A'; char c2 = 'B';
        int result3 = c1 + c2;
        System.out.println(result3);

        int i1 = 10;
        double d1 = 4.0;
        double result4 = i1 + d1;
        System.out.println(result4);

        //명시적 형번환 (강제 형 변환) :
        // 1. 메모리 크기가 큰거부터 작은 순으로 변환
        // 2. 데이터의 손실이 있을 수 있다.
        // 3. (변환할자료형)변수명
        //byte < short < int < long < float < double

        int intValue2 = 10;
        byte byteValue2 = (byte)intValue2; //int(4byte) > byte(1byte) 에 저장할수 없어서 (byte)를 사용해 강제형변환
        System.out.println(byteValue2);

        long longValue2= 300;
        int intvalue3 = (int)longValue2; //강제형변환 : 데이터 크기에 따라 데이터의 손실이 있을 수 있음.
        System.out.println(intvalue3);

        int intValue4 = 65;
        char charValue2 = (char)intValue4; //강제 형변환
        System.out.println(charValue2);

        double doubleValue2 = 3.14;
        int intValue5 = (int)doubleValue2; //강제 형변환으로 인해 소수점 아래 (.14)는 손실됨
        System.out.println(intValue5);

        char ch3 = 'A';
        int intValue0 = ch3;

        int ch2 = 67;
        char charValue3 = (char)ch2;

        int a = 10;
        double b = 2.0;
        int c = a + (int)b;
        System.out.println(c);

        char chr1 = '글';
        int int1 = (int)chr1;
        System.out.println(int1);

        int ui = 44544;
        char grl = (char)ui;
        System.out.println(grl);
    }
}
