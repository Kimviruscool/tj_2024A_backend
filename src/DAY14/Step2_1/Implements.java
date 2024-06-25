package DAY14.Step2_1;

public class Implements implements StepInterface {
    //구현 한다고 하고 추상메서드를 구현하지 않아서 override 안해서


    @Override
    public void method1(int a) {System.out.println("Implements.method1");}

    @Override
    public int mehtod2(String a) {System.out.println("Implements.mehtod2"); return 5; }

}
