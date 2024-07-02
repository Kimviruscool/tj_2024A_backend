package DAY16.controller;

import DAY16.model.dao.BoardDAO;
import DAY16.model.dto.BoardDTO;
import DAY16.model.dto.ReplyDTO;

import java.util.ArrayList;

//패키지 day16에controller사용
public class BoardController { //cs
//공개형 클래스 boardcontroller사용

    //===================싱글톤 만들기 =============================//
    //싱글톤 : 프로그램내 해당 클래스의 하나의 객체만 갖는 패턴
    //1. static 변수에 해당 클래스의 객체 생성해서 대입, private으로
    private static BoardController bController = new BoardController();
    //2. 해당 클래스의 생성자를 private 한다. 다른 클래스에서 new 사용하지 못하게
    private BoardController(){}
    //3. 해당 객체(싱글톤) 를 외부로 부터 접근할 수 있도록 간접 호출 메소드
    public static BoardController getInstance(){return bController;}
    //=============================================================//

    public ArrayList<BoardDTO> bPrint() {
        //다오 에게 전체 게시물 조회 요청 후 결과를 반환
        return BoardDAO.getInstance().bPrint();
    }

    //6 . 개별 출력
    public BoardDTO bView(int ch){
        return BoardDAO.getInstance().bView(ch);
    }

    //7. 게시물 작성
    public boolean bWrite(BoardDTO boardDTO){
        //현재 로그인 된 회원번호를 대입하자
        //- 매개변수로 전달받은 boardDTO에 현재 로그인된 회원번호를 대입
        boardDTO.setMno(MemberController.mcontrol.loginMno);
        //-(제목,내용,작성자번호)를 DAO에게 전달후 결과 받기.
        return BoardDAO.getInstance().bWrite(boardDTO);

    }

    //8. 게시물 삭제
    public boolean bDelete(int bno){
        int mno = MemberController.mcontrol.loginMno;
        return BoardDAO.getInstance().bDelete(bno, mno);
    }

    //9. 게시물 수정
    public boolean bUpdate(BoardDTO boardDTO){
        int mno = MemberController.mcontrol.loginMno;
        return BoardDAO.getInstance().bUpdate(mno, boardDTO);
    }

    //9. 댓글 전체 출력 함수
    public ArrayList<ReplyDTO> rPrint(int bno){
        return BoardDAO.getInstance().rPrint(bno);
    }

    //10. 댓글 쓰기 함수
    public void rWrite(){}

    } //ce

