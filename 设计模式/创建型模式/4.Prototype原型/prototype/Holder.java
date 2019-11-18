package prototype;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The class Holder.
 * 提供产品原型注册和获取的容器
 *
 * @author GungnirLaevatain
 * @version 2019 -05-23 22:08:43
 * @since JDK 11
 */
public class Holder {

    private static Map<String, Product> productMap = new ConcurrentHashMap<>();

    /**
     * Register.
     * 注册产品原型
     *
     * @param type    the type
     *                产品类别
     * @param product the product
     *                产品原型
     * @author GungnirLaevatain
     */
    public static void register(String type, Product product) {
        productMap.put(type, product);
    }

    /**
     * Gets product.
     * 根据类别获得产品
     *
     * @param type the type
     *             产品类别
     * @return the product
     * 产品
     * @author GungnirLaevatain
     */
    public static Product getProduct(String type) {
        //获取产品原型
        Product product = productMap.get(type);
        if (product == null) {
            return null;
        }
        //通过产品原型构建新产品
        Product newProduct = product.clone();
        //进行初始化操作
        newProduct.init();
        //返回新产品
        return newProduct;
    }
}
