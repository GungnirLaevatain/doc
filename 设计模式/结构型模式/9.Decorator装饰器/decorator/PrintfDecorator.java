package decorator;

/**
 * The class Printf decorator.
 * 打印类的装饰器
 *
 * @author GungnirLaevatain
 * @version 2019 -06-12 23:09:14
 * @since JDK 11
 */
public abstract class PrintfDecorator implements Printf {
    protected Printf printf;

    public PrintfDecorator(Printf printf) {
        this.printf = printf;
    }

    @Override
    public void printString(String source) {
        printf.printString(source);
    }
}
