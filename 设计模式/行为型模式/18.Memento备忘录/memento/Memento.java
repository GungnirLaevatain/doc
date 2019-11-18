package memento;

/**
 * The class Memento.
 * 备忘录
 *
 * @author GungnirLaevatain
 * @version 2019 -07-10 22:46:08
 * @since JDK 11
 */
public class Memento {

    private String state;


    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
