package work6;

public class GIFImage extends Image{
    @Override
    public void HandlerImage(String image) {
        System.out.println("Gif图片格式处理器读取图片");
        filter.filter(image);
    }
}
