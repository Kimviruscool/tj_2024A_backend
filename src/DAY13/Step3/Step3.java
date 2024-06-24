package DAY13.Step3;

class 상위클래스 {
    protected int value1;
    public 상위클래스(){value1 = 100;}
    public void showSuperValue(){
        System.out.println("[상위]value1 = " + value1);
    }
}

class 하위클래스 extends 상위클래스{
    protected int value1;   //하위클래스와 상위클래스내 멤버변수명이 동일하다.
    protected int value2;

    public 하위클래스(){super(); value1= 1000; value2 =2000;}

    public void showSubValue(){
        System.out.println("[하위]value1 : " + value1 + "," + this.value1 +","+ super.value1);
        super.showSuperValue();
        showSuperValue();
        this.showSuperValue();
        //해석 : 
        //this ? : 매개변수와 멤버변수간의 이름이 동일할때 식별하기위해
        //super : 상위 멤버변수와 하위 멤버변수간의 이름이 동일할 때 식별하기위해 ,상위클래스의 멤버변수 호출할때 사용
    }
}

public class Step3 {
    public static void main(String[] args) {

        하위클래스 하위객체 = new 하위클래스();
        하위객체.showSuperValue();
        하위객체.showSubValue();

    }
}
