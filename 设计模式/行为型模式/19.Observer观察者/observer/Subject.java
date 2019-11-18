package observer;

import java.util.LinkedList;
import java.util.List;

/**
 * The class Subject.
 * 目标
 *
 * @author GungnirLaevatain
 * @version 2019 -07-15 23:21:39
 * @since JDK 11
 */
public class Subject {
    /**
     * The Observer list.
     * 观察者集合
     */
    private List<Observer> observerList = new LinkedList<>();
    /**
     * The State.
     * 状态
     */
    private int state = 0;

    /**
     * Update state.
     * 更新目标状态
     *
     * @param state the state
     * @author GungnirLaevatain
     */
    public void updateState(int state) {
        this.state = state;
        notifyObserver();
    }

    /**
     * Attach.
     * 添加观察者
     *
     * @param observer the observer
     * @author GungnirLaevatain
     */
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    /**
     * Detach.
     * 移除观察者
     *
     * @param observer the observer
     * @author GungnirLaevatain
     */
    public void detach(Observer observer) {
        observerList.removeIf(source -> source == observer);
    }

    private void notifyObserver() {
        observerList.forEach(observer -> observer.update(state));
    }
}
