package DAY08;

public class 복습 {
    public static void main(String[] args) {
        String name = "유재석";
        int age = 40;

        회원 m1 = new 회원();
        m1.name = "유재석";
        m1.age = 40;

        //1. 배열저장방법
        String[]names = new String[100];
        int[] ages = new int[100];
//2. 배열저장방법
        회원[] members = new 회원[100];

        게시판 b1 = new 게시판();
        //new 옆에 클래스명과 동일하면 생성자 > 게시판();
        b1.번호 = 1;
        b1.제목 = "안녕하세요";
        //vs
        //게시판 b2 = new 게시판("안녕하세요" , 2);
            //선언된 생성자와 우리가 생성자 대입한 타입이 불일치라서 오류남
        게시판 b3 = new 게시판(3,"안녕못해요");
            // -
        제품 p1 = new 제품();
        p1.구매함수();
        //왜?? 메소드 호출하면 안되는지? : X안됌
        //메소드란? 여러개 실행문;/로직을 묶음의 행위(행동) 주체가 필요
        //배열 : 데이터/자료 묶음
        //함수 : 로직묶음
        //주체 ? : 나 // 객체 : 내가아닌 다른모든것
        // 약속/규칙:
        int result1 = p1.환불함수("코카콜라");

        //pubic (공개)(다른클래스 사용가능) vs private(비공개)(다른 클래스 사용불가능)
            // -현재 클래스 기준의 다른 클래스로부터 공개여부
            // - 관례적으로 멤버변수는 private 사용

        //p1.제품번호 = "사이다";
        //오류이유 : 제품번호 멤버변수는 private 라서 접근 불가능.

        //getter and setter 활용하자 , 멤버변수가 private 일때.
        //입력
        p1.set제품명("사이다");
        //출력


    }
}
