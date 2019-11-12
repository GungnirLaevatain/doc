package factory;

/**
 * The class Factory.
 * 工厂接口
 *
 * @author GungnirLaevatain
 * @version 2019 -05-30 22:15:59
 * @since JDK 11
 */
public interface Factory {

    /**
     * Create product.
     * 进行产品的的创建
     *
     * @return the product
     * @author GungnirLaevatain
     */
    Product createProduct();
}
