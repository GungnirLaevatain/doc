package visitor;
public class Apple implements Fruit {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
