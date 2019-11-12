package command;

/**
 * The class Invoker.
 * 要求命令执行请求的类
 *
 * @author GungnirLaevatain
 * @version 2019 -06-26 23:10:17
 * @since JDK 11
 */
public class Invoker {

    /**
     * Invoke.
     * 进行命令的执行
     *
     * @param command the command
     * @author GungnirLaevatain
     */
    public void invoke(Command command) {
        command.execute();
    }
}
