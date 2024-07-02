package 프로젝트2.Controller;

import 프로젝트2.Model.Dao.CharacterDAO;
import 프로젝트2.Model.Dto.CharacterDTO;

public class CharacterController {
    public static CharacterController cController = new CharacterController();

    //1. 캐릭터생성함수
    public boolean createChar(CharacterDTO characterDTO){
        boolean result = CharacterDAO.characterDAO.createChar(characterDTO);
        return result;
    }

    //2-1 접속X상태함수
    public int nowJoin = 0;
    public void outGame(){nowJoin = 0;}

    //2. 캐릭터 접속함수
    public boolean joinGame(CharacterDTO characterDTO){
        boolean result = CharacterDAO.characterDAO.joinGame(characterDTO);
        return result;
    }
    //3. 캐릭터삭제함수
    public boolean delChar(int bno){
        //로그인 정보번호 받아와서 저장
        return CharacterDAO.characterDAO.delChar(bno);
    }
}
