package template;
public abstract class Software {

    public final void run() {
        init();
        destroy();
    }

    protected abstract void init();

    protected abstract void destroy();
}
