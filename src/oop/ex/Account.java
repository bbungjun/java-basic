package oop.ex;

public class Account {
    int balance ;



    void deposit(int amount){
        balance += amount;
        System.out.println("입금 = " + amount + " 잔고 = " + balance);

    }
    void withdraw(int amount){
         if (balance >= amount){
             balance -= amount;
             System.out.println("출금 = " + amount + " 잔고 = " + balance);

         }else{
             System.out.println("잔액이 부족 합니다.");
         }
    }
}


