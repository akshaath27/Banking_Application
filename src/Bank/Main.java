package Bank;

import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int accCounter = 100;

    public static void main(String[] args) {
        Bank bank;

        System.out.println("Choose Bank Type:\n1. Nationalized Bank\n2. Cooperative Bank");
        int bankChoice = sc.nextInt(); sc.nextLine();
        System.out.println("Enter Bank Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Branch Name: ");
        String branch = sc.nextLine();

        if (bankChoice == 1)
            bank = new NationalBank(name, branch);
        else
            bank = new CorperativeBank(name, branch);

        boolean running = true;
        while (running) {
            System.out.println("\nChoose Operation:\n1. Open Account\n2. Deposit\n3. Withdraw\n4. Display Info\n5. Exit");
            int choice = sc.nextInt(); sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Select Account Type:\n1. Savings\n2. Current\n3. Loan");
                    int type = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Holder Name: ");
                    String hname = sc.nextLine();
                    System.out.print("Enter Initial Amount: ");
                    double amt = sc.nextDouble();
                    String accNum = "ACC" + (++accCounter);
                    Account acc;
                    if (type == 1) acc = new SavingsAccount(accNum, hname, amt);
                    else if (type == 2) acc = new CurrentAccount(accNum, hname, amt);
                    else acc = new LoanAccount(accNum, hname, amt);
                    bank.openAccount(acc);
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    String dnum = sc.nextLine();
                    System.out.print("Enter Amount: ");
                    double damt = sc.nextDouble();
                    for (Account a : bank.getAccounts()) {
                        if (a.getAccountNumber().equals(dnum)) {
                            a.deposit(damt);
                            System.out.println("Deposit successful.");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    String wnum = sc.nextLine();
                    System.out.print("Enter Amount: ");
                    double wamt = sc.nextDouble();
                    for (Account a : bank.getAccounts()) {
                        if (a.getAccountNumber().equals(wnum)) {
                            a.withdraw(wamt);
                            System.out.println("Withdrawal attempted.");
                            break;
                        }
                    }
                    break;
                case 4:
                    bank.displayBankInfo();
                    break;
                case 5:
                    running = false;
                    break;
            }
        }
        System.out.println("Exiting Banking System.");
    }
}
