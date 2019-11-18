package factory;

public class Client {
    public static void main(String[] args) {
        // 选择具体工厂类
        Factory factory = new AFactory();
        // 进行产品的创建
        Product product = factory.createProduct();
        product.getName();
    }
}
