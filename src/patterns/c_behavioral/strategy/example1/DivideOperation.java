package patterns.c_behavioral.strategy.example1;

public class DivideOperation implements Strategy {
    @Override
    public void mathematicalOperation(int a, int b) {
        double result = (double) a / (double) b;
        System.out.printf("%.2f\n", result);
    }
}
