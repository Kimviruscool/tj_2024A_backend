package DAY16.model.dao;
//패키지 day16패키지에 model패키지에 dao클래스 사용
import DAY16.model.dto.MemberDTO;
//day16패키지에 모델 패키지에 dto패키지에 MemberDTO클래스 호출
import java.sql.*;
//java패키지에 sql패키지에 모든클래스 호출
import java.util.ArrayList;
//java패키지에 util패키지에 ArrayList 클래스 호출
public class MemberDAo { //cs
//MemberDAo 공개형 클래스 생성
    public static MemberDAo mdao = new MemberDAo();
//mdao 라는 MemberDAo 클래스를 사용하는 공개형 객체 생성
    //0 DB연동
        //-JDBC 인터페이스 3개
    Connection conn;
    //Connection 함수 conn 선언
    PreparedStatement ps;
    //PreparedStatement 함수 ps 선언
    ResultSet rs;
    //ResultSet 함수 rs 선언
        //-생성자에 연동 코드
    MemberDAo(){ //mDs
        //MemberDAo함수 선언
        try { //ts
            //예외처리 발생 확인 구역 선언
            Class.forName("com.mysql.cj.jdbc.Driver");
            //mysql 연결 드라이브 설정
            conn = DriverManager.getConnection( //cs
                    //연결 드라이브메매니저에 연결하기
                    "jdbc:mysql://localhost:3306/day06",
                    //주소는 내가 연결하고 싶은 mysql 의 지정 경로
                    "root",
                    //사용자 이름
                    "1234"
                    //비밀번호
            ); //ce
            } //te
            catch (Exception e){System.out.println("오류 발생 " + e);}
        //예외처리 발생 확인 Exception으로 모든 예외처리 캐치 후 e 지역변수에 저장
        //시스템 출력 e로 발생한 예외처리 확인
    } //mDe

    //1. 회원 화면 함수
    public boolean signup(MemberDTO memberDTO){ //ss
        //공개형 boolean타입의 매개변수가 지정된 회원가입 함수 선언
        try { //ts
            //예외처리 구역 설정

            //1. sql 작성한다.
            String sql = "insert into member (mid , mpwd, mname , mphone) values(? , ? , ? ,? )";
            //문자열 sql변수 에 "insert into member (mid , mpwd, mname , mphone) values(? , ? , ? ,? )" 선언
            //2. SQL 기재한다.
            ps = conn.prepareStatement(sql);
            //작성한 sql문을 연결후 기재하기

            //3. sql 문법 ? 와일드카드 매개변수를 기재한다
            ps.setString(1,memberDTO.getMid()); //setString(?순서 , 값)
            //slq문법의 ? 와일카드 값 설정 1번째 와일드카드의 값을 memberdto의mid을 가져와 대입
            ps.setString(2,memberDTO.getMpwd());
            //slq문법의 ? 와일카드 값 설정 2번째 와일드카드의 값을 memberdto의pwd을 가져와 대입
            ps.setString(3,memberDTO.getMname());
            //slq문법의 ? 와일카드 값 설정 3번째 와일드카드의 값을 memberdto의mname을 가져와 대입
            ps.setString(4,memberDTO.getMphone());
            //slq문법의 ? 와일카드 값 설정 4번째 와일드카드의 값을 memberdto의mphone을 가져와 대입
            //4. SQL 실행한다. //실행결과
            int count = ps.executeUpdate(); //최신화/수정 후 값을 count에 저장
            // 1개 등록되면 성공 아니면 실패
            if (count == 1){return true;}
            } //te
        catch (Exception e){System.out.println(e);}
        //예외처리 발생 확인 구역 Exception 으로 모든예외처리 e지역변수로 예외처리결과 저장
        //시스템 출력 e로 예외처리 결과 출력/확인
        return false;
        //반환값 false 반환.
    }//se //매개변수 리턴값
    //2. 로그인 화면 함수 : 로그인 성공한 회원번호 반환
    public int login(MemberDTO memberDTO){ //ls
        //공개형 정수타입 함수를 매개변수를 받아 선언
        try { //ts
            //예외처리 구역 설정
            String sql = "select * from member where mid = ? and mpwd = ? ";
            //문자열 sql변수 에 "select * from member where mid = ? and mpwd = ?" 선언
            ps = conn.prepareStatement(sql);
            //sql에 저장된 문자를 기재
            ps.setString(1, memberDTO.getMid());
            //sql문법의 ?와일드카드 설정 1번째 에 MEMBERDTO에 있는 MID를 가져와 대입.
            ps.setString(2, memberDTO.getMpwd());
            //sql문법의 ?와일드카드 설정 1번째 에 MEMBERDTO에 있는 MPWD를 가져와 대입.
            rs = ps.executeQuery(); //쿼리 실행후 결과를 rs로받는다
            //SELECT가 사용되어서 query 사용
            //6. 다음레코드 : 로그인 성공시 레코드는 1개 , 실패시 레코드는 0개
            if (rs.next()) {return rs.getInt("mno");}//다음 레코드가 1개라도 존재하면 로그인 성공
            }//te
        catch (Exception e) {System.out.println(e);}//예외처리 캐치후 e라는 지역변수에 대입 시스템출력 e를 대입하여 예외처리 결과 확인
        return 0;
        //반환값 0 을 반환
    } //le
    //3. 아이디찾기 화면 함수
    public ArrayList<String> findID(String mname , String mphone){ //fis
        //공개형 String배열타입의 finded함수를 매개변수를 대입해서 생성
        ArrayList<String> list = new ArrayList<>();
        //문자열배열 타입의 LIST 객체 생성

        try {
            //예외처리 확인 구역 선언
            String sql = "select * from member where mid = ? and mphone = ?";
            //문자열타입의 sql변수 지정후 "select * from member where mid = ? and mphone = ?" 대입
            ps = conn.prepareStatement(sql);
            //sql값을 연결후 기재
            ps.setString(1,mname);
            //기재된 와일드카드의 1번째 값을 mname선언
            ps.setString(2,mphone);
            //기재된 와일드카드의 2번째 값을 mphone선언
            rs = ps.executeQuery();
            //쿼리 실행후 값을 rs에 저장 //select사용되서 query 사용
            while (rs.next()) { //다음레코드가 1이라도 존재하면 list배열에 mid값 추가
                list.add(rs.getString("mid"));
            }
        } catch (Exception e){System.out.println(e);} //예외처리 발생시 Exception 으로 캐치후 e 변수에 대입 이후 예외처리발생결과 확인
        return list; //레코드가 존재하지 않으면 그냥 list만 반환.
    } //fie
    //4. 비밀번호찾기 화면 함수
    public String findPWD(MemberDTO memberDTO) { //fps
        //공개형 문자열타입의 비밀번호찾기 함수를 매개변수를 받아 생성
        try {
            //예외처리 구역 선언
            String sql = "select * from member where mid = ? and mphone = ? ";
            //문자열 sql변수를 선언하여 select * from member where mid = ? and mphone = ?  대입
            ps.setString(1, memberDTO.getMid());
            //기재된 와일드카드 지정 1번째 와일드카드에 memberDTO에 mid값을 get으로 호출대입
            ps.setString(2, memberDTO.getMphone());
            //기재된 와일드카드 2번째 에값에 memberDTO에 mphone값을 get을 사용하여 호출대입
            rs = ps.executeQuery();
            //쿼리 실행 후 값을 rs에 저장
            if (rs.next()) {
                //만약에 re값이 1이라도 존재하면 다음
                String findpwd = rs.getString("mpwd");
                //문자열타입 findpwd변수에 mpwd값을 호출하여 대입
                return findpwd;
                //값이 존재하지않으면 비어있는 findpwd값 반환.
            } //해당 레코드의 필드명에 해당하는 필드값을 호출
        } catch (Exception e) {System.out.println(e);}
        //예외처리를 Exception으로 모두 캐치하여 e변수에 대입후 출력하여 발생한 예외처리 확인
        return null;
        //반환값 null반환.
    } //fpe

