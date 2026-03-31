public class PaymentService {

    public void processPayment(Order order, PaymentMethod method) throws PaymentFailedException {
        if (order.getStatus() == OrderStatus.CANCELLED) {
            throw new PaymentFailedException("Cannot pay for CANCELLED order");
        }
        if (order.getStatus() == OrderStatus.PAID) return;
        method.pay(order);
        order.setStatus(OrderStatus.PAID);
    }

}
