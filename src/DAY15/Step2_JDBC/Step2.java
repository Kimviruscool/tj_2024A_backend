package DAY15.Step2_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Step2 {
    public static void main(String[] args) {
        //1.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day05","root","1234");

            String sql = "insert into table1 values('유재석')"; //sql문
            //(SQL) 기재 준비하다. prepareStatement() : sql을 문자열로 매개변수로 전달, 해당 sql을 조작할 수 있는 구현채 반환
            PreparedStatement ps = conn.prepareStatement(sql);
            // prepare : 준비 Statement : 기재
            ps.executeUpdate(); //excute : 실행하다 update : 최신화

            sql = "insert into table1 values('강호동')";
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e){
            System.out.println("JDBC 연동 실패 " + e);
        }
    }
}
