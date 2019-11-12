package proxy;

public class Client {
    public static void main(String[] args) {
        Printf printf = new CommonPrintf();
        Printf proxy = new PrintfProxy(printf);
        proxy.printf("test");
    }
}
