package DAY14.Step3;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer(); //객체 생성

        Buy buyer = customer; //인터페이스 buyer에 customer 객체입력
        buyer.buy(); //customer 타입이 buy타입으로 변환 (자동타입변환) 구현하고있기때문에 iterface
        buyer.order();//

        Sell seller = customer;//인터페이스 seller에 customer 객체입력
        seller.sell();//customer 타입이 sell타입으로 변환 (자동타입변환) 구현하고있기때문에 iterface
        seller.order();//

        if (seller instanceof Customer){ //만약에 seller타입이 customer안에 포함되어있으면
            Customer customer2 = (Customer)seller; //seller를 customer로 형변환
            customer2.buy();//
            customer2.sell();//
        }
        customer.order();
    }
}

//인터페이스 사용이유 : 동일한 목적을가지고 서로다른 기능을하겠다.
//클래스는 상속을 1번
//인플리먼트/인터페이스는 상속 여러번
//인터페이스 : 메뉴얼 (사용방법)
//언제 오버라이드 사용 : ??