    //5. 회원탈퇴 함수
    public boolean mDelete (String confirmpwd , int loginMno){ //mus
        //공개형 boolean타입 의 매개변수를 설정하여 mdelete 함수 선언
        try{ //ts
            //예외처리 구역 설정
            String sql = "delete from member where mno = ? and mpwd = ?;";
            //문자열타입의 sql변수 지정후 "delete from member where mno = ? and mpwd = ?;" 대입
            ps = conn.prepareStatement(sql);
            //sql을 기재
            ps.setInt(1,loginMno);
            //기재된 sql의 와일드카드 설정 1번째,loginMno값 지정
            ps.setString(2,confirmpwd);
            //기재된 sql의 와일드카드 지정 2번째,cofirmpwd값 지정
            int count = ps.executeUpdate();
            //등록된 sql의 값이 1이라도 존재하면 int count에 대입
            if (count == 1){return true;}
            //만약에 count 의 값이 1과 같으면 true값 반환
        } //te
        catch (Exception e){System.out.println(e);} return false;
        //예외처리 Exception으로 캐치후 e변수에 대입 이후 시스템 출력을 통해 예외처리 값 확인
        //count의 값이 존재하지않으면 false값 반환.

    }
    //2. 회원수정 함수
    public boolean mUpdate (String newname,String newnum, int loginMno){
        //boolean 타입의 mupdate를 매개변수를 대입하여 함수 생성
        try {//ts
            //예외처리 구역 설정
            String sql = "update member set mname = ?, mphone = ? where mno = ?;";
            //문자열타입의 sql변수 지정후 "update member set mname = ?, mphone = ? where mno = ?;" 대입
            ps = conn.prepareStatement(sql);
            //sql문 기재
            ps.setString(1,newname);
            //기재된 sql문의 와일드카드 설정 1번째 newname값 대입
            ps.setString(2,newnum);
            //기재된 sql문의 와일드카드 설정 2번째 newnum값 대입
            ps.setInt(3,loginMno);
            //기재된 sql문의 와일드카드 설정 3번째 loginMno값 대입
            int count = ps.executeUpdate();
            //sql문 Db저장 업데이트 하여 1이라도 있으면 int count 변수에 저장
            if (count == 1 ){return true;}
            //만약에 count 에 값이 1이면 true값 반환

        }//te
        catch (Exception e){System.out.println(e);} return false;
        //예외처리 Exception로 잡아서 e변수에 대입후 시스템출력 e변수로 발생한 예외처리확인
        //값이 존재하지않으면 false값을 반환.
    } //mue

    //아이디 중복검사
} //ce
