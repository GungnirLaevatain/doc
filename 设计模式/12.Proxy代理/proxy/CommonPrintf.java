package proxy;

/**
 * The class Common printf.
 * 普通的打印类
 *
 * @author GungnirLaevatain
 * @version 2019 -06-19 22:14:21
 * @since JDK 11
 */
public class CommonPrintf implements Printf {
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
        System.out.println(source);
    }
}
