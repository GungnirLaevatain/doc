package iterator;

/**
 * The class Iterator.
 * 迭代器接口
 *
 * @param <T> the type parameter
 * @author GungnirLaevatain
 * @version 2019 -07-02 23:44:34
 * @since JDK 11
 */
public interface Iterator<T> {
    /**
     * Has next.
     * 是否有后续元素
     *
     * @return the boolean
     * @author GungnirLaevatain
     */
    boolean hasNext();

    /**
     * Next.
     * 获取后续元素
     *
     * @return the t
     * @author GungnirLaevatain
     */
    T next();
}
