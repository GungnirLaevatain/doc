package prototype;

/**
 * The class Product.
 * 产品
 *
 * @author GungnirLaevatain
 * @version 2019 -05-23 22:01:59
 * @since JDK 11
 */
public interface Product {

    /**
     * Clone.
     * 克隆当前的产品
     *
     * @return the product
     * 克隆得到的产品
     * @author GungnirLaevatain
     */
    Product clone();

    /**
     * Init.
     * 初始化
     *
     * @author GungnirLaevatain
     */
    void init();

    /**
     * Name.
     * 返回产品的名称
     *
     * @return the string
     * 产品的名称
     * @author GungnirLaevatain
     */
    String name();
}
