package singleton;

/**
 * The class Singleton 1.
 * 最简单的单例模式
 * 非线程安全的
 *
 * @author GungnirLaevatain
 * @version 2019 -06-03 23:04:58
 * @since JDK 11
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
