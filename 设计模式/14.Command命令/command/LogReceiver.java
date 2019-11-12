package command;

/**
 * The class Log receiver.
 * 命令接收者，真正的命令执行者
 *
 * @author GungnirLaevatain
 * @version 2019 -06-26 23:12:53
 * @since JDK 11
 */
public class LogReceiver {
    /**
     * Log info.
     * 打印info消息
     *
     * @author GungnirLaevatain
     */
    public void logInfo() {
        System.out.println("log info");
    }

    /**
     * Log error.
     * 打印error消息
     *
     * @author GungnirLaevatain
     */
    public void logError() {
        System.out.println("log error");
    }
}
