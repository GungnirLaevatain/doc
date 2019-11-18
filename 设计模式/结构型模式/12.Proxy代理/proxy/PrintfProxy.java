package proxy;

/**
 * The class Printf proxy.
 * 打印代理类，用于方法前后打印日志
 *
 * @author GungnirLaevatain
 * @version 2019 -06-19 22:15:21
 * @since JDK 11
 */
public class PrintfProxy implements Printf {

    private Printf printf;

    public PrintfProxy(Printf printf) {
        this.printf = printf;
    }

    /**
     * Printf.
     * 打印字符串
     *
     * @param source the source
     *               所需打印的字符串
     * @author GungnirLaevatain
     */
    @Override
    public void printf(String source) {
        System.out.println("printf start");
        printf.printf(source);
        System.out.println("printf end");
    }
}
