package DAY08;

public class 제품 {
    //1. 멤버변수
    private int 제품번호;
    private String 제품명;
    //2. 생성자

    //3. 메소드/함수
    void 구매함수(){System.out.println("제품구매");}
    //return 값이 없을때 void사용

    //반환타입(int , void 등등) : (내생각 : int) , (정답 : 반환/리턴할 값의 타입)
    //void : 없다는 뜻
    int 환불함수 (String 제품명) { //매개변수(인수)인자값 넣는이유 : 움직여야하니까
        //매개변수? : 함수 내에서 사용할 변수를 호출시 전달 받은 값들
        return 3;
        //반환/리턴? : 함수 내에서 결과를 호출했던곳으로 전달할 값
    }
    //= 전체로 묶어서 함수

    //getter and setter


    public int get제품번호() {
        return 제품번호;
    }

    public void set제품번호(int 제품번호) {
        //유효성 검사 가능
        this.제품번호 = 제품번호;
    }

    public String get제품명() {
        return 제품명;
    }

    public void set제품명(String 제품명) {
        this.제품명 = 제품명;
    }
}
