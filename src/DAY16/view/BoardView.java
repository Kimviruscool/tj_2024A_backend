package DAY16.view;
//DAY16패키지 view패키지 안내
import DAY16.controller.BoardController;
import DAY16.controller.MemberController;
import DAY16.model.dto.BoardDTO;
import DAY16.model.dto.MemberDTO;
import DAY16.model.dto.ReplyDTO;
//DAY16에 controller 패키지에 MemberController 호출
import java.util.ArrayList;
import java.util.Scanner;
//java패키지에 util패키지에 Scanner 호출
public class BoardView { //cs
    //BoardView 클래스 생성
    //0.
    public static BoardView bview = new BoardView();
    //모두 사용한 패키지로 Boradview클래스에 bview로 객채 생성
    public Scanner scan = new Scanner(System.in);
    //공개형으로 Scanner 패키지에 scan객체 생성

    //0. 로그인 성공시 초기화면
    public void index2(){
    //로그인 성공시 초기화면 구성
        while(true){
            //반복문 선언
            System.out.printf(">>1. 로그아웃 2.회원수정 3.회원탈퇴 4.게시판 : ");
            //각숫자별 기능을 하는 안내문 출력
            int ch = scan.nextInt();
            //입력한 값을 저장할수있게 int타입에 ch변수 선언
            if(ch == 1){logout(); return ;}
            //만약에 ch가 1이면 ? 로그아웃 기능후 반환하여 MemberView 화면으로 이동
            else if(ch == 2){ //2s
                //그게아니고 만약 ch2면?
                if (mUpdate()){
                    //만약 mUpdate에 받아온 값이 참이면
                     logout(); return;}
                //로그아웃 기능 후 MemberView페이지로 이동
            } //2e

            else if(ch == 3){//3s
                //그게아니고 만약에 ch가 3이면?
                if (mDelete()){//만약에 mDelete의 값이 true이면
                    logout(); return;}
                //로그아웃 기능후 MemberView화면으로 이동
            }//4e
            else if(ch == 4){bPrint();}
            //그게아니고 만약 ch4면 ? bPrint기능 실행
            else {System.out.printf("기능 할수 없는 번호입니다.");}
            //그것도 아니면 기능을 할수 없는 번호라고 안내문 출력

        } //while end
    } //main end

    //1. 로그아웃 함수
    public void logout (){ //ls
        //로그아웃 함수 구현 시작
        //회원 컨트롤러에 로그아웃 메소드 호출
        MemberController.mcontrol.logout();
        System.out.println("로그아웃 성공 (초기메뉴로 이동)");
        //로그아웃 성공 후 안내메세지 출력
    } //le
    //2. 회원수정 함수
    public boolean mUpdate (){ //us
        //boolean타입의 회원수정함수선언
        System.out.println("[수정] 수정할 이름 : ");
        //수정할 이름을 입력하는 안내문 출력
        String newname = scan.next();
        //newname에 입력받은 새이름값 저장
        System.out.println("[수정] 수정할 전화번호 : ");
        //수정할 전화번호를 입력받는 안내문 출력후
        String newnum = scan.next();
        //newnum에 입력받을 새 전화번호값 저장

        boolean result = MemberController.mcontrol.mUpdate(newname , newnum);
        //회원컨트롤러에서 newname과 newnum의 매개변수값을 호출하여 그값을 boolean타입의 result변수에 저장
        if (result){System.out.println("수정이 완료되었습니다."); return true;}
        //만약에 result가 참이면 수정완료 메세지 안내후 true/참 값을 반환
        else {System.out.println("수정 실패");return false;}
        //그게 아니면 수정 실패 메세지 안내후 반환값 false/거짓 을 반환
    } //ue
    //3. 회원탈퇴 함수
    public boolean mDelete (){ //mds
        //boolean타입의 회원탈퇴 함수 선언
        System.out.println("[탈퇴] 비밀번호 입력 : ");
        //탈퇴 비밀번호 입력 안내메세지 출력
        String confirmpwd = scan.next();
        //입력받은 비밀번호를 문자열 confirmpwd에 저장

        boolean result = MemberController.mcontrol.mDelete(confirmpwd);
        //회원컨트롤러에서 confirmpwd라는 매개변수값을 호출하여 boolean타입의 result 변수에 저장
        if (result){System.out.println("탈퇴 성공");return true;}
        //만약에 result의 값이 참이면 회원탈퇴 성공메세지 출력후 true값 반환
        else {System.out.println("탈퇴 실패"); return false;}
        //그게아니면 탈퇴실패 메세지 출력후 return 값 false 반환
    }//mde
    //4. 게시판(게시물 전체출력) 함수
    public void bPrint (){
        //컨트롤러에게 전체 게시물 조회 요청
        ArrayList<BoardDTO> result = BoardController.getInstance().bPrint();

        System.out.println(result);

        System.out.println("번호\t조회수\t작성일\t\t\t\t제목\t작성자");
        result.forEach(dto -> { //리스트객체명.forEach(반복변수 -> {실행문;})
            //리스트내 전체 dto 를 하나씩 반복변수에 대입 반복
            System.out.printf("%2d\t%10s\t%10s\t%s\t%s \n", dto.getBno(),dto.getBinfo(), dto.getBdate(),dto.getBtitle(),dto.getMid());
        });
        System.out.println("-1, 검색 0. 글쓰기 : 1~ : 개별글조회 : "); int ch = scan.nextInt();
        if (ch == -1){search();}
        else if (ch == 0){bWrite();}
        else if (ch >= 1){bView(ch);}
    }
    //bprint라는 게시판 출력 함수 선언
    // 모든글출력
    //매개변수 : X 리턴 : 전체 게시물(boardDTO(arrayList))
    //개별출력
    //매개변수 : 개별 게시물번호 리턴 : BoradDTO 한개
    //이유 : 글 1개당 레코드 1개 dto1개 모든글 dto여러개 > arraylist<dto>

