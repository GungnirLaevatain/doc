package memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("first");
        Caretaker caretaker = new Caretaker();
        // 保存当前状态
        caretaker.saveMemento(originator.saveStateToMemento());
        // 变更状态
        originator.setState("second");
        // 恢复状态
        originator.recoveryFromMemento(caretaker.getMemento());
    }
}
