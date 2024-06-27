package DAY16.model.dao;

import DAY16.model.dto.MemberDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAo {

    public static MemberDAo mdao = new MemberDAo();

    //0 DB연동
        //-JDBC 인터페이스 3개
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
        //-생성자에 연동 코드
    MemberDAo(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/day06",
                    "root",
                    "1234"
            );
            }
            catch (Exception e){System.out.println("오류 발생 " + e);}
    }

    //1. 회원 화면 함수
    public boolean signup(MemberDTO memberDTO){
        try {
            //1. sql 작성한다.
            String sql = "insert into member (mid , mpwd, mname , mphone) values(? , ? , ? ,? )";
            //2. SQL 기재한다.
            ps = conn.prepareStatement(sql);
            //3. sql 문법 ? 와일드카드 매개변수를 기재한다
            ps.setString(1,memberDTO.getMid()); //setString(?순서 , 값)
            ps.setString(2,memberDTO.getMpwd());
            ps.setString(3,memberDTO.getMname());
            ps.setString(4,memberDTO.getMphone());
            //4. SQL 실행한다. //실행결과
            int count = ps.executeUpdate(); //1개 등록되면 성공 아니면 실패
            if (count == 1){return true;}
            }
        catch (Exception e){System.out.println(e);}
        return false;
    }//se //매개변수 리턴값
    //2. 로그인 화면 함수
    public void login(){} //le
    //3. 아이디찾기 화면 함수
    public void findID(){} //fie
    //4. 비밀번호찾기 화면 함수
    public void findPWD(){} //fpe

}
