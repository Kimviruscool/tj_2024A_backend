package DAY12.Step3;

public class Car {
    //1. 멤버변수
    public int speed;

    //2. 생성자

    //3. 메소드
    public void speedUp(){this.speed+=1;}
    public void stop(){this.speed = 0;}
}

class SportCar extends Car { //extends : 상속(상위클래스를 하위클래스에 연장)
    //- 사용하는이유? 빠른개발 : 기존에 있던 설계도/클래스 를 물려받아서 커스텀 해서 새로운 설계도/클래스 를 제작
    public int power;
}