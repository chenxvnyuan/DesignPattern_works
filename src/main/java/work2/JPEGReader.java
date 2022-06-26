package work2;

/**
 * 图片读取器的具体类
 */
public class JPEGReader implements ImageReader{
    @Override
    public void readImage(String image) {
        System.out.println("JPEG图片读取器读取图片" + image);
    }
}
