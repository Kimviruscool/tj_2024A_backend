package DAY14.Step4;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass mClass = new MyClass();
        X xclass = mClass;
        xclass.x();

        Y yclass = mClass;
        yclass.y();

        MyInterface iClass = mClass;
        iClass.myMethod();
        iClass.x();
        iClass.y();

    }
}

//해석하기