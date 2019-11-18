package abstrcatfactory;

/**
 * The class A factory.
 * A产品工厂类
 *
 * @author GungnirLaevatain
 * @version 2019 -05-15 23:14:22
 * @since JDK 11
 */
public class AFactory implements AbstractFactory {
    /**
     * Create.
     * 创建产品
     *
     * @return the product
     * @author GungnirLaevatain
     */
    @Override
    public Product create() {
        return new AProduct();
    }
}
