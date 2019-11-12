package strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println(context.operation(1, 2));
        context.setStrategy(new SubOperation());
        System.out.println(context.operation(1, 2));
    }
}
