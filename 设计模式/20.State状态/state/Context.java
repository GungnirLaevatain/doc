package state;

/**
 * The class Context.
 * 上下文环境
 *
 * @author GungnirLaevatain
 * @version 2019 -08-05 21:28:19
 * @since JDK 11
 */
public class Context {

    private State state;

    public Context() {
        state = new StoppedState();
    }

    public void start() {
        state.start(this);
    }

    public void stop() {
        state.stop(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
