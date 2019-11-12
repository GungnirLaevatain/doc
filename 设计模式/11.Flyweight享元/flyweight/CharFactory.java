package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharFactory {
    private static Map<Character, Char> charMap = new HashMap<>(2);

    static {
        Char a = new A();
        Char b = new B();
        charMap.put(a.originChar(), a);
        charMap.put(b.originChar(), b);
    }

    public static Char findChar(char origin) {
        return charMap.get(origin);
    }
}
