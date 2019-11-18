package builder;

public class ABuilder implements Builder {

    private Product product = new Product();

    /**
     * Build part.
     * 建造内容
     *
     * @param part the part
     *             内容
     * @author GungnirLaevatain
     */
    @Override
    public void buildPart(String part) {
        product.setPart(part);
    }

    /**
     * Build name.
     * 建造产品名称
     *
     * @param name the name
     *             产品名称
     * @author GungnirLaevatain
     */
    @Override
    public void buildName(String name) {
        product.setName(name);
    }

    /**
     * Gets product.
     * 获得产品
     *
     * @return the product
     * 返回的产品
     * @author GungnirLaevatain
     */
    @Override
    public Product getProduct() {
        return product;
    }
}
