package builder;

/**
 * The class Director.
 * 导向器，使用builder进行对象的建造和配置
 *
 * @author GungnirLaevatain
 * @version 2019 -05-21 23:41:55
 * @since JDK 11
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * Construct.
     * 进行建造
     *
     * @author GungnirLaevatain
     */
    public void construct() {
        builder.buildName("test");
        builder.buildPart("body");
    }
}
