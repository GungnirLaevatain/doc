package chain;

/**
 * The class Error log handler.
 * 打印error等级的日志
 *
 * @author GungnirLaevatain
 * @version 2019 -06-25 23:04:49
 * @since JDK 11
 */
public class ErrorLogHandler extends AbstractLogHandler {
    @Override
    public void log(String msg, String level) {
        if ("error".equalsIgnoreCase(level)) {
            System.out.println(msg);
        } else {
            if (nextHandler != null) {
                nextHandler.log(msg, level);
            }
        }
    }
}
