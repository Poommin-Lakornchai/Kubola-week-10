/*class Account {
    int accId;
    double balance;
    static int count=0;

    public Account(double balance) {
        increaseCount();
        this.accId = count;
        this.balance = balance;
    }
    public Account() {
        increaseCount();
        this.accId = count;
        this.balance = 0.0;
    }
    public void increaseCount() {
        count++;
    }
    public static void setCount(int c) {
        count = c;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Not enough money to withdraw!!");
        } else {
            balance = balance - amount;
        }
    }
    public void display() {
        System.out.println("A/C no: " + accId + " Balance = " + balance);
    }
}

public class Lab10_6 {
    public static void main(String[] args) {
        Account a1 = new Account(100);
        Account a2 = new Account();

        a1.display();
        a2.display();

        a2.setBalance(2000);

        a1.display();
        a2.display();

        a1.deposit(500);

        a1.display();
        a2.display();

        a2.withdraw(200);

        a1.display();
        a2.display();

        Account.setCount(20);

        Account a3 = new Account();
        Account a4 = new Account(700);

        a1.display();
        a2.display();
        a3.display();
        a4.display();

    }
}*/