    //12 .제목 검색 함수
    public void search(){
        System.out.println("찾을 제목 입력 : "); String search = scan.next();

        ArrayList<BoardDTO> result = BoardController.getInstance().search(search);

        System.out.println(result);

        System.out.println("번호\t조회수\t작성일\t\t\t\t제목\t작성자");
        result.forEach(dto -> { //리스트객체명.forEach(반복변수 -> {실행문;})
            //리스트내 전체 dto 를 하나씩 반복변수에 대입 반복
            System.out.printf("%2d\t%10s\t%10s\t%s\t%s \n", dto.getBno(),dto.getBinfo(), dto.getBdate(),dto.getBtitle(),dto.getMid());
        });

    }

    //5. 게시물 쓰기함수
    public void bWrite(){
        //1. 입력받기
        System.out.println("글 제목 입력 : "); String title = scan.next();
        System.out.println("글 내용 입력 : "); String content = scan.next();
        //2. 객체화 //입력받은 값들을 각 객체의 매개변수에 대입
        BoardDTO boardDTO = new BoardDTO();

        boardDTO.setBtitle(title);
        boardDTO.setBcontent(content);
        //3. 입력받은 객체를 컨트롤에게 전달후 결과 응답 받기
        boolean result = BoardController.getInstance().bWrite(boardDTO);
        if (result){
            System.out.println("글작성 성공");
        }else {
            System.out.println("글작성 실패");
        }

    }
    //6. 게시물 개별조회 함수
    public void bView(int ch){
        //-매개변수로 받은 선택받은 게시물의 번호를 컨트롤 에게 전달 후 해당 게시물 정보 받기
        BoardDTO result = BoardController.getInstance().bView(ch);

        if (result == null){
            System.out.println("존재하지 않는 게시물");
            return;
        }
        System.out.println("제목 : " + result.getBtitle());
        System.out.println("작성자 : " + result.getBcontent());
        System.out.println("작성일 : " + result.getBdate());
        System.out.println("조회수 : "+ result.getBinfo());
        System.out.println("bno : " + result.getBno());
        System.out.println("mno : " + result.getMno());
        //-----------댓글 출력 ------------//
        rPrint(ch);
        //--------------------------------//
        System.out.println(">> 1. 삭제  2. 수정 3. 댓글쓰기 4.뒤로가기 : ");
        int ch1 = scan.nextInt();
        if (ch1 == 1){bDelete(ch);}
        else if(ch1 ==2 ){bUpdate(ch);}
        else if(ch1 == 3){rWrite(ch);}
        else if(ch1 == 4){bPrint();}
    }
    //7. 게시물 삭제 함수 : 로그인한 회원과 작성자가 일치하면 삭제처리
    public void bDelete(int bno){
        boolean result = BoardController.getInstance().bDelete(bno);
        if(result){System.out.println("삭제 성공");}
        else {System.out.println("삭제 실패");}
    }
    //8. 게시물 수정 함수
    public void bUpdate(int bno){
        System.out.println("새 제목 입력 : "); String newTitle = scan.next();
        System.out.println("새 내용 입력 : "); String newContent = scan.next();

        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setBtitle(newTitle);
        boardDTO.setBcontent(newContent);
        boardDTO.setBno(bno);

        boolean result = BoardController.getInstance().bUpdate(boardDTO);

        if (result){System.out.println("수정 성공");}
        else {System.out.println("수정 실패");}
    }
    //9. 댓글 전체 출력 함수
    public void rPrint(int bno){
        ArrayList<ReplyDTO> result =
        BoardController.getInstance().rPrint(bno);

        //리스트객체명.forEach(반복변수 > 실행문)
        //리스트내 요소들을 순환
        result.forEach(reply -> {
            System.out.printf("%s %s %s \n",reply.getRcontent(), reply.getRdatet(), reply.getMid());
        });
    }

    //10. 댓글 쓰기 함수
    public void rWrite(int bno){

        //만약에 코드  상황상 로그인후 댓글쓰기가 아니였다면
        //로그인 상태 확인후 댓글 쓰기 진행
        if (!MemberController.mcontrol.loginState()){
            System.out.println("로그인후 사용가능합니다");
            return;
        }
        System.out.println("댓글 내용 입력 : "); String rwrite = scan.next();

        ReplyDTO replyDTO = new ReplyDTO();
        replyDTO.setBno(bno);
        replyDTO.setRcontent(rwrite);
        boolean result = BoardController.getInstance().rWrite(replyDTO);

        if(result) {System.out.println("등록성공");}
        else {System.out.println("등록 실패");}
    }

    //11. 조회수 증가 처리

} //class end
