class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(long accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        setBalance(initialBalance);
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(long accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    public void displayAccount() {
        // allowed: public and protected members from parent
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + accountHolder);

        // allowed via public getter:
        System.out.println("Balance: " + getBalance());
    }
}
class Main3 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1234567890123L, "Ryuga", 50000.0, 4.5);
        sa.displayAccount();
    }
}


