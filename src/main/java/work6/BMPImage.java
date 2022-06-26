package work6;

public class BMPImage extends Image{
    @Override
    public void HandlerImage(String image) {
        System.out.println("BMP图片格式处理器读取图片");
        filter.filter(image);
    }
}
