package Exercise;

public class AccountMain {
    public static void main(String[] args) {
        // 만원 입금 > 구천원 출금 > 이천원 출금 > 잔액을 출력하세요.
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        System.out.println("현재 잔액: "+ account.balance);
    }
}
