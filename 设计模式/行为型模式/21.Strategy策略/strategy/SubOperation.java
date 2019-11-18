package strategy;

/**
 * The class Sub operation.
 * 相减操作
 *
 * @author GungnirLaevatain
 * @version 2019 -08-20 23:31:12
 * @since JDK 11
 */
public class SubOperation implements Strategy {
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
    @Override
    public int operation(int num1, int num2) {
        return num1 - num2;
    }
}
