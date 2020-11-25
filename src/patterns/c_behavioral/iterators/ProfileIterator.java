package patterns.c_behavioral.iterators;

public interface ProfileIterator {

    boolean hasNext();
    Profile getNext();
    void reset();
}
