package Transaction;

import java.util.ArrayList;

public class Account {
    private double balance;

    Account() {
        balance = 0;
    }

    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        this.balance += amount;
        transitionList.add(new Transaction("deposit", amount, balance));
    }

    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        }
        if (amount >= this.balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }
        this.balance -= amount;
        transitionList.add(new Transaction("withdraw", amount, balance));
    }

    /**
     * addTransaction.
     */
    public void addTransaction(double amount, String operation) {
        if (!operation.equals(Transaction.DEPOSIT) && !operation.equals(Transaction.WITHDRAW)) {
            System.out.println("Yeu cau khong hop le!");
            return;
        }
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else {
            withdraw(amount);
        }
    }

    /**
     * print transaction.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            String thisOperation;
            if (transitionList.get(i).getOperation().equals(Transaction.DEPOSIT)) {
                thisOperation = "Nap tien";
            } else {
                thisOperation = "Rut tien";
            }
            System.out.printf("Giao dich %d: %s $%.2f. So du luc nay: $%.2f.\n", i + 1, thisOperation,
                    transitionList.get(i).getAmount(), transitionList.get(i).getBalance());
        }
    }
}
