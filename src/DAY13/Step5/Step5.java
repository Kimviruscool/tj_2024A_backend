package DAY13.Step5;

class Car {
    //멤버변수 생성
    Tire tire;
    //생성자
    //메소드
    public void run(){this.tire.roll();} //지정된 객체 Car의 맞는 tire의 roll(메소드/기능) 출력
}

class Tire{
    //멤버변수
    //생성자
    //메소드
    public void roll(){
        System.out.println("일반 타이어가 회전합니다.");
    }
}

class HankookTire extends Tire {
    //멤버변수
    //생성자
    //메소드
    @Override
    public void roll() {
        System.out.println("한국 타이어가 회전합니다.");
    }
}

class KumhoTire extends Tire {
    //멤버변수
    //생성자
    //메소드
    @Override //덮어씌우기
    public void roll() {
        System.out.println("금호 타이어가 회전합니다.");
    }
}


public class Step5 {
    public static void main(String[] args) {

        Car myCar = new Car();

        Car yourCar = new Car();
        yourCar.tire = new Tire();
        yourCar.run();

        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
        yourCar.run();

        System.out.println(myCar.tire instanceof KumhoTire);
        if (myCar.tire instanceof Tire){
            myCar.tire = new HankookTire();
        }
        myCar.run();
    }
}


/*

해석
1. 차 클래스를 생성 멤버변수로 타이어 , 메소드로 run(멤버변수tire를.roll()(다른 클래스의 메소드))을 추가.
2. 타이어 클래스를 생성 메소드로 roll() , print를 추가.
3. 타이어 클래스를 상속하는 한국타이어를 생성
4. 타이어 클래스를 상속하는 금호타이어를 생성
/////////////////////////////////////////////////
5. mycar 객채를 생성
6. yourcar 객채를 생성 후 yourcar객체 안의 tire객체를 생성 yourcar.run시 "기본타이어가 회전합니다." 출력
7. mycar 객체에 tire객체를 생성 mycar.run시 "기본타이어가 회전합니다." 출력
8. mycar 객체에 tire 상속 받는 한국타이어 객체를 생성 mycar.run시 "한국타이어가 회전합니다" 출력 //상위클래스보다 본인클래스를 우선시함
9. mycar 객체에 tire 상속 받는 금호타이어 객체를 생성 mycar.run시 "금호타이어가 회전합니다."출력
    yourcar객체는 변함 없이 tire만 포함되어있어 "기본타이어가 회전합니다." 출력
10. System.out.println(myCar.tire instanceof KumhoTire); 시 mycar객체의 tire에는 override로 금호타이어 , 타이어어 타입이 포함되어있기때문에 true 출력
11. if(mycar.tire 객체에 tire 가 포함되어있기때문에){mycar.tire 객체에 한국타이어 객체 생성}
12. mycar.run 출력시 "한국타이어가 회전합니다." 출력.

*/