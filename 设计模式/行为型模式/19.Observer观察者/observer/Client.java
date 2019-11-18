package observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer = new LogObserver();
        subject.attach(observer);
        subject.updateState(1);
        subject.detach(observer);
        subject.updateState(2);
    }
}
