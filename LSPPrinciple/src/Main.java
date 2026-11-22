public class Main {
    public static void main(String[] args) {
        System.out.println("--- Saving Account (Withdrawable) ---");
        WithdrawableAccount savingAccount = new SavingAccount(1000);
        savingAccount.getBalance();
        savingAccount.deposit(500);
        savingAccount.withdraw(300);
        savingAccount.getBalance();

        System.out.println("\n--- Fixed Deposit (FD) Account ---");
        BankAccount fdAccount = new FDAccount(5000);
        fdAccount.getBalance();
        fdAccount.deposit(1000);
        fdAccount.getBalance();
    }
}
