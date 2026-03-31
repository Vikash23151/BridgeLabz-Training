public interface PaymentMethod {
    String name();
    void pay(Order order) throws PaymentFailedException;
}
