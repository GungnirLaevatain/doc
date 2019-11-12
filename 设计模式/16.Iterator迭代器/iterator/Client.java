package iterator;

/**
 * The class Client.
 *
 * @author GungnirLaevatain
 * @version 2019 -07-02 23:50:36
 * @since JDK 11
 */
public class Client {
    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "c"};
        StringArrayContainer stringArrayContainer = new StringArrayContainer(array);
        Iterator<String> iterator = stringArrayContainer.toIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
