public class Product {
    private final String name;
    private final String id;
    private double price;
    private double discount;

    public Product(String name, String id, double price, double discount) {
        this.name = name;
        this.id = id;
        setPrice(price);
        setDiscount(discount);
    }

    public void setPrice(double price) {
        if(price>0) {
            this.price = price;
        }else{
            throw new IllegalArgumentException("Price must be > 0, but was: " + price);
        }
    }

    public void setDiscount(double discount) {
        if(discount>=0) {
            this.discount = discount;
        }else{
            throw new IllegalArgumentException("Discount must be between 0 and 100, but was: " + discount);
        }
    }

    public double getDiscountedPrice() {
        return price - (price * discount / 100.0); // discount=10 means 10%
    }

    public void displayDetails() {
        System.out.println("Product Name: "+name);
        System.out.println("Product id: "+id);
        System.out.println("Product price: "+price);
        System.out.println("Product discount: "+discount);
        System.out.println("Product discounted price: "+getDiscountedPrice());
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }  

//    public static void main(String[] args) {
//        Product product=new Product("chager","123456",800,-1);
//        product.displayDetails();
//    }
}
