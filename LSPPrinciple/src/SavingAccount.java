public class SavingAccount implements WithdrawableAccount {
    private double balance;

    public SavingAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        System.out.println("Current Balance: " + balance);
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Current Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Current Balance: " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw: " + amount + ", Current Balance: " + balance);
        }
    }


}
