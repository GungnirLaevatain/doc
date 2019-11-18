package abstrcatfactory;

/**
 * The class A product.
 * A产品
 *
 * @author GungnirLaevatain
 * @version 2019 -05-15 23:14:55
 * @since JDK 11
 */
public class AProduct implements Product {
    @Override
    public void sayHello() {
        System.out.println("Hello World, This is A");
    }
}
