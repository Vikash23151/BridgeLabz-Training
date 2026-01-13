import java.util.ArrayList;
import java.util.List;

public class CatalogService {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> listAll() {
        return products;
    }

    public Product getByIndex(int idx){
        return products.get(idx);
    }
}
