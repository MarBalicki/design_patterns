package patterns.c_behavioral.iterators.example1;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection implements MyCollection<Product> {

    private final List<Product> products = new ArrayList<>();

    @Override
    public void add(Product product) {
        if (product == null) {
            throw new NullPointerException("Product not exists");
        }
        products.add(product);
    }

    @Override
    public void remove(Product product) {
        if (product == null) {
            throw new NullPointerException("Product not exists");
        }
        products.remove(product);
    }

    @Override
    public MyIterator<Product> iterator() {
        return new ProductIterator(products);
    }
}
