package strategy;

/**
 * The class Strategy.
 * 算数方式接口
 *
 * @author GungnirLaevatain
 * @version 2019 -08-20 23:26:41
 * @since JDK 11
 */
public interface Strategy {

    /**
     * Operation.
     * 根据具体运算进行运算，返回结果
     *
     * @param num1 the num 1
     *             操作数1
     * @param num2 the num 2
     *             操作数2
     * @return the int
     * 结果
     * @author GungnirLaevatain
     */
    int operation(int num1, int num2);
}
