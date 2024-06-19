package DAY10.Step1;

public class Product {
    
    //멤버 변수/인스턴스변수/필드 선언
    private String code;
    private String name;
    private int price;

    //2. 생성자

    public Product(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }


    //3. 메소드
        //1. 일반함수

        //2. private 멤버 변수 외부로 접근하기 위해 getter and setter

    public String getCode() {return code;}

    public void setCode(String code) {this.code = code;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getPrice() {return price;}

    public void setPrice(int price) {this.price = price;}

        //3. toString() 객체 호출시 주소값이 아닌 객체의 속성 출력

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
