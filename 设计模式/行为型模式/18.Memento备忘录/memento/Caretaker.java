package memento;

/**
 * The class Caretaker.
 * 管理者
 *
 * @author GungnirLaevatain
 * @version 2019 -07-10 22:51:10
 * @since JDK 11
 */
public class Caretaker {

    private Memento memento;

    /**
     * Save memento.
     * 保存备忘录
     *
     * @param memento the memento
     * @author GungnirLaevatain
     */
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

    /**
     * Gets memento.
     * 获取备忘录
     *
     * @return the memento
     * @author GungnirLaevatain
     */
    public Memento getMemento() {
        return memento;
    }
}
