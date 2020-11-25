package patterns.c_behavioral.iterators.example2;

public interface ProfileIterator {

    boolean hasNext();
    Profile getNext();
    void reset();
}
