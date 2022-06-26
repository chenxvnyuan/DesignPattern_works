package work6;

public class JPGImage extends Image{
    @Override
    public void HandlerImage(String image) {
        System.out.println("JPG图片格式处理器读取图片");
        filter.filter(image);
    }
}
