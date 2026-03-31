import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatalogService catalog=new CatalogService();
        catalog.addProduct(new Product("Iphone 17","#1",80000,10));
        catalog.addProduct(new Product("charger","#2",1000,10));
        catalog.addProduct(new Product("Earbuds","#3",2500,15));

        System.out.println("===== Product Catalog =====");
        for(Product p: catalog.listAll()){
            p.displayDetails();
            System.out.println("================================");
        }

        Customer customer = new Customer("Ryuga","#01");

        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();

        List<Product> cart = List.of(catalog.getByIndex(0),catalog.getByIndex(1));
        Order order = orderService.placeOrder(1,customer,cart);
        System.out.println("Placed Order: "+order);

        PaymentMethod paymentMethod = new UPIPayment("ryuga@23151");
        try{
            paymentService.processPayment(order,paymentMethod);
            System.out.println("Payment success via " + paymentMethod.name() + " for " + order.getOrderId());
        }catch(PaymentFailedException e){
            System.out.println("Payment Failed: "+e.getMessage());
        }
        System.out.println("Tracking: " + order.getOrderId() + " status=" + order.getStatus());
        orderService.markShipped(order);
        System.out.println("Tracking: " + order.getOrderId() + " status=" + order.getStatus());
        orderService.markDelivered(order);
        System.out.println("Tracking: " + order.getOrderId() + " status=" + order.getStatus());
    }
    
}
