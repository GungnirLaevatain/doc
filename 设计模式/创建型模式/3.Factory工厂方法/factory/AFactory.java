package factory;

/**
 * The class AFactory.
 * A产品工厂
 *
 * @author GungnirLaevatain
 * @version 2019 -05-22 22:58:17
 * @since JDK 11
 */
public class AFactory implements Factory {

    /**
     * Create product.
     * 进行产品的的创建
     *
     * @return the product
     * @author GungnirLaevatain
     */
    @Override
    public Product createProduct() {
        return new AProduct();
    }
}
