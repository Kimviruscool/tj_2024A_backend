package DAY02;

public class Step3 { //cs
    public static void main(String[] args) { //ms

        //기본 연산자
            //연산자 : 연산에 사용되는 기호
            //항 : 연산에 사용하는 값 , 단항 , 이항, 삼항
            //부호 연산자 : +값 -값

        int x = 10; int y = -3;
        //1. 산술연산자 : 73p +더하기 -빼기 *곱하기 /나누기 %나머지
        System.out.println(x + y); //7
        System.out.println(x - y); //13
        System.out.println(x * y); //-30
        System.out.println(x / y); //-3
        System.out.println(x % y); //1

        //2. 연결연산자 : +연결연산자 (항에 문자/열 포함되는 경우)
        System.out.println("x + y = " + x + y ); //x+y = 10-3
        System.out.println("x + y = "+ (x+y)); // x+y = 7

        //3. 비교연산자 : == 같다 != 같지않다 >초과 >=이상 <미만 <=이하
        System.out.println(x == y); //false
        System.out.println(x != y); //true
        System.out.println(x > y); //true
        System.out.println(x >= y); //ture
        System.out.println(x < y); //false
        System.out.println(x <= y); //false

        //4. 논리연산자 : && and , || or , !부정
        System.out.println(x > 5 && x < 20); //true //and 이면서
        System.out.println(y == -5 || y < 0 ); //true //or 이거나
        System.out.println(!(x>=20));//true //부정 반대로

        //5. 복합대입연산자 :
        // = 대입연산자 : 오른쪽 값을 왼쪽에 대입
        int z = 30;
        // += ,-= ,*= ,/= ,%= : 오른쪽 값을 왼쪽에 연산 후 결과를 왼쪽에 대입
        z += 1;
        z = z + 1;

        //6. 증감연산자 : ++변수 : 선위증가, 변수-- : 후위증가 , --변수 : 선위감소 , 변수++ : 후위증가

        System.out.println(x++); //10 출력후 증가
        System.out.println(x); //11
        System.out.println(++x); //12 출력전 증가

        System.out.println(x--); //12 출력후 감소
        System.out.println(x); //11
        System.out.println(--x); //10 출력전 감소

        z++; //증감 우선순위는 하나의 ; 세미콜론 안에서 
        System.out.println(z); //33
        
        //7. 삼항연산자 : 조건 ? 참 : 거짓 , // 조건1 ? 참1 : 조건2 ? 참2 : 거짓
        char result = z >= 30 ? 'T' : 'F' ;
        System.out.println(result); // T z = 33
        char result2 = z >= 50 ? 'T' : z >= 30 ? 'M' : 'F';
        System.out.println(result2); //M

    } //ms
} //cs
