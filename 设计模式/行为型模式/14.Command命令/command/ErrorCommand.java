package command;

public class ErrorCommand implements Command {
    private LogReceiver logReceiver;

    public ErrorCommand(LogReceiver logReceiver) {
        this.logReceiver = logReceiver;
    }

    /**
     * Execute.
     * 执行命令
     *
     * @author GungnirLaevatain
     */
    @Override
    public void execute() {
        logReceiver.logError();
    }
}
