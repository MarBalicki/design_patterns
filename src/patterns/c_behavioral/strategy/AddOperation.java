package patterns.c_behavioral.strategy;

public class AddOperation implements Strategy {
    @Override
    public void mathematicalOperation(int a, int b) {
        System.out.println(a + b);
    }
}
