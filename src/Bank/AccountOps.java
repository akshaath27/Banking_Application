package Bank;

public interface AccountOps {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}