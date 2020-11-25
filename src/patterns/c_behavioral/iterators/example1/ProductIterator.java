package patterns.c_behavioral.iterators.example1;

import java.util.List;

public class ProductIterator implements MyIterator<Product> {

    private final List<Product> products;
    private int index;

    public ProductIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return index < products.size();
    }

    @Override
    public Product next() {
        return products.get(index++);
    }
}
