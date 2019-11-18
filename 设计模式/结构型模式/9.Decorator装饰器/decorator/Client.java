package decorator;

public class Client {
    public static void main(String[] args) {
        Printf printf = new FilterPrintf(new CommonPrintf());
        printf.printString("test\r\ntest");
    }
}
