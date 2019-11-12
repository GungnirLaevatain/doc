package bridge;

/**
 * The class Circle draw.
 * 画圆
 *
 * @author GungnirLaevatain
 * @version 2019 -06-05 23:40:53
 * @since JDK 11
 */
public class CircleDraw extends BaseDraw {
    /**
     * Draw.
     * 绘画
     *
     * @author GungnirLaevatain
     */
    @Override
    public void draw() {
        System.out.println("will draw circle with " + super.color.getColor());
    }
}
