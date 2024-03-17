package lr2;

// Интерфейс для работы с банковским счетом
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

// Класс банковского счета
class Account implements BankAccount {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Not enough funds");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account(100.0);
        System.out.println("Initial Balance: " + account1.getBalance());

        account1.deposit(50.0);
        System.out.println("Balance after deposit: " + account1.getBalance());

        account1.withdraw(30.0);
        System.out.println("Balance after withdrawal: " + account1.getBalance());

        account1.withdraw(150.0);
        System.out.println("Final Balance: " + account1.getBalance());
    }
}
