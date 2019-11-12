package adapter;

/**
 * The class Empty jpeg.
 * 空图片
 *
 * @author GungnirLaevatain
 * @version 2019 -06-04 22:49:01
 * @since JDK 11
 */
public class EmptyJpeg implements Jpeg {
    /**
     * Gets body.
     * 获取图片内容
     *
     * @return the body
     * base64编码的图片内容
     * @author GungnirLaevatain
     */
    @Override
    public String getBody() {
        return "";
    }
}
