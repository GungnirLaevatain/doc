package singleton;

/**
 * The class Singleton 2.
 * 基于synchronized的线程安全的单例模式
 *
 * @author GungnirLaevatain
 * @version 2019 -06-03 23:09:45
 * @since JDK 11
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public synchronized static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
