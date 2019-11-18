package abstrcatfactory;

/**
 * The class Factory producer.
 * 产品族工厂生产者
 *
 * @author GungnirLaevatain
 * @version 2019 -05-22 22:53:50
 * @since JDK 11
 */
public class FactoryProducer {

    /**
     * Create factory.
     * 根据产品族类型选择创建对应产品的工厂
     *
     * @param type the type
     *             产品族类型
     * @return the abstract factory
     * 产品族的工厂类
     * @author GungnirLaevatain
     */
    public static AbstractFactory createFactory(String type) {
        if ("A".equals(type)) {
            return new AFactory();
        }
        return new BFactory();
    }
}
