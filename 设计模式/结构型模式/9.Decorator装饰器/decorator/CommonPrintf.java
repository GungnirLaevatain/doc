package decorator;

/**
 * The class Common printf.
 * 基础的打印类
 *
 * @author GungnirLaevatain
 * @version 2019 -06-12 23:06:32
 * @since JDK 11
 */
public class CommonPrintf implements Printf {
    /**
     * Put string.
     * 打印字符串
     *
     * @param source the source
     *               源字串
     * @author GungnirLaevatain
     */
    @Override
    public void printString(String source) {
        System.out.println(source);
    }
}
