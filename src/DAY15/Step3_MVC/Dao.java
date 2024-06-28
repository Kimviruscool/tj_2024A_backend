package DAY15.Step3_MVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Dao {
    //DB와 연동해서 받은 DB의 sql처리후 결과를 cotroller에게 전달하는 역할
    //외부클래스로부터 내부 메소드를 사용할 수 있도록 만든 static변수
    static Dao dao = new Dao();
    //1. 멤버 변수
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    //2. 생성자
    Dao(){ //연동 코드
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day05", "root", "1234");
        } catch (Exception e) {System.out.println("연동실패" + e);}
    }
    //각 기능별 함수 구현

    //1. 등록SQL 함수 , 매개변수 : 저장할 값(String) 리턴 : 등록성공 여부 boolean(true or false)
    public boolean signupCon(String name){
        try {
            String sql = "insert into table1 values('" + name + "')";
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            return true;
            }
        catch (Exception e){System.out.println(e);}
        return false;
    }

    //2. 출력sql 함수 , 매개변수 : X  리턴 : 회원목록 ArrayList<String>
    public ArrayList<String> printCon() {
        ArrayList<String> List = new ArrayList<>(); //리스트 (깡통) 선언

        try {
            String sql = "select * from table1";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) { //레코드 하나씩 호출
                List.add(rs.getString("name")); //현재 레코드의 name필드 값을 호출하여 리스트에 저장
            }
        } catch (Exception e) {System.out.println(e);}
        return List;
    }

    //3. 수정sql 함수, 매개변수 : 기존이름,새로운이름 리턴 : 성공여부 boolean (true or false)
    public boolean updateCon(String oldName , String newName){
        try {
            String sql = "update table1 set name = '" + newName + "' where name = '" + oldName + "';";
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            return true;
            }
        catch (Exception e){System.out.println(e);} return false;
        }

    //4. 삭제sql 함수 매개변수 : 삭제할 이름(String) 리턴 : 성공여부 boolean (true or false)
    public boolean deleteCon(String name){
    try {
        String sql = "delete from table1 where name = '" + name + "';";
        ps = conn.prepareStatement(sql);
        ps.executeUpdate();
        return true;
        }
    catch (Exception e) {System.out.println(e);} return false;
    }

} //ce
