package iterator;

/**
 * The class String array container.
 * string数组的容器
 *
 * @author GungnirLaevatain
 * @version 2019 -07-02 23:54:55
 * @since JDK 11
 */
public class StringArrayContainer implements IteratorContainer<String> {

    private String[] array;

    public StringArrayContainer(String[] array) {
        this.array = array;
    }

    /**
     * To iterator.
     * 构建迭代器
     *
     * @return the iterator
     * @author GungnirLaevatain
     */
    @Override
    public Iterator<String> toIterator() {
        return new StringArrayIterator(array);
    }

    private class StringArrayIterator implements Iterator<String> {

        private String[] array;
        private int location;

        public StringArrayIterator(String[] array) {
            this.array = array;
            location = 0;
        }

        /**
         * Has next.
         * 是否有后续元素
         *
         * @return the boolean
         * @author GungnirLaevatain
         */
        @Override
        public boolean hasNext() {
            return location < array.length;
        }

        /**
         * Next.
         * 获取后续元素
         *
         * @return the t
         * @author GungnirLaevatain
         */
        @Override
        public String next() {
            location += 1;
            return array[location - 1];
        }
    }
}
