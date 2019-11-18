package flyweight;

/**
 * The class Char.
 * 密码字符映射接口
 *
 * @author GungnirLaevatain
 * @version 2019 -06-17 23:26:22
 * @since JDK 11
 */
public interface Char {
    /**
     * Target char.
     * 映射的字符
     *
     * @return the char
     * @author GungnirLaevatain
     */
    char targetChar();

    /**
     * Origin char.
     * 源字符
     *
     * @return the char
     * @author GungnirLaevatain
     */
    char originChar();

}
