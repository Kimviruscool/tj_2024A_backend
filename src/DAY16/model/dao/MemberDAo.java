package DAY16.model.dao;

import DAY16.model.dto.MemberDTO;

import java.sql.*;
import java.util.ArrayList;

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
    public boolean login(MemberDTO memberDTO){
        try {
            String sql = "select * from member where mid = ? and mpwd = ? ";
            ps = conn.prepareStatement(sql);
            ps.setString(1, memberDTO.getMid());
            ps.setString(2, memberDTO.getMpwd());

            rs = ps.executeQuery(); //쿼리 실행후 결과를 rs로받는다
            //6. 다음레코드 : 로그인 성공시 레코드는 1개 , 실패시 레코드는 0개
            if (rs.next()) {return true;}//다음 레코드가 1개라도 존재하면 로그인 성공
            } catch (Exception e) {System.out.println(e);}
        return false;
    } //le
    //3. 아이디찾기 화면 함수
    public ArrayList<String> findID(String mname , String mphone){
        ArrayList<String> list = new ArrayList<>();

        try {
            String sql = "select * from member where mid = ? and mphone = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,mname);
            ps.setString(2,mphone);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString("mid"));
            }
        } catch (Exception e){System.out.println(e);}
        return list;
    } //fie
    //4. 비밀번호찾기 화면 함수
    public String findPWD(MemberDTO memberDTO) {
        try {
            String sql = "select * from member where mid = ? and mphone = ? ";
            ps.setString(1, memberDTO.getMid());
            ps.setString(2, memberDTO.getMphone());
            rs = ps.executeQuery();
            if (rs.next()) {
                String findpwd = rs.getString("mpwd");
                return findpwd;
            } //해당 레코드의 필드명에 해당하는 필드값을 호출
        } catch (Exception e) {System.out.println(e);}
        return null;
    } //fpe

    //아이디 중복검사
}
