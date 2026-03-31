public class Product {
    private String productName;
    private int price;
    private static int totalProducts=0;

    Product(String productName,int price){
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }
    void displayProductDetails(){
        System.out.println("Product name: "+productName);
        System.out.println("Product price: "+price);
    }
    static void displayTotalProducts(){
        System.out.println("Total number of products: "+totalProducts);
    }

    public static void main(String[] args) {
        Product product=new Product("Pen",20);
        Product product2=new Product("Notebook",120);
        product.displayProductDetails();
        product2.displayProductDetails();
        displayTotalProducts();
    }
}
