package builder;

/**
 * The class Builder.
 * 建造者模式接口
 *
 * @author GungnirLaevatain
 * @version 2019 -05-21 23:45:00
 * @since JDK 11
 */
public interface Builder {

    /**
     * Build part.
     * 构建内容
     *
     * @param part the part
     *             内容
     * @author GungnirLaevatain
     */
    void buildPart(String part);

    /**
     * Build name.
     * 构建产品名称
     *
     * @param name the name
     *             产品名称
     * @author GungnirLaevatain
     */
    void buildName(String name);

    /**
     * Gets product.
     * 获得产品
     *
     * @return the product
     * 返回的产品
     * @author GungnirLaevatain
     */
    Product getProduct();
}
