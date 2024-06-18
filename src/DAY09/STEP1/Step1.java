package DAY09.STEP1;

public class Step1 {
    public static void main(String[] args) { //ms
        //[1]학생 객체 2명 생성
        Student studentJames = new Student("James",5000);
        Student studentTomas = new Student("Tomas",10000);
        //[4] p.180 택시 타는 과정 구현하기
        Student studentEdward = new Student("Edward",20000);
        
        //[2] 버스 1대 객체 생성
        Bus bus100 = new Bus(100);
        studentJames.takeBus(bus100);
        System.out.println(studentJames);
        System.out.println(bus100);

        //[3] 지하철 1대 객체 생성
        Subway subwayGreen = new Subway("2호선");
        studentTomas.takeSubway(subwayGreen);
        studentTomas.showInfo();
        subwayGreen.showInfo();

        System.out.println(studentTomas);
        System.out.println(subwayGreen);

        //[4] p.180 택시 타는 과정 구현하기
        Taxi taxi1 = new Taxi("카카오택시");
        studentEdward.takeTaxi(taxi1);
        System.out.println(studentEdward);
        System.out.println(taxi1);


    } //me
}
