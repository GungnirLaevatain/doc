package builder;

public class Client {
    public static void main(String[] args) {
        //先选择具体的建造者
        Builder builder = new ABuilder();
        //初始化导向器
        Director director = new Director(builder);
        //进行建造
        director.construct();
        //获得产品
        Product product = builder.getProduct();
    }
}
