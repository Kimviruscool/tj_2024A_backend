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
