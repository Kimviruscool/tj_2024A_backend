package DAY15.Step1;

public class Step2 {
    public static void main(String[] args) {

        //[1] static 메소드 호출하는 방법
        try {method1();} catch (ClassNotFoundException e){
            System.out.println("해당 함수에서 예외가 발생");
        }
        //static 함수가 아니라서. ??
        // main함수가 static이므로 우선할당 되서 실행되는데 그때 method1 메소드를 모른다.


        //[2] static 메소드를 호출하는 방법
        //[2-1]
        //Step2 step2 = new Step2(); //힙영역에 주소를 지역변수에 저장하고
        //step2.method1(); //지역변수에 있는 힙영역에 접근해서 메소드 호출
        //[2-2]
        //new Step2().method1(); //지역변수가 없이 바로 힙영역으로 메소드호출
    }

    static void method1() throws ClassNotFoundException{
    //void method1(){
        //예외 [해당 함수를 호출했던 곳으로 - return 과 비슷]던지기 , 떠넘기기
        Class.forName("java.lang.String2");
        //1. 직접 처리할지 : try{}catch(){}
        //2. 떠넘기기 : throws
    }
}
