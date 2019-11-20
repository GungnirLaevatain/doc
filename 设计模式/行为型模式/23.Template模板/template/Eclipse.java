package template;
public class Eclipse extends Software {
    @Override
    protected void init() {
        System.out.println("Eclipse init");
    }

    @Override
    protected void destroy() {
        System.out.println("Eclipse destroy");
    }
}
