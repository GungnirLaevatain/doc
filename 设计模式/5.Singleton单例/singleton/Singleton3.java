package singleton;

/**
 * The class Singleton 3.
 * 基于类加载时对于static变量初始化的线程安全的单例
 *
 * @author GungnirLaevatain
 * @version 2019 -06-03 23:12:02
 * @since JDK 11
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
