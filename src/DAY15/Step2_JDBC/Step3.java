package DAY15.Step2_JDBC;


import java.sql.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {

        //DB연동
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day05", "root", "1234");
        } catch (Exception e) {System.out.println("연동실패" + e);}

        Scanner scanner = new Scanner(System.in);

       // ArrayList<String> nameList = new ArrayList<>(); //여러개 String(문자열)을 저장하는 리스트 객체
        
        while (true){
            System.out.println("1. 이름등록 2. 출력 3. 수정 4. 삭제 5.종료 :  ");
            try {
                int ch = scanner.nextInt();
                if(ch ==1){
                    //1. 입력받고
                    System.out.println("[저장] 이름 : "); String name = scanner.next();
                    //2. DB저장
                    String sql = "insert into table1 values('"+name+"')";
                    System.out.println(sql);
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.executeUpdate();
                }
                else if(ch ==2){
                    //2. DB SQL 레코드 전체 검색 : select * from table1
                    String sql = "select * from table1";
                    PreparedStatement/**/ ps = conn.prepareStatement(sql);/*변수명.준비*/
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        System.out.println(rs.getString("name"));
                    }
                }
                else if(ch ==3){
                    System.out.println("[수정] 기존이름 : "); String oldName = scanner.next();
                    System.out.println("[수정] 새로울이름 : "); String newName = scanner.next();

                    String sql = "update table1 set name = '"+newName+"' where name = '"+oldName+"';";
                    System.out.println(sql);
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.executeUpdate();
                }
                else if(ch ==4){
                    System.out.println("[삭제] 이름 : "); String name = scanner.next();
                    //2. DB SQL 레코드 삭제
                    String sql = "delete from table1 where name = '"+name+"';";
                    System.out.println(sql);
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.executeUpdate();
                }
                else if(ch ==5){break;}
                else{
                    System.err.println(">> 없는 기능 번호 입니다.");
                }

            } catch (InputMismatchException e) {
                System.out.println(">> 잘못된 입력입니다.");
                scanner = new Scanner(System.in); //잘못입력받은 값을 가지고 있는 객체를 초기화
            } catch (SQLException e) {System.out.println("SQL 구문이 틀렸습니다" + e);}
        }

    } //me
}
