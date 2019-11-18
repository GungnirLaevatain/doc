package adapter;

/**
 * The class Png reader.
 * png图片读取器
 *
 * @author GungnirLaevatain
 * @version 2019 -06-04 22:44:20
 * @since JDK 11
 */
public interface PngReader {

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
    String read(Png png);
}
