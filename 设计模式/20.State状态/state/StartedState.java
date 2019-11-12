package state;

/**
 * The class Started state.
 * 启动状态
 *
 * @author GungnirLaevatain
 * @version 2019 -08-05 21:32:23
 * @since JDK 11
 */
public class StartedState implements State {
    /**
     * Start.
     * 启动
     *
     * @param context the context
     * @author GungnirLaevatain
     */
    @Override
    public void start(Context context) {
        System.out.println("it has been stared");
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
        System.out.println("now will stop context");
        context.setState(new StoppedState());
    }
}
