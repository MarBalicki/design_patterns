package patterns.c_behavioral.strategy.example1;

public class MultiplyOperation implements Strategy {
    @Override
    public void mathematicalOperation(int a, int b) {
        System.out.println(a * b);
    }
}
