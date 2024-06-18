package 과제.LEVL4;

public class Level4 {//cs

    public static void main(String[] args) { //ms

    //4-1
        //1. 객체란? : 속성과 메소드를 실체화 되게 표현한 것
        //2. 클래스란? : 객체에 설계도 (서로다른 타입과 메서드 의 집합)
        //3. 멤버변수 / 필드 / 속성 / 특성 이란? : 클래스의 안에서 선언된 변수
        //4. 지역변수와 멤버변수의 차이점 : 지역변수는 함수안에서 선언되는 변수이고 멤버변수는 클래스 안에서만 선언되는 변수이다.

    //4-2
        방문록 p1 = new 방문록();
        p1.number = 1;
        p1.content = "안녕하세요";
        p1.day = "2024-06-17";
        p1.writer = "김병찬";

        방문록 p2 = new 방문록();
        p2.number = 2;
        p2.content = "뭐야";
        p2.day = "2024-06-18";
        p2.writer = "김찬병";

        System.out.print(p1.number + "    " + p1.content + "    " + p1.day + "    " + p1.writer + "\n");
        System.out.print(p2.number + "    " + p2.content + "    " + p2.day + "    " + p2.writer + "\n");

    //4-3
        회원 h1 = new 회원();
        h1.memnum = 1;
        h1.id = "kim";
        h1.pw = "pw";
        h1.name = "김병찬";

        회원 h2 = new 회원();
        h2.memnum = 2;
        h2.id = "bye";
        h2.pw = "pw1";
        h2.name = "김찬병";

        System.out.print(h1.memnum + "    " + h1.id + "    " + h1.pw + "    " + h1.name + "\n");
        System.out.print(h2.memnum + "    " + h2.id + "    " + h2.pw + "    " + h2.name + "\n");

    //4-4
        제품 j1 = new 제품(1,"감자",3000,"2024-06-17");
        제품 j2 = new 제품(2,"고구마",8000,"2024-06-16");

        System.out.println(j1.code + "     " + j1.name + "     " + j1.price + "     " + j1.day);
        System.out.println(j2.code + "     " + j2.name + "     " + j2.price + "     " + j2.day);

    } //me
} //ce
