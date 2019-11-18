package adapter;

/**
 * The class Empty png.
 * 空图片
 *
 * @author GungnirLaevatain
 * @version 2019 -06-04 22:47:49
 * @since JDK 11
 */
public class EmptyPng implements Png {
    /**
     * Get body.
     * 获取图片内容
     *
     * @return the byte [ ]
     * 二进制格式的图片内容
     * @author GungnirLaevatain
     */
    @Override
    public byte[] getBody() {
        return new byte[0];
    }
}
