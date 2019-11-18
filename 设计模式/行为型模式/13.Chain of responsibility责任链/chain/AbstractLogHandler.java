package chain;

/**
 * The class Abstract log handler.
 * 抽象日志打印类
 *
 * @author GungnirLaevatain
 * @version 2019 -06-25 23:00:52
 * @since JDK 11
 */
public abstract class AbstractLogHandler {

    protected AbstractLogHandler nextHandler;

    /**
     * Sets next handler.
     * 防止后继者
     *
     * @param nextHandler the next handler
     * @author GungnirLaevatain
     */
    public void setNextHandler(AbstractLogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * Log.
     * 打印日志
     *
     * @param msg   the msg
     *              日志
     * @param level the level
     *              等级
     * @author GungnirLaevatain
     */
    public abstract void log(String msg, String level);
}
