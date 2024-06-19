package DAY10.Step1;

import java.util.Arrays;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) { //ms
    //입력 객체
        Scanner scanner = new Scanner(System.in);
    // 1
    int count = 0;
    Product[] productArray = new Product[count];
    
    // 2
        while (true){ //무한루프
            System.out.println("배열상태확인함수" + Arrays.toString(productArray));

            System.out.println("1.등록(C) 2.출력(R) 3.수정(U) 4.삭제(D) 5. 종료 선택 >>");//무한출력
            int ch = scanner.nextInt(); //무한입력,무한대입 입력받은 데이터로 기능을 구분짓기 위해서
            if(ch == 1){
                //1. 입력받고
                System.out.println(">>코드 : "); String code = scanner.next();
                System.out.println(">>제품명 : "); String name = scanner.next();
                System.out.println(">>제품가격 : "); int price = scanner.nextInt();

                Product p = new Product(code,name,price);
                //2. 가공(유효성검사 혹은 객체화)
                //1. 제품 총개수 증가
                count++;
                //2. 새로울 배열 생성
                Product[] newproductArray = new Product[count];
                //3. 기존 배열내 값을 새로운 배열로 이동/복사/카피
                for (int i = 0; i < productArray.length; i++){
                    newproductArray[i] = productArray[i];
                }
                //4. 새로울 배열내 추가된 마지막 인덱스의 저장할 제품객체를 등록
                newproductArray[newproductArray.length-1] = p;
                //5. 새로운 배열을 기존배열에 대입
                productArray = newproductArray;

            }
            else if(ch ==2 ){}
            else if(ch ==3 ){}
            else if(ch ==4 ){System.out.println("삭제할 제품 코드 입력 : "); String deleteCode = scanner.next();
            //2.삭제할 제품코드를 찾는다.
            for (int i = 0; i < productArray.length; i++){
                //i번째 제품의 코드가 입력받은 코드와 일치하면 삭제
                if(productArray[i].getCode().equals(deleteCode)){
                    //삭제할 인덱스뒤로 한칸씩 당기기
                    for (int j = i; j<productArray.length-1;j++){
                        productArray[j]= productArray[j+1];
                    }
                }
            }
            //마지막 인덱스를 제외한 배열 카피/복사/주소 이동
                    //1개가 차감된 새로운 배열 생성
                count--; //제품총개수 1차감
                Product[] newProductArray = new Product[count];
                    //기존 배열내 마지막 인덱스를 제외하고 새로운 배열에 복사
                for (int i = 0 ; i < newProductArray.length; i++){
                    newProductArray[i] = productArray[i];
                }
                productArray = newProductArray;
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