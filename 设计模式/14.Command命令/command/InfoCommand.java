package command;

public class InfoCommand implements Command {
    private LogReceiver logReceiver;

    public InfoCommand(LogReceiver logReceiver) {
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
        logReceiver.logInfo();
    }
}
