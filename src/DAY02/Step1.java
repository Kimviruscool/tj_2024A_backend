package DAY02; //현재 클래스 파일이 위치한 패키지/폴더명

public class Step1 { //class start
    //main 엔터 : main 함수 // 실행할 코드는 모두 main 함수에 작성한다.
    //지역변수 정의, 함수 호출
    public static void main(String[] args) { //main Start

        //p : 61 : 상수 : 변하지 않는 수 vs 변수 : 변하는 수
        //final 예약어/키워드

        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0;

        //soutv + 엔터 : 가장 가까운 변수의 출력 함수 자동완성 해준다
        
        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        //코드 실행 : 1. ctrl+shift+F10
        //2. MAIN 함수 왼쪽에 초록색 실행 화살표 클릭
        //MAX_NUM = 1000; //오류 발생 : 상수 이므로 수정이 불가능함.


    } //main End
} //class end
