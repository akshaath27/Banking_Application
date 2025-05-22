package Bank;

public class CorperativeBank extends Bank {
    public CorperativeBank(String bankName, String branchName) {
        super(bankName, branchName);
    }

    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Account opened in Cooperative Bank.");
    }

    public void displayBankInfo() {
        System.out.println("--- Bank Details ---");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch: " + branchName);
        System.out.println("Bank Code: " + bankCode);
        System.out.println("--- Account Details ---");
        for (Account acc : accounts) {
            acc.showAccountType();
            System.out.println("Holder: " + acc.getHolderName());
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Balance: ₹" + acc.getBalance());
            System.out.println();
        }
    }
}
