public class FDAccount implements BankAccount {
    private double balance;

    public FDAccount(double balance) {
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


}
