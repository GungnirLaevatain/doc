package bridge;

/**
 * The class Square draw.
 * 画方
 *
 * @author GungnirLaevatain
 * @version 2019 -06-05 23:41:49
 * @since JDK 11
 */
public class SquareDraw extends BaseDraw {
    /**
     * Draw.
     * 绘画
     *
     * @author GungnirLaevatain
     */
    @Override
    public void draw() {
        System.out.println("will draw square with " + super.color.getColor());
    }
}
