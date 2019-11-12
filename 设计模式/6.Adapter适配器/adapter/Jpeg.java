package adapter;

/**
 * The class Jpeg.
 * jpeg格式的图片
 *
 * @author GungnirLaevatain
 * @version 2019 -06-04 22:41:17
 * @since JDK 11
 */
public interface Jpeg {

    /**
     * Gets body.
     * 获取图片内容
     *
     * @return the body
     * base64编码的图片内容
     * @author GungnirLaevatain
     */
    String getBody();
}
