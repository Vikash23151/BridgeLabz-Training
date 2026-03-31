import java.util.*;

public class Order {
    private final String orderId;
    private final int quantity;
    private final Customer customer;
    private OrderStatus status;
    private final List<Product> items;

    public Order(String orderId, int quantity, Customer customer, List<Product> items) {
        if(items == null || items.isEmpty()) {
            throw new IllegalArgumentException("Order must have items");
        }
        this.orderId = orderId;
        this.quantity = quantity;
        this.customer = customer;
        this.status = OrderStatus.CREATED;
        this.items = new ArrayList<>(items);
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public List<Product> getItems() {
        return items;
    }
    public double totalAmount(){
        double sum=0;
        for(Product p: items){
            sum+=p.getDiscountedPrice();
        }
        return sum;
    }
}
