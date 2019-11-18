package chain;

/**
 * The class Info log handler.
 * 打印info等级的日志
 *
 * @author GungnirLaevatain
 * @version 2019 -06-25 23:04:38
 * @since JDK 11
 */
public class InfoLogHandler extends AbstractLogHandler {
    @Override
    public void log(String msg, String level) {
        if ("info".equalsIgnoreCase(level)) {
            System.out.println(msg);
        } else {
            if (nextHandler != null) {
                nextHandler.log(msg, level);
            }
        }
    }
}
