import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderService {
    private final List<Order> orders = new ArrayList<>();

    public Order placeOrder(int quantity, Customer customer, List<Product> items) {
        String id = "ORD-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        Order order = new Order(id,quantity,customer,items);
        orders.add(order);
        return order;
    }

    public void cancel(Order order){
        if (order.getStatus() == OrderStatus.SHIPPED || order.getStatus() == OrderStatus.DELIVERED) {
            throw new IllegalStateException("Cannot cancel. Order already " + order.getStatus());
        }
        order.setStatus(OrderStatus.CANCELLED);
    }

    public void markShipped(Order order) {
        if (order.getStatus() != OrderStatus.PAID) {
            throw new IllegalStateException("Only PAID orders can be shipped");
        }
        order.setStatus(OrderStatus.SHIPPED);
    }

    public void markDelivered(Order order) {
        if (order.getStatus() != OrderStatus.SHIPPED) {
            throw new IllegalStateException("Only SHIPPED orders can be delivered");
        }
        order.setStatus(OrderStatus.DELIVERED);
    }

}
