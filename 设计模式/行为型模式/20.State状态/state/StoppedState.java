package state;

/**
 * The class Stopped state.
 * 停止状态
 *
 * @author GungnirLaevatain
 * @version 2019 -08-05 21:32:13
 * @since JDK 11
 */
public class StoppedState implements State {
    /**
     * Start.
     * 启动
     *
     * @param context the context
     * @author GungnirLaevatain
     */
    @Override
    public void start(Context context) {
        System.out.println("now will star context");
        context.setState(new StartedState());
    }

    /**
     * Stop.
     * 停止
     *
     * @param context the context
     * @author GungnirLaevatain
     */
    @Override
    public void stop(Context context) {
        System.out.println("it has been stopped");
    }
}
