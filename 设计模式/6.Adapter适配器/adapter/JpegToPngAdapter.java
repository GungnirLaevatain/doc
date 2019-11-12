package adapter;

import java.nio.charset.StandardCharsets;

/**
 * The class Jpeg to png adapter.
 * jpeg转为png读取的适配器
 *
 * @author GungnirLaevatain
 * @version 2019 -06-04 22:50:46
 * @since JDK 11
 */
public class JpegToPngAdapter implements Png {
    private Jpeg jpeg;

    public JpegToPngAdapter(Jpeg jpeg) {
        this.jpeg = jpeg;
    }

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
        return jpeg.getBody().getBytes(StandardCharsets.UTF_8);
    }
}
