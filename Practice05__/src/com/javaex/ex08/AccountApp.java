package com.javaex.ex08;

import java.util.Scanner;

public class AccountApp {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int money;
        
        // Account 객체 생성
        Account account = new Account("312-89562-123456");
        
        // 계좌 정보 출력 (맨 위에 출력)
        System.out.println("계좌 정보: " + account + " 계좌가 개설되었습니다.");
        
        while(run){
            System.out.println("");
            System.out.println("----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------------------------");
            System.out.print("선택>");
            
            int menuNo = sc.nextInt();
            
            switch(menuNo){
            
                case 1:
                    System.out.print("예금액>");
                    money = sc.nextInt();
                    account.setDeposit(account.getDeposit() + money);  // 예금액 업데이트
                    System.out.println("예금 후 잔액: " + account.getDeposit());
                    break;
                
                case 2:
                    System.out.print("출금액>");
                    money = sc.nextInt();
                    if(money <= account.getDeposit()) {
                        account.setWithdraw(account.getWithdraw() + money);  // 출금액 업데이트
                        System.out.println("출금 후 잔액: " + (account.getDeposit() - account.getWithdraw()));
                    } else {
                        System.out.println("잔액이 부족합니다.");
                    }
                    break;
                    
                case 3:
                    System.out.println("잔고액: " + account.getBalance());
                    break;
                
                case 4:
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
                    
                default :
                    System.out.println("다시 입력해주세요.");
                    break;
                    
            }//switch 
            
        }//while
        
        sc.close();
    }
}
