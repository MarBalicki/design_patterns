package patterns.c_behavioral.strategy.example1;

public class Context {

    private Strategy strategy;

    public void setMathematicalOperation(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void executeMathematicalOperation(int a, int b) {
        strategy.mathematicalOperation(a, b);
    }
}
