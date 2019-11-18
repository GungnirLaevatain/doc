public class Banana implements Fruit{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
