package factory;

/**
 * The class B product.
 * B类型的产品
 *
 * @author GungnirLaevatain
 * @version 2019 -05-22 22:44:17
 * @since JDK 11
 */
public class BProduct implements Product {
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
        return "BProduct";
    }
}
