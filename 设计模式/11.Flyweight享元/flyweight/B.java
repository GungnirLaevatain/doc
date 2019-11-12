package flyweight;

/**
 * The class B.
 * B字符进行映射
 *
 * @author GungnirLaevatain
 * @version 2019 -06-17 23:29:15
 * @since JDK 11
 */
public class B implements Char {
    /**
     * Target char.
     * 映射的字符
     *
     * @return the char
     * @author GungnirLaevatain
     */
    @Override
    public char targetChar() {
        return 'A';
    }

    /**
     * Origin char.
     * 源字符
     *
     * @return the char
     * @author GungnirLaevatain
     */
    @Override
    public char originChar() {
        return 'B';
    }
}
