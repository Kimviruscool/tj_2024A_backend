package DAY09.STEP1;

public class Student {
    //1. 멤버변수
        //접근제한자 : public(공개형) , private(비공개형)
        //타입 : 기본자료형 , 참조자료형
        //변수명 : 아무거나(임의)
        //멤버변수 : 객체 생성시 초기화 값이 없으면 정수는 : 0 ,실수는 : 0.0 ,참조타입 : null , boolean : false
        //지역변수 : 쓰레기값(자동 없음)(임의 값)
        //지역변수(함수/메소드 안에서 선언된 변수) , 멤버변수(클래스안 메소드밖에서 선언된 변수)
    public String studentName;
    public int grade;
    public int money;
    
    //2. 생성자
        //객체 생성 할때 객체내 속성(멤버변수)을 초기화 할때
    //주의할점 기본/디폴트 생성자는 클래스내 생성자 정의가 1개라도 존재하지 않을때 자동생성
    //생성자는 메소드와 동일하지만 반환/리턴이 없고 호출 방법이 다르다
    //this : 1.매개변수명과 멤버변수명이 동일할때 멤버변수의 식별용 , 2. 현재 메소드/생성자를 호출한 주체(객체)자
    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    //3. 메서드 : 객체들간의 상호작용/협력, 행위/행동
    public void takeBus(Bus bus){ //Bus 타입 아직 정의하지 않았기 때문에 빨간줄.
        bus.take(1000); //bus에 1000을 대입
        this.money -= 1000; //본인 금액에서 1000을 감소
    }

    public void takeSubway(Subway subway){
        subway.take(1500);
        this.money -= 1500;
    }

    public void takeTaxi(Taxi taxi){
        taxi.take(10000);
        this.money -= 10000;
    }

    //생성 toString()사용
    public void showInfo(){
        System.out.println(studentName + "남의 남은 돈은" + money + "입니다.");
    }

    @Override
    public String toString() { //toString 객체의 멤버변수 확인용.
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", grade=" + grade +
                ", money=" + money +
                '}';
    }

}
