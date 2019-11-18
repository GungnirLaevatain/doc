package adapter;

public class Client {
    public static void main(String[] args) {
        PngReader pngReader = new DefaultPngReader();
        Png png = new EmptyPng();
        Jpeg jpeg = new EmptyJpeg();
        // 直接读取png格式的图片
        System.out.println(pngReader.read(png));

        // jpeg的图片进行适配后再进行读取
        JpegToPngAdapter adapter = new JpegToPngAdapter(jpeg);
        System.out.println(pngReader.read(adapter));
    }
}
