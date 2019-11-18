package singleton;

/**
 * The class Singleton 5.
 * 在Singleton3模式上的扩展，利用内部类实现延迟加载
 *
 * @author GungnirLaevatain
 * @version 2019 -06-03 23:18:11
 * @since JDK 11
 */
public class Singleton5 {

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static Singleton5 instance = new Singleton5();
    }
}
