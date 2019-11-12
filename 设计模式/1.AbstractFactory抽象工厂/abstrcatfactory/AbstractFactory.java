package abstrcatfactory;

/**
 * The class Abstract factory.
 * 抽象工厂接口
 *
 * @author GungnirLaevatain
 * @version 2019 -05-15 23:13:30
 * @since JDK 11
 */
public interface AbstractFactory {

    /**
     * Create.
     * 创建产品
     *
     * @return the product
     * @author GungnirLaevatain
     */
    Product create();
}