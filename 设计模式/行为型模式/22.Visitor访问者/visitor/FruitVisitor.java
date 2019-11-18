public class FruitVisitor implements Visitor {
    @Override
    public void visit(Apple fruit) {
        System.out.println("this is apple");
    }

    @Override
    public void visit(Banana fruit) {
        System.out.println("this is banana");
    }
}
