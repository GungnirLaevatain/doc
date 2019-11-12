package observer;

/**
 * The class Observer.
 * 观察者接口
 *
 * @author GungnirLaevatain
 * @version 2019 -07-15 23:23:28
 * @since JDK 11
 */
public interface Observer {
    /**
     * Update.
     * 当观察的目标状态变化时触发的更新操作
     *
     * @param state the state
     *              目标的当前状态
     * @author GungnirLaevatain
     */
    void update(int state);
}
