package adapter;

import java.util.Base64;

/**
 * The class Default png reader.
 * 默认的png图片读取器
 *
 * @author GungnirLaevatain
 * @version 2019 -06-04 22:47:52
 * @since JDK 11
 */
public class DefaultPngReader implements PngReader {
    /**
     * Read.
     * 读取图片内容，并且返回base64编码后的数据
     *
     * @param png the png
     *            png格式的图片
     * @return the string
     * base64编码后的图片内容
     * @author GungnirLaevatain
     */
    @Override
    public String read(Png png) {
        byte[] body = png.getBody();
        return Base64.getEncoder().encodeToString(body);
    }
}
