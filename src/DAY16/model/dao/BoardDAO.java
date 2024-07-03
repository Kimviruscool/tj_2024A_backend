package DAY16.model.dao;

import DAY16.model.dto.BoardDTO;
import DAY16.model.dto.ReplyDTO;

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
            String sql = "select * from board b inner join member m on b.mno = m.mno order by bdate desc;";
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
                int binfo = rs.getInt("binfo");
                int bno = rs.getInt("bno");
                int mno = rs.getInt("mno");

                //Dto 만들기
                BoardDTO boardDTO = new BoardDTO(btitle,bcontent,bdate,binfo,bno,mno);
                boardDTO.setMid(rs.getString("mid"));
                //리스트에 dto 담기
                list.add(boardDTO);

                //return list; 하나만 실행된후 종료되기때문에 안됌
            } //we
        }catch(Exception e){System.out.println(e);} return list; //여러개 담긴 DTo의 리스트를 변환
    }

    //6. 개별 출력
    public BoardDTO bView(int ch){
        try{ //예외처리
            //sql작성
            String sql = "select * from board where bno = ?";
            //sql 기재
            ps = conn.prepareStatement(sql);
            //기재된 매개변수 대입
            ps.setInt(1, ch);
            //sql실행 후 결과 반환
            rs = ps.executeQuery();
            //결과에 따른 처리
            if (rs.next()){
                //현재 레코드들의 필드값 각 호출해서 생성자에 매개변수로 대입
                String btitle = rs.getString("btitle");
                String bcontent = rs.getString("bcontent");
                String bdate = rs.getString("bdate");
                int binfo = rs.getInt("binfo");
                int bno = rs.getInt("bno");
                int mno = rs.getInt("mno");

                //Dto 만들기
                BoardDTO boardDTO = new BoardDTO(btitle,bcontent,bdate,binfo,bno,mno);

//                System.out.println(boardDTO); //값들어옴 확인
                return boardDTO;
            }
        }catch (Exception e){System.out.println(e);} return null;
                                                    //오류/게시물 존재하지 않을시 null 반환
    }

    //7. 게시물 작성
    public boolean bWrite(BoardDTO boardDTO){
        try{//예외처리
            //sql작성
            String sql = "insert into board(btitle, bcontent,mno) values (?,?,?)";
            ps = conn.prepareStatement(sql); //기재
            ps.setString(1, boardDTO.getBtitle());
            ps.setString(2, boardDTO.getBcontent());
            ps.setInt(3,boardDTO.getMno());
            int count = ps.executeUpdate(); //sql실행후 결과받기
            if (count == 1 ){ //결과에 따른 처리 //insert 결과 레코드가 1개이면
                return true;
            }
        }catch (Exception e){System.out.println(e);} return false;
    }

    //8. 게시물 삭제
    public boolean bDelete(int bno, int mno){
        try{
            String sql = "delete from board where bno = ? and mno = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,bno);
            ps.setInt(2,mno);
            int counts = ps.executeUpdate();
            if (counts == 1) return true;
        } catch (Exception e){System.out.println(e);} return false;
    }

    //9. 게시물 수정
    public boolean bUpdate(int mno, BoardDTO boardDTO){
        try{//예외처리
            String sql = "update board set btitle = ? , bcontent = ? where mno = ? and bno =?";
            //sql문 생성
            ps = conn.prepareStatement(sql);
            //sql문 기재
            ps.setString(1,boardDTO.getBtitle());
            ps.setString(2,boardDTO.getBcontent());
            ps.setInt(3,mno);
            ps.setInt(4,boardDTO.getBno());
            //값 대입
            int count = ps.executeUpdate();
            if (count == 1)return true;
        } catch (Exception e) {System.out.println(e);} return false;
    }

    //9. 댓글 전체 출력 함수
    public ArrayList<ReplyDTO> rPrint(int bno){
        ArrayList<ReplyDTO> list = new ArrayList<>();
        //여러개 DTo를 담을 리스트
        try{//예외처리
            String sql = "select * from reply r inner join member m on r.mno = m.mno where r.bno = ?";
//                    "select * from board b inner join member m on board.mno = member.mno;";
            ps = conn.prepareStatement(sql);
            //sql문 생성
            ps.setInt(1,bno);
            //sql문 기재
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(2));
                //-rs.get타입(필드명), rs.get타입(필드번호)
                ReplyDTO replyDTO = new ReplyDTO(rs.getString(1),
                        rs.getString(2),rs.getInt(3),
                        rs.getInt(4),rs.getInt(5));

                replyDTO.setMid(rs.getString(6));


            list.add(replyDTO);
            }


        }catch (Exception e){System.out.println(e);} return list;
    }

    //10. 댓글 쓰기 함수
    public boolean rWrite(ReplyDTO replyDTO, int mno){ //rws
        try{
            String sql = "insert into reply(rcontent, mno, bno) values (?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, replyDTO.getRcontent());
            ps.setInt(2,replyDTO.getBno());
            ps.setInt(3,mno);
            int count = ps.executeUpdate();
            if (count == 1) return true;
        }catch (Exception e){System.out.println(e);} return false;
    } //rwe

    //11. 조회수 증가처리
    public boolean viewIncrease(int bno){
        try{
            String sql = "update board set binfo = binfo +1 where bno = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,bno);
            int count = ps.executeUpdate();
            if(count == 1)return true;
        } catch(Exception e){System.out.println(e);} return false;
    }

    //12 .제목 검색 함수
    public ArrayList<BoardDTO> search(String search){
        ArrayList<BoardDTO> list = new ArrayList<>();
        try{
//            String sql = "select * from board where btitle like '%글%' "; [o 직접설정]
//            String sql = "select * from board where btitle like ? "; [? > "%" + search + "%" 사용]
//            String sql = "select * from board where btitle like '%"+ search +"%' "; // [o 연결연산자]
//            String sql = "select * from board where bno like %?% "; [x]
//            String sql = "select * from board where bno like %3% "; [x]
            String sql = "select * from board where btitle like CONCAT('%' , ? , '%')";
            //[o] sql 제공하는 concat [문자열 , 문자열 , 문자열] 연결 함수
            ps = conn.prepareStatement(sql);
//            ps.setString(1,"%" + search + "%"); //[o]
            ps.setString(1,search); //[x]
//            ps.setInt(1,3); //[x]
            rs = ps.executeQuery();
            while(rs.next()){
                String btitle = rs.getString("btitle");
                String bcontent = rs.getString("bcontent");
                String bdate = rs.getString("bdate");
                int binfo = rs.getInt("binfo");
                int bno = rs.getInt("bno");
                int mno = rs.getInt("mno");

                //Dto 만들기
                BoardDTO boardDTO = new BoardDTO(btitle,bcontent,bdate,binfo,bno,mno);
                //리스트에 dto 담기
                list.add(boardDTO);
            }
        } catch (Exception e){System.out.println(e);} return list;
    }
}
