package mediator;

public class Client {
    public static void main(String[] args) {
        Player first = new Player(30);
        Player second = new Player(30);
        BaseJudgmentMediator mediator = new JudgmentMediator(first, second);
        first.win(10, mediator);
        second.win(20, mediator);
    }
}
