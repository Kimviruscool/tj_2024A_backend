package DAY16.controller;

import DAY16.model.dao.BoardDAO;
import DAY16.model.dto.BoardDTO;

import java.util.ArrayList;

//패키지 day16에controller사용
public class BoardController {
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
}
