package factory;

/**
 * The class B factory.
 * B产品工厂
 *
 * @author GungnirLaevatain
 * @version 2019 -05-30 22:20:59
 * @since JDK 11
 */
public class BFactory implements Factory {
    /**
     * Create product.
     * 进行产品的的创建
     *
     * @return the product
     * @author GungnirLaevatain
     */
    @Override
    public Product createProduct() {
        return new BProduct();
    }
}
