package DAY15.Step3_MVC;

import java.util.ArrayList;

public class Controller {
    //주로 view로부터 받은 데이터를 dao 로 전달해주는 역할

    static Controller controller = new Controller();

    //2. 등록 제어 , 매개변수 : 저장할 값(String) 리턴 : 등록성공 여부 boolean(true or false)
    public boolean signupCon(String name){
        System.out.println("Controller.signupCon");
        boolean result = Dao.dao.signupCon(name);
        return result;
    }

    //3. 출력 제어 , 매개변수 : X  리턴 : 회원목록 ArrayList<String>
    public ArrayList<String> printCon(){
        System.out.println("Controller.printCon");
        ArrayList<String> result = Dao.dao.printCon();
        return result;
    }

    //4. 수정 제어 , 매개변수 : 기존이름,새로운이름 리턴 : 성공여부 boolean (true or false)
    public boolean updateCon(String oldName , String newName){
        System.out.println("Controller.updateCon");
        boolean result = Dao.dao.updateCon(oldName, newName);
        return result;
    }

    //5. 삭제 제어 매개변수 : 삭제할 이름(String) 리턴 : 성공여부 boolean (true or false)
    public boolean deleteCon(String name){
        System.out.println("Controller.deleteCon");
        boolean result = Dao.dao.deleteCon(name);
        return result;
    }

} //ce
