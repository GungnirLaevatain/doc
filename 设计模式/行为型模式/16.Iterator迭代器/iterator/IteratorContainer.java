package iterator;

/**
 * The class Iterator container.
 * 迭代器容器
 *
 * @param <T> the type parameter
 * @author GungnirLaevatain
 * @version 2019 -07-02 23:45:25
 * @since JDK 11
 */
public interface IteratorContainer<T> {
    /**
     * To iterator.
     * 构建迭代器
     *
     * @return the iterator
     * @author GungnirLaevatain
     */
    Iterator<T> toIterator();
}
