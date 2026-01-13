public class WalletPayment implements PaymentMethod {
    private double balance;

    public WalletPayment(double initialBalance){
        if(initialBalance<0){
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance=initialBalance;
    }

    @Override
    public String name() {
        return "Wallet";
    }

    @Override
    public void pay(Order order) throws PaymentFailedException {
        double amount= order.totalAmount();
        if(balance<amount){
            throw new PaymentFailedException("Insufficient wallet balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
