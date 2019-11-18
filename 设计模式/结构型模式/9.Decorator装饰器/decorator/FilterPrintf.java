package decorator;

/**
 * The class Filter printf.
 * 过滤字符串内的回车换行
 *
 * @author GungnirLaevatain
 * @version 2019 -06-12 23:10:58
 * @since JDK 11
 */
public class FilterPrintf extends PrintfDecorator {
    public FilterPrintf(Printf printf) {
        super(printf);
    }

    @Override
    public void printString(String source) {
        String result = source.replace("\r", "").replace("\n", "");
        super.printString(result);
    }
}
