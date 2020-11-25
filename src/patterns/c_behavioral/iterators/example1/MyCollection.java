package patterns.c_behavioral.iterators.example1;

public interface MyCollection<T> {

    void add(Product product);
    void remove(Product product);
    MyIterator<T> iterator();
}
