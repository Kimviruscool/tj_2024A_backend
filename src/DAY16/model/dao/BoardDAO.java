package DAY16.model.dao;

import DAY16.model.dto.BoardDTO;

import java.sql.*;
import java.util.ArrayList;


//패키지 day16에 모델패키지에 dao패키지 사용
public class BoardDAO {
    //공개형 class boardDao생성
    //================ 싱글톤 객체 생성
    private static BoardDAO bDao = new BoardDAO();
    private BoardDAO(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/day06",
                    "root","1234"
            );
        }
        catch (Exception e){System.out.println(e);}
    }
    public static BoardDAO getInstance(){return bDao;}
    //=================== 싱글톤

    // --- JDBC 인터페이스
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;


    //4. 게시판(전체 게시물 출력) 함수 //매개변수 X 리턴값 : 여러개 게시물 > 여러개 레코드 > 여러개 DTO > arraylist
    public ArrayList<BoardDTO> bPrint (){
        // - 여러개 DTO 담을 리스트 선언
        ArrayList<BoardDTO> list = new ArrayList<>();

        try{
            //예외처리
            String sql = "select * from board;";
            //1 . 기재
            ps = conn.prepareStatement(sql);
            //기재된 sql실행 하고 결과 반환
            rs = ps.executeQuery(); //3. 기재된 sql 실행 결과를 rs에 대입
            //4. 결과 전체를 레코드 하나씩 순회하기
            while(rs.next()){ //ws
                //rs.next 다음레코드로 이동 , 존재하면 true , 없으면 false
                //--- 레코드 1개당 DTO 1개

                //rs.getstring : 현재 레코드의 해당 필드명 값 호출
                String btitle = rs.getString("btitle");
                String bcontent = rs.getString("bcontent");
                String bdate = rs.getString("bdate");
                String binfo = rs.getString("binfo");
                int bno = rs.getInt("bno");
                int mno = rs.getInt("mno");

                //Dto 만들기
                BoardDTO boardDTO = new BoardDTO(btitle,bcontent,bdate,binfo,bno,mno);

                //리스트에 dto 담기
                list.add(boardDTO);

                //return list; 하나만 실행된후 종료되기때문에 안됌
            } //we
        }catch(Exception e){System.out.println(e);} return list; //여러개 담긴 DTo의 리스트를 변환
    }
}
