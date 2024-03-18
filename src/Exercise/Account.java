package Exercise;

public class Account {
    // 멤버변수(데이터) + 기능(메소드)
    int balance; // 잔액

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
        }else{
            System.out.println("잔액 부족");
        }
    }
}
