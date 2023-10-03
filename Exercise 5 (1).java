//Main
package javaapplication5;
import com.loan.LoanAccount;
public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java com.loan.Main <operation> <amount>");
            return;
        }
        String operation = args[0];
        double amount = Double.parseDouble(args[1]);
        LoanAccount loanAccount = new LoanAccount();
        loanAccount.doTransaction(operation, amount);
    }
}
//Transanction
package com.transact;
public class Transaction {
    public static void credit(double amount) {
    }
    public static void debit(double amount) {
    }
}
//Loan Amount
package com.loan;
import com.transact.Transaction;
public class LoanAccount {
    public void doTransaction(String operation, double amount) {
        if (null == operation) {
            System.out.println("Invalid operation");
        } else switch (operation) {
            case "credit":
                Transaction.credit(amount);
                break;
            case "debit":
                Transaction.debit(amount);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
