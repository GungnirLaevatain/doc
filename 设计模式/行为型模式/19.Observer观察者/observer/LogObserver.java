package observer;

/**
 * The class Log observer.
 * 状态变化时打印日志的观察者
 *
 * @author GungnirLaevatain
 * @version 2019 -07-15 23:35:44
 * @since JDK 11
 */
public class LogObserver implements Observer {
    /**
     * Update.
     * 当观察的目标状态变化时触发的更新操作
     *
     * @param state the state
     *              目标的当前状态
     * @author GungnirLaevatain
     */
    @Override
    public void update(int state) {
        System.out.println("now subject state is " + state);
    }
}
