package patterns.c_behavioral.strategy.example1;

public class SubtractOperation implements Strategy {
    @Override
    public void mathematicalOperation(int a, int b) {
        System.out.println(a - b);
    }
}
