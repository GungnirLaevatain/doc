package bridge;

public class Client {
    public static void main(String[] args) {
        // 准备画圆
        BaseDraw draw = new CircleDraw();
        // 使用红色
        draw.setColor(new RedColor());
        // 进行绘画
        draw.draw();
    }
}
