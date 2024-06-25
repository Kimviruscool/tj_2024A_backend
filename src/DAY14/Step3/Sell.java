package DAY14.Step3;

public interface Sell {
    //추상 메소드 : 구현X 선언부만 있음
    void sell();

    default void order (){
        System.out.println("판매 주문");
    }
}
