package DAY14.Step2_1;

public class Step2 {
    public static void main(String[] args) {
        //인터페이스 타입의 변수 선언
        StepInterface si;
        //인터페이스는 스스로 객체 인스턴스 생성 불가능
            //{ } 구현 안한 메소드가 있으니까 > 추상메소드
        //implements를 해준 클래스가 필요하다.
        //implements 한 클래스로 객체 생성한다. > 구현(객)체
        new Implements(); //<--- (인터페이스를 구현된 클래스)객체
        si = new Implements();

        si.method1(3);
        si.mehtod2("JAVA");
        si.method3(3);
        si.method4("A");
        StepInterface.method5(3); //static 객체없이 사용하는 멤버들 (객체 필요없어서)
        StepInterface.method6("BB");
//        si.method7(3); //private 이므로 외부 클래스 사용불가능
//        si.method8("CCC");
//        si.method9(3); //private 이므로 외부 클래스 사용불가능
//        si.method10("DDDD");

        System.out.println(StepInterface.value);


    } //me
}
