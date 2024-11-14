package com.javaex.ex08;

public class Account {
    private String accountNo;  // 계좌 번호
    private int deposit;       // 예금액
    private int withdraw;      // 출금액

    public Account(String accountNo) {
        this.accountNo = accountNo;
        this.deposit = 0;      // 기본 예금액은 0
        this.withdraw = 0;     // 기본 출금액은 0
    }

    // 예금액 설정
    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getDeposit() {
        return deposit;
    }

    // 출금액 설정
    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int getWithdraw() {
        return withdraw;
    }

    // 잔고 계산 (예금액 - 출금액)
    public void setShowBalance(int balance) {
        this.deposit = balance;
    }

    public int getBalance() {
        return deposit - withdraw;
    }

    // toString() 메서드 오버라이드
    @Override
    public String toString() {
        return accountNo;
    }
}
