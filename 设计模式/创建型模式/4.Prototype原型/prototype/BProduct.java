package prototype;

public class BProduct implements Product {
    /**
     * Clone.
     * 克隆当前的产品
     *
     * @return the product
     * 克隆得到的产品
     * @author GungnirLaevatain
     */
    @Override
    public Product clone() {
        return this;
    }

    /**
     * Init.
     * 初始化
     *
     * @author GungnirLaevatain
     */
    @Override
    public void init() {
        System.out.println("B init");
    }

    /**
     * Name.
     * 返回产品的名称
     *
     * @return the string
     * 产品的名称
     * @author GungnirLaevatain
     */
    @Override
    public String name() {
        return "B";
    }
}
