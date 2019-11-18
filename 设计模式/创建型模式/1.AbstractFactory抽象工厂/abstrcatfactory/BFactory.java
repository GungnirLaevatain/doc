package abstrcatfactory;

/**
 * The class B factory.
 * B产品工厂类
 *
 * @author GungnirLaevatain
 * @version 2019 -05-15 23:15:25
 * @since JDK 11
 */
public class BFactory implements AbstractFactory {
    /**
     * Create.
     * 创建产品
     *
     * @return the product
     * @author GungnirLaevatain
     */
    @Override
    public Product create() {
        return new BProduct();
    }
}
