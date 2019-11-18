package factory;

/**
 * The class A product.
 * A类型的产品
 *
 * @author GungnirLaevatain
 * @version 2019 -05-22 22:43:52
 * @since JDK 11
 */
public class AProduct implements Product {
    /**
     * Gets name.
     * 获得该产品的名称
     *
     * @return the name
     * 名称
     * @author GungnirLaevatain
     */
    @Override
    public String getName() {
        return "AProduct";
    }
}
