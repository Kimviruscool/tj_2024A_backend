package DAY12.Step3;

public class Step2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.speedUp();//함수호출
        car.speedUp();
        System.out.println("car :" + car.speed);
        //System.out.println("car :" + car.power); 부모는 자식의 멤버변수를 사용할수없다.

        SportCar sportcar = new SportCar();
        sportcar.speedUp();
        System.out.println("SportCar : "+ sportcar.speed);
        System.out.println("SportCar : "+ sportcar.power);


        Car car2 = new Car();
        car2.speedUp();
        System.out.println("Car2 : " + car2.speed);
        
        //p.241 참고


    }
}
