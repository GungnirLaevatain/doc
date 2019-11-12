package abstrcatfactory;

public class Client {
    public static void main(String[] args) {
        //选择创建需要的产品对应的工厂
        AbstractFactory factory = FactoryProducer.createFactory("A");
        //由工厂创建对应的产品
        Product product = factory.create();
        //使用产品
        product.sayHello();
    }
}
