package DAY15.Step3_MVC;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    //주로 scanner와 prit사용해서 메소드를 이용한 입출력
    static View view = new View(); //객체 생성
    //외브클래스로부터 내부 메소드를 사용할 수 있도록 만든 static 변수
    Scanner scanner = new Scanner(System.in);

    public void mainView() {
        System.out.println("==== 메인화면 ====");
        while (true) {
            try {
                System.out.println("1. 이름등록 2. 출력 3. 수정 4. 삭제 5.종료 :  ");
                int ch = scanner.nextInt();
                if (ch == 1) { signupView(); }
                else if (ch == 2) { printView(); }
                else if (ch == 3) { updateView(); }
                else if (ch == 4) { deleteView(); }
                else if (ch == 5) {System.out.println(" >> 종료 합니다. <<"); break;}
                else { System.err.println(">> 없는 기능 번호 입니다."); }
            } //try end
            catch (Exception e) {System.out.println("잘못된 입력입니다." + e);} scanner = new Scanner(System.in);}
    } //me


//2. 등록페이지
public void signupView(){
    System.out.println(" >> 등록 페이지 << ");

    System.out.println("[저장] 이름 : "); String name = scanner.next();

    boolean result = Controller.controller.signupCon(name);
    if (result){System.out.println(" >> 등록성공");}
    else {System.out.println(">> 등록실패");}
}
//3. 출력페이지
public void printView(){
    System.out.println(" >> 출력 페이지 << ");

    ArrayList<String> result = Controller.controller.printCon();
    System.out.println("==== 이름명단 ====");
    for (int i = 0 ; i < result.size(); i++){
        System.out.println(result.get(i));
    }
}
//4. 수정페이지
public void updateView(){
    System.out.println(" >> 수정 페이지 << ");

    System.out.println("[수정] 기존이름 : "); String oldName = scanner.next();
    System.out.println("[수정] 새로울이름 : "); String newName = scanner.next();

    boolean result = Controller.controller.updateCon(oldName, newName);

    if (result){System.out.println(" >> 수정성공");}
    else {System.out.println(">> 수정실패");}
}
//5. 삭제페이지
public void deleteView(){
    System.out.println(" >> 삭제 페이지 << ");

    System.out.println("[삭제] 이름 : "); String name = scanner.next();

    boolean result = Controller.controller.deleteCon(name);

    if (result){System.out.println(" >> 삭제성공");}
    else {System.out.println(">> 삭제실패");}
}
} //ce
