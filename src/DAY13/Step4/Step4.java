package DAY13.Step4;

class Parent{
    protected String field1;
    //생성자
    //메소드
    public void method1(){
        System.out.println("Parent.method1"); //soutm
    }
    public void method2(){
        System.out.println("Parent.method2"); //soutm 자동완성
    }

}

class Child extends Parent{
    protected String field2;
    public void method3(){
        System.out.println("Child.method3");
    }
    //오버라이딩 : 상속받은 메소드의 로직 재정의
    @Override
    public void method1() {super.method1();}

    @Override
    public void method2() {super.method2();}
}


public class Step4 {
    public static void main(String[] args) {

        Child child = new Child(); //자식은 부모타입의 메소드를 사용할수 있다.
        child.method1();    //-- child,method1
        child.method2();    //-- child,method2
        System.out.println(child.field1); //null
        System.out.println(child.field2); //null
        child.method3(); //-- child,method3
        //---------------------------------------------------------
        Parent parent = child; //자식타입 > 부모타입 타입변경 (우선순위 오버라이딩)
        parent.method1(); //-- parent.method1
        parent.method2(); //-- parent.method2
        System.out.println(parent.field1); //null
        //--부모타입에서는 자식타입의 메소드,멤버변수를 사용할 수 없다.
//        System.out.println(parent.field2);
//        parent.method3();
        Child child2 = (Child)parent; //자식타입 < 부모타입 형변환
        System.out.println(child2.field2); //null
        child2.method3(); //child.method3
    }
}
