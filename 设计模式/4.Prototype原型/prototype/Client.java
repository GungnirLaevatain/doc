package prototype;

public class Client {
    public static void main(String[] args) {
        //生成产品原型
        AProduct aProduct = new AProduct();
        aProduct.init();
        BProduct bProduct = new BProduct();
        bProduct.init();
        //注册产品原型
        Holder.register("A", aProduct);
        Holder.register("B", bProduct);
        //想容器获取产品
        Product product = Holder.getProduct("A");
        if (product != null) {
            System.out.println(product.name());
        }
    }
}
