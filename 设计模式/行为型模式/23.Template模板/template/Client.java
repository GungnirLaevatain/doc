package template;
public class Client {

    public static void main(String[] args) {
        Software idea=new Idea();
        Software eclipse=new Eclipse();
        idea.run();
        eclipse.run();
    }
}
