package state;

/**
 * The class State.
 * 表示当前状态的接口
 *
 * @author GungnirLaevatain
 * @version 2019 -08-05 21:27:00
 * @since JDK 11
 */
public interface State {
    /**
     * Start.
     * 启动
     *
     * @param context the context
     * @author GungnirLaevatain
     */
    void start(Context context);

    /**
     * Stop.
     * 停止
     *
     * @param context the context
     * @author GungnirLaevatain
     */
    void stop(Context context);
}
