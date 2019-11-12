package memento;

/**
 * The class Originator.
 * 原发器
 *
 * @author GungnirLaevatain
 * @version 2019 -07-10 22:47:10
 * @since JDK 11
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * Save state to memento.
     * 将状态保存至备忘录内
     *
     * @return the memento
     * @author GungnirLaevatain
     */
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    /**
     * Recovery from memento.
     * 从备忘录中恢复状态
     *
     * @param memento the memento
     * @author GungnirLaevatain
     */
    public void recoveryFromMemento(Memento memento) {
        state = memento.getState();
    }
}
