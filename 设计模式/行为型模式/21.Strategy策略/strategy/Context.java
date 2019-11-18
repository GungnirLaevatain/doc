package strategy;

/**
 * The class Context.
 * 运算的上下文环境
 *
 * @author GungnirLaevatain
 * @version 2019 -08-20 23:31:37
 * @since JDK 11
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int operation(int num1, int num2) {
        return strategy.operation(num1, num2);
    }
}
