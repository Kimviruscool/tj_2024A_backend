package DAY06.Step6;

import java.util.Scanner;

public class Step6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Account myaccount = new Account();
        myaccount.balance = 0;
        myaccount.number = 987654321;

        while (true){
            System.out.println("=====================================");
            System.out.println("1.예금 2.출금 3.잔고확인 4.종료");
            System.out.println("메뉴 선택 : " );
            int ch = scanner.nextInt();
            if (ch == 1){
                System.out.println("입금 금액 입력 : "); int ch1 = scanner.nextInt();
                myaccount.balance += ch1;}
            else if (ch == 2){
                System.out.println("출금 금액 입력 : "); int ch1 = scanner.nextInt();
                myaccount.balance -= ch1;}
            else if (ch == 3){
                System.out.println("현재 잔고 : " + myaccount.balance);}
            else if (ch == 4){break;}
            else {System.out.println("없는 메뉴입니다.");}
        }

    }
}
