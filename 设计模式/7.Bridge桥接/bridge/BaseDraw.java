package bridge;

/**
 * The class Base draw.
 *
 * @author GungnirLaevatain
 * @version 2019 -06-05 23:38:20
 * @since JDK 11
 */
public abstract class BaseDraw {
    protected Color color;

    /**
     * Draw.
     * 绘画
     *
     * @author GungnirLaevatain
     */
    public abstract void draw();

    public void setColor(Color color) {
        this.color = color;
    }
}
