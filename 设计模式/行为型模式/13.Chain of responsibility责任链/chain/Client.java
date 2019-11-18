package chain;

public class Client {
    public static void main(String[] args) {
        AbstractLogHandler handler1 = new InfoLogHandler();
        AbstractLogHandler handler2 = new ErrorLogHandler();
        handler1.setNextHandler(handler2);
        handler1.log("test", "info");
    }
}
