package DAY03;

import java.util.Scanner;

public class Step4 { //cs

    public static void main(String[] args) { //ms


        Scanner scanner = new Scanner(System.in);

        //문제1 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오.


        // 문제4 : 각 3개의 정수형으로 수를 입력받아 오름차순 순서대로 출력하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
        System.out.print("정수 : "); int a = scanner.nextInt();
        System.out.print("정수 : "); int b = scanner.nextInt();
        System.out.print("정수 : "); int c = scanner.nextInt();

        if(a>b){
            int temp = a;
            a = b;
            b = temp;
        }

        if(a>c){
            int temp = a;
            a = c;
            c = temp;
        }

        if(b>c){
            int temp = b;
            b = c;
            c = temp;
        }

        System.out.println("오름 차순 :" a ">" b ">" c);

        //문제7 : 주차 사용요금 계산하기
        //   [ 선언 변수 조건 ] 입차시간이 9시30분 입니다.
        //      - int 시 = 9;  int 분 = 30; 이와 같이 변수를 먼저 선언해주세요.
        //   [ 출차시간 입력 조건 ] 출차시간의 시 와 분을 각 입력받아 각 변수에 저장하시오.
        //   [ 처리출력 조건 ] 1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오,
        //      - 단 입차 시간 이전 으로 입력 할 경우에는 '출차시간 오류' 출력하시오.






    } //me

} //ce
