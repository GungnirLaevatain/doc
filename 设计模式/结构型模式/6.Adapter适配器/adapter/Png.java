package adapter;

/**
 * The class Png.
 * png格式的图片接口
 *
 * @author GungnirLaevatain
 * @version 2019 -06-04 22:40:34
 * @since JDK 11
 */
public interface Png {

    /**
     * Get body.
     * 获取图片内容
     *
     * @return the byte [ ]
     * 二进制格式的图片内容
     * @author GungnirLaevatain
     */
    byte[] getBody();
}
