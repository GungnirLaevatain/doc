package visitor;
public class Client {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[]{new Apple(), new Banana()};
        Visitor visitor = new FruitVisitor();
        for (Fruit fruit : fruits) {
            fruit.accept(visitor);
        }
    }
}
