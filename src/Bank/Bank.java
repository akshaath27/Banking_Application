package Bank;

import java.util.List;
import java.util.ArrayList;
public abstract class Bank {
    protected String bankName;
    protected String branchName;
    protected static final String BANK_CODE_PREFIX = "BANK-";
    protected static int bankCounter = 1;
    protected String bankCode;
    protected List<Account> accounts= new ArrayList<>();
    public Bank(String bankName, String branchName) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.bankCode = generateBankCode();
    }

    protected String generateBankCode() {
        return BANK_CODE_PREFIX + (bankCounter++);
    }

    public abstract void openAccount(Account account);
    public abstract void displayBankInfo();

    public List<Account> getAccounts() {
        return accounts;
    }
}




