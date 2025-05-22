package Bank;

public class LoanAccount extends Account {
    public LoanAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public void deposit(double amount) {
        balance -= amount;
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawals not allowed from Loan Account");
    }

    public double getBalance() {
        return balance;
    }

    public void showAccountType() {
        System.out.println("Loan Account");
    }
}