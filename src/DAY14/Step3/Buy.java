package DAY14.Step3;

public interface Buy {
    //추상 메소드 : 구현X 선언부만 있음
    void buy();

    default void order(){
        System.out.println("구매주문");
    }
}
