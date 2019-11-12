package flyweight;

/**
 * The class Client.
 *
 * @author GungnirLaevatain
 * @version 2019 -06-17 21:57:53
 * @since JDK 11
 */
public class Client {
    public static void main(String[] args) {
        String source = "AABBBABA";
        int length = source.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char target = CharFactory.findChar(source.charAt(i)).targetChar();
            sb.append(target);
        }
        System.out.println(sb.toString());
    }
}
