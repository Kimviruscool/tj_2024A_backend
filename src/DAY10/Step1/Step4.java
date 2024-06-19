package DAY10.Step1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) { //ms
    //입력 객체
        Scanner scanner = new Scanner(System.in);
    // 1 배열 객체
        ArrayList<Product> productslist = new ArrayList<>();

    // 2
        while (true){ //무한루프
            System.out.println("리스트상태확인" + productslist);

            System.out.println("1.등록(C) 2.출력(R) 3.수정(U) 4.삭제(D) 5. 종료 선택 >>");//무한출력
            int ch = scanner.nextInt(); //무한입력,무한대입 입력받은 데이터로 기능을 구분짓기 위해서
            if(ch == 1){
                //1. 입력받고
                System.out.println(">>코드 : "); String code = scanner.next();
                System.out.println(">>제품명 : "); String name = scanner.next();
                System.out.println(">>제품가격 : "); int price = scanner.nextInt();

                Product p = new Product(code,name,price);
               //3. 배열내 저장
                productslist.add(p);

            }
            else if(ch ==2 ){}
            else if(ch ==3 ){}
            else if(ch ==4 ){System.out.println("삭제할 제품 코드 입력 : "); String deleteCode = scanner.next();
            //2.삭제할 제품코드를 찾는다.
           for (int i = 0; i < productslist.size(); i++){
               if(productslist.get(i).getCode().equals(deleteCode)){
                   productslist.remove(i);
                   break;
               }
           }

            }
            else if(ch ==5 ){break;}
            else {System.out.println("입력할수 없는 숫자입니다. 다시입력하세요");break;}
        }


    } //me
}


/*
* [메모리설계]
* 1. 객체의 추상적인 구성(특성 , 행위)을 클래스로 구현해서 선언
* 2. 구성한 개념을 클래스로 구현 하기
* 3. 해당 클래스 타입의 객체를 여러개 저장하기 위해 배열 선정/만들기
* - 배열 선언방법 : 타입[] 배열변수명 = new 타입[길이]
* [화면 구현 설계]
* 1. 콘솔에 출력할 내용들을 구성
* 2.
* */