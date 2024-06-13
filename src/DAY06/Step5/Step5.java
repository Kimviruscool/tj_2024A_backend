package DAY06.Step5;

import java.util.Scanner;

public class Step5 {

    public static void main(String[] args) {

        //클래스 사용처 ; 1 . 객체 설계도 2. main함수가 가지고있는 클래스

        //입력 객체 : 키보드로부터 입력받기 위한 기능을 제공하는 객체
        Scanner scanner = new Scanner(System.in);

        Car mycar = new Car();
        mycar.speed = 0;
        mycar.color = "빨강";
        mycar.carNumber = "24거3010";


//        int speed = 0; //속도변수 선언하고 0 으로 초기화
//
        while (true){ //ws
            //출력 함수
            System.out.println("====================================");
            System.out.println("1.증속 2.감속 3.중지 : ");
            //입력 함수를 이용해서 키보드로부터 입력받은 값을 정수형으로 반환해서 변수에 저장
            int ch = scanner.nextInt();
            //제어/ 조건문 사용
            if(ch == 1){mycar.speed++; System.out.println("증속(속도증가) 현재속도 :" + mycar.speed);}
            else if (ch == 2) {mycar.speed--; System.out.println("감속(속도감소) 현재속도 : " + mycar.speed);}
            else if (ch ==3){System.out.println("중지"); mycar.speed = 0; break;}
            else {System.out.println("알수없는 입력입니다.");}

        } //we

    }
}
