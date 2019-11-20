package template;
public class Idea extends Software {
    @Override
    protected void init() {
        System.out.println("idea init");
    }

    @Override
    protected void destroy() {
        System.out.println("idea destroy");
    }
}
