// .JAVA파일
package DAY13.Step1;

import java.util.ArrayList;

class 동물{
    String MyName; //멤버변수
    //생성자
    동물(){MyName = "동물";
        System.out.println("<<동물 생성자 탄생>>");}
    //메소드
    void showMe(){System.out.println("myName : " + MyName);}
}

class  조류 extends 동물 {
    조류(){MyName = "조류";System.out.println("<<조류 생성자 탄생>>");}
}

class 참새 extends 조류{
    참새(){MyName = "참새";System.out.println("<<참새 생성자 탄생>>");}
}

class 닭 extends 조류{
    닭(){MyName = "닭";System.out.println("<<닭 생성자 탄생>>");}
}

public class Step1 {
    public static void main(String[] args) {
        동물 animal = new 동물();
        animal.showMe();

        조류 bird = new 조류();
        bird.showMe();

        참새 sparrow = new 참새();
        sparrow.showMe();
        //상속에서 자식이 물려받으면 자식이 우선

        동물 bird2 = new 조류();
        bird2.showMe();
        //자동타입 변환
        //자식 타입은 부모타입으로 변환이 가능
        동물 sparrow2 = new 참새();
        sparrow2.showMe();
        //강제 타입변환 * 전제조건이 필요 : 기본자료형 타입변환
        //부모타입은 자식타입으로 변환 불가능 ,단 상속관계이면 가능, 직계만 가능(상하관계만 가능)(형제는 불가능)
//        조류 bird3 = new 동물();
        참새 sparrow3 = new 참새();
        동물 참새에서동물 = sparrow3; //자식 > 부모 타입 변환
        참새 동물에서참새로 = (참새)참새에서동물; //부모 > 자식 타입 변환

        닭 chicken = new 닭();
        동물 닭에서동물 = chicken; //자식 > 부모 타입 가능
        닭 동물에서닭으로 = (닭)닭에서동물; //부모 > 자식 타입 강제변환 캐스팅


//        참새 닭에서참새 = (참새)chicken; //형제관계 불가능.

        //부모타입으로 배열/리스트를 선언하면 해당 배열/리스트에는 부모타입 포함 자식타입도 저장이 가능하다.
        ArrayList<동물> 동물사전 = new ArrayList<>();
        동물사전.add(animal); 동물사전.add(bird); 동물사전.add(sparrow);

        //부모타입으로 배열/리스트 선언하면 해당 배열/리스트 에는 본인타입 포함 하위타입도 포함이 가능하다. 단 상위타입은 불가능하다.
        ArrayList<조류> 조류사전 = new ArrayList<>();
//      조류사전.add(animal);
        조류사전.add(bird); 조류사전.add(sparrow);


    }
}