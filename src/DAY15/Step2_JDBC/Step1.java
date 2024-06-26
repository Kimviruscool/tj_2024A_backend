package DAY15.Step2_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Step1 {
    public static void main(String[] args) {

        //1.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 여기서 오류발생시 : 현재 프로젝트에 라이브러리가 제대로 등록 안될때
            System.out.println("<< JDBC 드라이버 호출 성공 >>");

            //2.
            Connection conn; //인터페이스 타입의 변수 선언
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day05","root","1234");
            System.out.println("<< DB 연동 성공 >>");
        } catch (Exception e){
            System.out.println("JDBC 연동 실패 " + e);
        }
    } //me
}
/*
    각 DBMS회사별 구현클래스 제공


                                             - MYSQL - mysql-connector-j-8.4.0.jar
자바 JDBC인터페이스 제공                      - Oracle - ojdbc6.jar
                                             - 등 각 회사별 구현 클ㄹ내스가 있는 라이브러리 파일 필요

    JDBC : JAVA DATA BASE CONNECT : 자바 데이터베이스 연동

    - JDBC 관련 클래스/인터페이스 라이브러리 설치 /세팅
    1. https://dev.mysql.com/downloads/connector/j/
    2. platform indepedent선택
    3. 압출풀기 mysql-connector-j-8.4.0.jar
    4. 해당 프로젝트 내 폴더로 이동
        -src - > dataBase > mysql-connector-j-8.4.0.jar
    5. jar 오른쪽 클릭 > 메뉴 하단에 라이브러리 추가
    6. [확인] 인텔리제이 상단 메뉴> 파일 > 프로젝트구조 > 프로젝트 세팅 > 라이브러리

    -연동코드
    1. Class.forName("com.mysql.cj.jdbc.Driver"); : (JDBC)드라이버 클래스 호출
        MYSQL : com.mysql.cj.jdbc.Driver
        ORACLE : oracle.jdbc.OracleDriver
    2. 연동
    DriverManager.getConnection("연동할DB서버주소 (파일위치)" , "아이디", "비밀번호" );
        -DB SERVER URL : jdbc:mysql : ip주소 : port번호/DB명
        - 로컬PC기준 : jdbc:mysql : localhost:3306 /DB명
        - 계정명 : 로컬사용시 기본값 : root
        - 비밀번호 : (임의) 1234
        *연동 성공시 연동성공한 정보를 가진 객체를 반환, 해당 연동객체를 가지고 DML(db) 조작

    - Connection 인터페이스 : DB와 연동 성공한 객체 정보를 가지고 조작/기능/메소드 제공 하는 인터페이스명
    - 추상메소드
    - PreparedStatement : 반환,업데이트준비
    - prepareStatement :
    - excuteUpdate : 최신화
    -excuteQuery : select문의 문법을 시행하고 결과를result로 반환 해주는 함수

         -내부 구조
            ResultSet [null] --- .next() --->[첫번째 레코드]
            -예시]
                [name 필드]
                신동엽   39
                하하     42
                유재석   79
                1. ResultSet   .next()  ---> 첫번째 레코드 [name 필드]신동엽 [age]39    -- , getString("name") --> 신동엽
                2. ResultSet   .next()  ---> 두번째 레코드 [name 필드]하하             -- , getString("name") --> 하하
                3. ResultSet   .next()  ---> 세번째 레코드 [name 필드]유재석            -- , getInt("age") --> 39
                4. ResultSet   .next()  ---> 없음. false                  , while(rs.next()){}
*/
