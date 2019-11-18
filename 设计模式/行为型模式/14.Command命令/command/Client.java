package command;

public class Client {
    public static void main(String[] args) {
        LogReceiver logReceiver = new LogReceiver();
        Invoker invoker = new Invoker();
        ErrorCommand errorCommand = new ErrorCommand(logReceiver);
        InfoCommand infoCommand = new InfoCommand(logReceiver);
        invoker.invoke(errorCommand);
        invoker.invoke(infoCommand);
    }
}
