package singleton;

/**
 * The class Singleton 4.
 * 基于双重校验的线程安全的单例
 *
 * @author GungnirLaevatain
 * @version 2019 -06-03 23:13:58
 * @since JDK 11
 */
public class Singleton4 {
    /**
     * The constant instance.
     * volatile保证内存可见性，从而避免内存未刷新从而产生的重复实例化
     *
     * @author GungnirLaevatain
     */
    private static volatile Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
